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
    
    require_once '../../mdl/customer.class.php';
    
    if (isset($_GET['json']))
    {
        
        if (! empty($_GET['json']))
        {
            
            $obj = json_decode($_GET['json'], false);
            
            $customer = new Customer();
            $customer->setIdCorporation($obj->idCorporation);
            
            $result = $customer->listCustomersByCorporation();
            
            if ($result != null)
            {
                
                $array = array();
                $i = 0;
                
                while ($data = mysql_fetch_array($result))
                {
                    
                    $array2 = array(
                        'idCustomer' => $data['id'],
                        'idCorporation' => $data['empresa_gerencia_id'],
                        'site' => $data['site'],
                        'email' => $data['email'],
                        'name' => $data['nome'],
                        'phone1' => $data['tel_comercial_01'],
                        'phone2' => $data['tel_comercial_02'],
                        'contact' => $data['contato'],
                        'address' => $data['endereco'],
                        'homeNumber' => $data['numero'],
                        'district' => $data['bairro'],
                        'city' => $data['cidade'],
                        'postalCode' => $data['cep'],
                        'province' => $data['estado_id']
                    );
                    
                    $array[$i] = $array2;
                    $i++;
                    
                }
                
                echo json_encode($array);
                
            }
            
        }
        
    }

?>
