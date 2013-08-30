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
    require_once '../../util/text_manager.class.php';
    
    $province = new Province();
    
    $result = $province->listProvinces();
    
    if ($result != null)
    {
        
        $textMgr = new TextManager();
    
        $array = array();
        $i = 0;
        
        while ($data = mysql_fetch_array($result))
        {
            
            $array2 = array(
		'obj' => 'province',
                'idProvince' => $data['id'],
                'uf' => $textMgr->removeSpecialCharacters($data['uf']),
                'province' => $textMgr->removeSpecialCharacters($data['estado'])
            );
            
            $array[$i] = $array2;
            $i++;
            
        }
        
        echo json_encode($array);
        
    }

?>
