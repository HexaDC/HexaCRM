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

    class TextManager 
    {
        
        public function __construct()
        {
            
            
            
        }
        
        public function __destruct()
        {
            
            
            
        }
        
        public function removeSpecialCharacters($nomes) 
        {
            
            $nomes = str_replace("Ç","C",$nomes);
            $nomes = str_replace("ç","c",$nomes);
            $nomes = str_replace("à","a",$nomes);
            $nomes = str_replace("À","A",$nomes);
            $nomes = str_replace("á","a",$nomes);
            $nomes = str_replace("Á","A",$nomes);
            $nomes = str_replace("ã","a",$nomes);
            $nomes = str_replace("Ã","A",$nomes);
            $nomes = str_replace("â","a",$nomes);
            $nomes = str_replace("Â","A",$nomes);
            $nomes = str_replace("é","e",$nomes);
            $nomes = str_replace("É","E",$nomes);
            $nomes = str_replace("è","e",$nomes);
            $nomes = str_replace("È","E",$nomes);
            $nomes = str_replace("ê","e",$nomes);
            $nomes = str_replace("Ê","E",$nomes);
            $nomes = str_replace("í","i",$nomes);
            $nomes = str_replace("Í","I",$nomes);
            $nomes = str_replace("ì","i",$nomes);
            $nomes = str_replace("Ì","I",$nomes);
            $nomes = str_replace("ó","o",$nomes);
            $nomes = str_replace("Ó","O",$nomes);
            $nomes = str_replace("ò","o",$nomes);
            $nomes = str_replace("Ò","O",$nomes);
            $nomes = str_replace("õ","o",$nomes);
            $nomes = str_replace("ô","o",$nomes);
            $nomes = str_replace("Ô","O",$nomes);
            $nomes = str_replace("ú","u",$nomes);
            $nomes = str_replace("Ú","U",$nomes);
            $nomes = str_replace("ù","u",$nomes);
            $nomes = str_replace("Ù","U",$nomes);
            
            return $nomes;
            
        }
        
    }

?>
