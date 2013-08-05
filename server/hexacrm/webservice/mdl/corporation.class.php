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

    class Corporation 
    {
        
        private $idCorporation;
        private $name;
        private $contact;
        private $corpName;
        private $cnpj;
        
        public function __construct() 
        {
            
            $this->idCorporation = null;
            $this->name = null;
            $this->contact = null;
            $this->corpName = null;
            $this->cnpj = null;
            
        }
        
        public function __destruct() 
        {
            
            $this->idCorporation = null;
            $this->name = null;
            $this->contact = null;
            $this->corpName = null;
            $this->cnpj = null;
            
        }
        
        public function getIdCorporation()
        {
            
            return $this->idCorporation;
            
        }
        
        public function setIdCorporation($value)
        {
            
            $this->idCorporation = $value;
            
        }
        
        public function getName()
        {
            
            return $this->name;
            
        }
        
        public function setName($value)
        {
            
            $this->name = $value;
            
        }
        
        public function getContact()
        {
            
            return $this->contact;
            
        }
        
        public function setContact($value)
        {
            
            $this->contact = $value;
            
        }
        
        public function getCorpName()
        {
            
            return $this->corpName;
            
        }
        
        public function setCorpName($value)
        {
            
            $this->corpName = $value;
            
        }
        
        public function getCnpj()
        {
            
            return $this->cnpj;
            
        }
        
        public function setCnpj($value)
        {
            
            $this->cnpj = $value;
            
        }
        
    }

?>
