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
    require_once '../../util/text_manager.class.php';
            
    $customer = new Customer();
    $result = $customer->listCustomers();
            
    if ($result != null)
    {
        
        $textMgr = new TextManager();
                
        $array = array();
        $i = 0;
                
        while ($data = mysql_fetch_array($result))
        {
                    
            $array2 = array(
		'obj' => 'customer',
                'idCustomer' => $data['id'],
                'site' => $textMgr->removeSpecialCharacters($data['site']),
                'email' => $textMgr->removeSpecialCharacters($data['email']),
                'name' => $textMgr->removeSpecialCharacters($data['nome']),
                'phone1' => $textMgr->removeSpecialCharacters($data['tel_comercial_01']),
                'phone2' => $textMgr->removeSpecialCharacters($data['tel_comercial_02']),
                'contact' => $textMgr->removeSpecialCharacters($data['contato']),
                'address' => $textMgr->removeSpecialCharacters($data['endereco']),
                'homeNumber' => $textMgr->removeSpecialCharacters($data['numero']),
                'district' => $textMgr->removeSpecialCharacters($data['bairro']),
                'city' => $textMgr->removeSpecialCharacters($data['cidade']),
                'postalCode' => $textMgr->removeSpecialCharacters($data['cep']),
                'idProvince' => $data['uf_estados_id']
            );
                    
            $array[$i] = $array2;
            $i++;
                    
        }
                
        echo json_encode($array);
                
    }

?>
