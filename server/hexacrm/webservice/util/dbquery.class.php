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

    require_once "../../conf/dbconfig.class.php";

    class DBQuery 
    {

        public function __construct() 
        {

        }

        public function __destruct() 
        {

        }

        public function insertQuery($sql) 
        {

            return mysql_query($sql);

        }

        public function searchQuery($sql) 
        {

            $data = mysql_query($sql);
            
            if ($data != false) 
                $data = mysql_fetch_array($data);
            else 
                $data = null;
            
            return $data;

        }

        public function searchResourceQuery($sql) 
        {

            $data = mysql_query($sql);

            if ($data == false) 
                $data = null;

            return $data;

        }

        public function existsObjectQuery($sql) 
        {

            $query = mysql_query($sql);
            
            if ($query != false) 
            {
                
                $rows = mysql_num_rows($query);
                
                if ($rows > 0)
                    return true;
                else if ($rows == 0)
                    return false;
                else
                    return false;
                
            } 
            else 
                return false;

        }

        public function counterObjects($sql) 
        {
            
            $query = mysql_query($sql);
            
            if ($query != null)
                return mysql_num_rows($query);
            else
                return 0;
            
        }

        public function updateQuery($sql) 
        {

            return mysql_query($sql);

        }

        public function deleteQuery($sql) 
        {

            return mysql_query($sql);

        }

    }

?>
