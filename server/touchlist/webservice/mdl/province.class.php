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
        
	private $obj;
        private $idProvince;
        private $uf;
        private $province;
        
        public function __construct() 
        {
            
	    $this->obj = "province";
            $this->idProvince = null;
            $this->uf = null;
            $this->province = null;
            
        }
        
        public function __destruct() 
        {
            
	    $this->obj = null;
            $this->idProvince = null;
            $this->uf = null;
            $this->province = null;
            
        }

	public function getObj()
        {
            
            return $this->obj;
            
        }
        
        public function getIdProvince()
        {
            
            return $this->idProvince;
            
        }
        
        public function setIdProvince($value)
        {
            
            $this->idProvince = $value;
            
        }
        
        public function getUf()
        {
            
            return $this->uf;
            
        }
        
        public function setUf($value)
        {
            
            $this->uf = $value;
            
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
            
            mysql_set_charset("UTF8");
            
            $sql = "SELECT id, uf, estado FROM uf_estados";
            $db = new DBQuery();
            return $db->searchResourceQuery($sql);
            
        }
        
    }

?>
