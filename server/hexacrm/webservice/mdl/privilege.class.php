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

    class Privilege 
    {
        
        private $idPrivilege;
        private $type;
        
        public function __construct() 
        {
            
            $this->idPrivilege = null;
            $this->type = null;
            
        }
        
        public function __destruct() 
        {
            
            $this->idPrivilege = null;
            $this->type = null;
            
        }
        
        public function getIdPrivilege()
        {
            
            return $this->idPrivilege;
            
        }
        
        public function setIdPrivilege($value)
        {
            
            $this->idPrivilege = $value;
            
        }
        
        public function getType()
        {
            
            return $this->type;
            
        }
        
        public function setType($value)
        {
            
            $this->type = $value;
            
        }
        
    }

?>
