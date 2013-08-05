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

    class Connection 
    {

        function connect() 
        {

            $host = "mysql.hexadc.com.br";
            $user = "hexacrm";
            $pass = "asgard2!";
            $base = "hexacrm";

            $conn = mysql_connect($host, $user, $pass) or die("");

            if ($conn) 
            {
                
                $db = mysql_select_db($base, $conn) or die("");
                
            } 
            else 
            {
                
                echo mysql_error();
                
            }

        }

    }

    $con = new Connection;
    $con->connect();

?>
