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

    class User 
    {
        
        private $idUser;
        private $idCorporation;
        private $name;
        private $username;
        private $phone;
        private $password;
        private $access;
        private $type;
        private $token;
        private $userKey;
        
        public function __construct() 
        {
            
            $this->idUser = null;
            $this->idCorporation = null;
            $this->name = null;
            $this->username = null;
            $this->phone = null;
            $this->password = null;
            $this->access = null;
            $this->type = null;
            $this->token = null;
            $this->userKey = null;
            
        }
        
        public function __destruct() 
        {
            
            $this->idUser = null;
            $this->idCorporation = null;
            $this->name = null;
            $this->username = null;
            $this->phone = null;
            $this->password = null;
            $this->access = null;
            $this->type = null;
            $this->token = null;
            $this->userKey = null;
            
        }
        
        public function getIdUser()
        {
            
            return $this->idUser;
            
        }
        
        public function setIdUser($value)
        {
            
            $this->idUser = $value;
            
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
        
        public function getUsername()
        {
            
            return $this->username;
            
        }
        
        public function setUsername($value)
        {
            
            $this->username = $value;
            
        }
        
        public function getPhone()
        {
            
            return $this->phone;
            
        }
        
        public function setPhone($value)
        {
            
            $this->phone = $value;
            
        }
        
        public function getPassword()
        {
            
            return $this->password;
            
        }
        
        public function setPassword($value)
        {
            
            $this->password = $value;
            
        }
        
        public function getAccess()
        {
            
            return $this->access;
            
        }
        
        public function setAccess($value)
        {
            
            $this->access = $value;
            
        }
        
        public function getType()
        {
            
            return $this->type;
            
        }
        
        public function setType($value)
        {
            
            $this->type = $value;
            
        }
        
        public function getToken()
        {
            
            return $this->token;
            
        }
        
        public function setToken($value)
        {
            
            $this->token = $value;
            
        }
        
        public function getUserKey()
        {
            
            return $this->userKey;
            
        }
        
        public function setUserKey($value)
        {
            
            $this->userKey = $value;
            
        }
        
        public function logon()
        {
            
            $sql = "SELECT nome FROM usuario WHERE usuario = '".$this->getUsername()."' AND senha = '".$this->getPassword()."'";
            $db = new DBQuery();
            return $db->existsObjectQuery($sql);
            
        }
        
        public function searchUserData()
        {
            
            $sql = "SELECT id, nome, usuario, telefone, senha, acesso, tipo, empresa_gerencia_id FROM usuario WHERE usuario = '".$this->getUsername()."' AND senha = '".$this->getPassword()."'";
            $db = new DBQuery();
            return $db->searchResourceQuery($sql);
            
        }
        
    }

?>
