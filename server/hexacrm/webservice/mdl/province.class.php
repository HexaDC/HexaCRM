<?php

    /**
     * HexaDC © COPYRIGHT NOTICE
     * 
     * This class is disponibilized as a part of the HexaDC's systems. 
     * All other kind of use out of the range of these company is prohibited.
     * 
     * @author William Oliveira
     * 
     * @version Benetnasch
     * 
     */

    require_once "../../util/dbquery.class.php";

    class Province 
    {
        
        private $idProvince;
        private $province;
        
        public function __construct() 
        {
            
            $this->idProvince = null;
            $this->province = null;
            
        }
        
        public function __destruct() 
        {
            
            $this->idProvince = null;
            $this->province = null;
            
        }
        
        public function getIdProvince()
        {
            
            return $this->idProvince;
            
        }
        
        public function setIdProvince($value)
        {
            
            $this->idProvince = $value;
            
        }
        
        public function getProvince()
        {
            
            return $this->province;
            
        }
        
        public function setProvince($value)
        {
            
            $this->province = $value;
            
        }
        
        public function listProvinces()
        {
            
            $sql = "SELECT id, estado FROM estado";
            $db = new DBQuery();
            return $db->searchResourceQuery($sql);
            
        }
        
    }

?>
