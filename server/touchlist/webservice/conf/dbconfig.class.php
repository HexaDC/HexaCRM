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

            $host = "mysql.geracotacao.com.br";
            $user = "geracotacao";
            $pass = "fida5012";
            $base = "geracotacao";

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
