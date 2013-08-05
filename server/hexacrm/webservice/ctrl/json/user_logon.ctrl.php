<?php

    /**
     * HexaDC © COPYRIGHT NOTICE
     * 
     * This file is disponibilized as a part of the HexaDC's systems. 
     * All other kind of use out of the range of these company is prohibited.
     * 
     * @author William Oliveira
     * 
     * @version Benetnasch
     * 
     */

    header("Content-Type: text/html; charset=UTF-8", true);
    
    require_once '../../mdl/user.class.php';

    if (isset($_GET['json']))
    {
        
        if (! empty($_GET['json']))
        {
            
            $obj = json_decode($_GET['json'], false);
            
            $user = new User();
            $user->setUsername($obj->username);
            $user->setPassword($obj->password);
            
            if ($user->logon())
            {
                
                $result = $user->searchUserData();
                
                if ($result != null)
                {
                    
                    $data = mysql_fetch_array($result);
                    
                    $array = array(
                        'idUser' => $data['id'],
                        'idCorporation' => $data['empresa_gerencia_id'],
                        'name' => $data['nome'],
                        'username' => $data['usuario'],
                        'phone' => $data['telefone'],
                        'password' => $data['senha'],
                        'access' => $data['acesso'],
                        'type' => $data['tipo'],
                        'token' => substr(md5(uniqid(time())), 0, 40),
                        'userKey' => substr(md5(uniqid(time())), 0, 40)
                    );
                    
                    echo json_encode($array);
                    
                }
                
            }
            else 
            {
            
                echo '{}';
                
            }
            
        }
        
    }

?>
