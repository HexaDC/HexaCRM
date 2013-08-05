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

    class Customer 
    {
        
        private $idCustomer;
        private $idCorporation;
        private $site;
        private $email;
        private $name;
        private $phone1;
        private $phone2;
        private $contact;
        private $address;
        private $homeNumber;
        private $district;
        private $city;
        private $postalCode;
        private $province;
        
        public function __construct() 
        {
            
            $this->idCustomer = null;
            $this->idCorporation = null;
            $this->site = null;
            $this->email = null;
            $this->name = null;
            $this->phone1 = null;
            $this->phone2 = null;
            $this->contact = null;
            $this->address = null;
            $this->homeNumber = null;
            $this->district = null;
            $this->city = null;
            $this->postalCode = null;
            $this->province = null;
            
        }
        
        public function __destruct() 
        {
            
            $this->idCustomer = null;
            $this->idCorporation = null;
            $this->site = null;
            $this->email = null;
            $this->name = null;
            $this->phone1 = null;
            $this->phone2 = null;
            $this->contact = null;
            $this->address = null;
            $this->homeNumber = null;
            $this->district = null;
            $this->city = null;
            $this->postalCode = null;
            $this->province = null;
            
        }
        
        public function getIdCustomer()
        {
            
            return $this->idCustomer;
            
        }
        
        public function setIdCustomer($value)
        {
            
            $this->idCustomer = $value;
            
        }
        
        public function getIdCorporation()
        {
            
            return $this->idCorporation;
            
        }
        
        public function setIdCorporation($value)
        {
            
            $this->idCorporation = $value;
            
        }
        
        public function getSite()
        {
            
            return $this->site;
            
        }
        
        public function setSite($value)
        {
            
            $this->site = $value;
            
        }
        
        public function getEmail()
        {
            
            return $this->email;
            
        }
        
        public function setEmail($value)
        {
            
            $this->email = $value;
            
        }
        
        public function getName()
        {
            
            return $this->name;
            
        }
        
        public function setName($value)
        {
            
            $this->name = $value;
            
        }
        
        public function getPhone1()
        {
            
            return $this->phone1;
            
        }
        
        public function setPhone1($value)
        {
            
            $this->phone1 = $value;
            
        }
        
        public function getPhone2()
        {
            
            return $this->phone2;
            
        }
        
        public function setPhone2($value)
        {
            
            $this->phone2 = $value;
            
        }
        
        public function getContact()
        {
            
            return $this->contact;
            
        }
        
        public function setContact($value)
        {
            
            $this->contact = $value;
            
        }
        
        public function getAddress()
        {
            
            return $this->address;
            
        }
        
        public function setAddress($value)
        {
            
            $this->address = $value;
            
        }
        
        public function getHomeNumber()
        {
            
            return $this->homeNumber;
            
        }
        
        public function setHomeNumber($value)
        {
            
            $this->homeNumber = $value;
            
        }
        
        public function getDistrict()
        {
            
            return $this->district;
            
        }
        
        public function setDistrict($value)
        {
            
            $this->district = $value;
            
        }
        
        public function getCity()
        {
            
            return $this->city;
            
        }
        
        public function setCity($value)
        {
            
            $this->city = $value;
            
        }
        
        public function getPostalCode()
        {
            
            return $this->postalCode;
            
        }
        
        public function setPostalCode($value)
        {
            
            $this->postalCode = $value;
            
        }
        
        public function getProvince()
        {
            
            return $this->province;
            
        }
        
        public function setProvince($value)
        {
            
            $this->province = $value;
            
        }
        
        public function listCustomersByCorporation()
        {
            
            $sql = "SELECT id, site, email, nome, tel_comercial_01, tel_comercial_02, contato, endereco, numero, bairro, cidade, cep, estado_id, empresa_gerencia_id FROM cliente WHERE empresa_gerencia_id = ".$this->getIdCorporation();
            $db = new DBQuery();
            return $db->searchResourceQuery($sql);
            
        }
        
    }

?>
