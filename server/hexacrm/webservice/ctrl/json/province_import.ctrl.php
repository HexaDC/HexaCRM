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
    
    require_once '../../mdl/province.class.php';
    
    $province = new Province();
    
    $result = $province->listProvinces();
    
    if ($result != null)
    {
    
        $array = array();
        $i = 0;
        
        while ($data = mysql_fetch_array($result))
        {
            
            $array2 = array(
                'idProvince' => $data['id'],
                'province' => $data['estado']
            );
            
            $array[$i] = $array2;
            $i++;
            
        }
        
        echo json_encode($array);
        
    }

?>
