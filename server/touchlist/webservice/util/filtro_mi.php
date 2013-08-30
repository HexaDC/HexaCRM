<?php
//===============================================================================================
//CRIANDO FUNÇÃO PARA FILTRAGEM DE CARACTERES ESPECIAIS E INJEÇÃO SQL.
// VERIFICANDO INJECTION E CARACTERES ESPECIAIS
function trocar_mi($trocar_mi){ // VARIAVEL QUE RECEBE INFORMAÇÕES PARA FILTRAGEM
	$msg = "#"; // DEFININDO O TIPO DE TROCA CASO SEJA NECESSARIO.
	$trocar_mi = strtolower($trocar_mi); // MANTÉM CARACTERES EM MINUSCULOS.

// TROCAR ACENTOS E MINUSCULAS PRA MAIUSCULAS ============
        $trocar_mi = str_replace(" ","+",$trocar_mi);
	$trocar_mi = str_replace("Ç","C",$trocar_mi);
	$trocar_mi = str_replace("ç","c",$trocar_mi);
	$trocar_mi = str_replace("à","a",$trocar_mi);
	$trocar_mi = str_replace("À","A",$trocar_mi);
	$trocar_mi = str_replace("á","a",$trocar_mi);
	$trocar_mi = str_replace("Á","A",$trocar_mi);
	$trocar_mi = str_replace("ã","a",$trocar_mi);
	$trocar_mi = str_replace("Ã","A",$trocar_mi);
	$trocar_mi = str_replace("â","a",$trocar_mi);
	$trocar_mi = str_replace("Â","A",$trocar_mi);
	$trocar_mi = str_replace("é","e",$trocar_mi);
	$trocar_mi = str_replace("É","E",$trocar_mi);
	$trocar_mi = str_replace("è","e",$trocar_mi);
	$trocar_mi = str_replace("È","E",$trocar_mi);
	$trocar_mi = str_replace("ê","e",$trocar_mi);
	$trocar_mi = str_replace("Ê","E",$trocar_mi);
	$trocar_mi = str_replace("í","i",$trocar_mi);
	$trocar_mi = str_replace("Í","I",$trocar_mi);
	$trocar_mi = str_replace("ì","i",$trocar_mi);
	$trocar_mi = str_replace("Ì","I",$trocar_mi);
	$trocar_mi = str_replace("ó","o",$trocar_mi);
	$trocar_mi = str_replace("Ó","O",$trocar_mi);
	$trocar_mi = str_replace("ò","o",$trocar_mi);
	$trocar_mi = str_replace("Ò","O",$trocar_mi);
	$trocar_mi = str_replace("õ","o",$trocar_mi);
	$trocar_mi = str_replace("Ô","O",$trocar_mi);
	$trocar_mi = str_replace("ú","u",$trocar_mi);
	$trocar_mi = str_replace("Ú","u",$trocar_mi);
	$trocar_mi = str_replace("ù","u",$trocar_mi);
	$trocar_mi = str_replace("Ù","U",$trocar_mi);
	return $trocar_mi; // RETORNA VALORES OBTIDOS
} //FIM DA FUNÇÃO TROCAR

function mais($mais){
    $mais = str_replace(" ", "+", $mais);
    return $mais;
}

function nomes($nomes){
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
	$nomes = str_replace("Ô","O",$nomes);
	$nomes = str_replace("ú","u",$nomes);
	$nomes = str_replace("Ú","U",$nomes);
	$nomes = str_replace("ù","u",$nomes);
	$nomes = str_replace("Ù","U",$nomes);
                  $nomes = str_replace(" ", "+", $nomes);
    return $nomes;
}

function trocar_email ($trocar_email){
    	// CARACTERES ESPECIAIS ====================================
	$trocar_email = str_replace("¨","$msg",$trocar_email);
	$trocar_email = str_replace("(","$msg",$trocar_email);
	$trocar_email = str_replace("`","$msg",$trocar_email);
        $trocar_email = str_replace("'","",$trocar_email);
	$trocar_email = str_replace("^","$msg",$trocar_email);
	$trocar_email = str_replace("~","$msg",$trocar_email);
	$trocar_email = str_replace(")","$msg",$trocar_email);
	$trocar_email = str_replace("=","$msg",$trocar_email);
	$trocar_email = str_replace("'","$msg",$trocar_email);
	$trocar_email = str_replace("!","$msg",$trocar_email);
	$trocar_email = str_replace("+","$msg",$trocar_email);
	$trocar_email = str_replace("*","$msg",$trocar_email);
	$trocar_email = str_replace("%","$msg",$trocar_email);
	$trocar_email = str_replace(";","$msg",$trocar_email);
	$trocar_email = str_replace("<","$msg",$trocar_email);
	$trocar_email = str_replace(">","$msg",$trocar_email);
	$trocar_email = str_replace("&","$msg",$trocar_email);
	$trocar_email = str_replace("$","$msg",$trocar_email);
	$trocar_email = str_replace("|","$msg",$trocar_email);
	$trocar_email = str_replace("?","$msg",$trocar_email);
	$trocar_email = str_replace("!","$msg",$trocar_email);
	$trocar_email = str_replace("[","$msg",$trocar_email);
	$trocar_email = str_replace("]","$msg",$trocar_email);
	$trocar_email = str_replace("§","$msg",$trocar_email);
	$trocar_email = str_replace(" ","",$trocar_email);

	// ALFABETO COMPLETO ** A - Z
	$trocar_email = str_replace("A","a",$trocar_email);
	$trocar_email = str_replace("B","b",$trocar_email);
	$trocar_email = str_replace("C","c",$trocar_email);
	$trocar_email = str_replace("D","d",$trocar_email);
	$trocar_email = str_replace("E","e",$trocar_email);
	$trocar_email = str_replace("F","f",$trocar_email);
	$trocar_email = str_replace("G","g",$trocar_email);
	$trocar_email = str_replace("H","h",$trocar_email);
	$trocar_email = str_replace("I","i",$trocar_email);
	$trocar_email = str_replace("J","j",$trocar_email);
	$trocar_email = str_replace("K","k",$trocar_email);
	$trocar_email = str_replace("L","l",$trocar_email);
	$trocar_email = str_replace("M","m",$trocar_email);
	$trocar_email = str_replace("N","n",$trocar_email);
	$trocar_email = str_replace("O","o",$trocar_email);
	$trocar_email = str_replace("P","p",$trocar_email);
	$trocar_email = str_replace("Q","q",$trocar_email);
	$trocar_email = str_replace("R","r",$trocar_email);
	$trocar_email = str_replace("S","s",$trocar_email);
	$trocar_email = str_replace("T","t",$trocar_email);
	$trocar_email = str_replace("U","u",$trocar_email);
	$trocar_email = str_replace("V","v",$trocar_email);
	$trocar_email = str_replace("X","x",$trocar_email);
	$trocar_email = str_replace("W","w",$trocar_email);
	$trocar_email = str_replace("Y","y",$trocar_email);
	$trocar_email = str_replace("Z","z",$trocar_email);

	// TROCAR ACENTOS E MINUSCULAS PRA MAIUSCULAS ============
	$trocar_email = str_replace("Ç","c",$trocar_email);
	$trocar_email = str_replace("ç","c",$trocar_email);
	$trocar_email = str_replace("à","a",$trocar_email);
	$trocar_email = str_replace("À","a",$trocar_email);
	$trocar_email = str_replace("á","a",$trocar_email);
	$trocar_email = str_replace("Á","a",$trocar_email);
	$trocar_email = str_replace("ã","a",$trocar_email);
	$trocar_email = str_replace("Ã","a",$trocar_email);
	$trocar_email = str_replace("â","a",$trocar_email);
	$trocar_email = str_replace("Â","a",$trocar_email);
	$trocar_email = str_replace("é","e",$trocar_email);
	$trocar_email = str_replace("É","e",$trocar_email);
	$trocar_email = str_replace("è","e",$trocar_email);
	$trocar_email = str_replace("È","e",$trocar_email);
	$trocar_email = str_replace("ê","e",$trocar_email);
	$trocar_email = str_replace("Ê","e",$trocar_email);
	$trocar_email = str_replace("í","i",$trocar_email);
	$trocar_email = str_replace("Í","i",$trocar_email);
	$trocar_email = str_replace("ì","i",$trocar_email);
	$trocar_email = str_replace("Ì","i",$trocar_email);
	$trocar_email = str_replace("ó","o",$trocar_email);
	$trocar_email = str_replace("Ó","o",$trocar_email);
	$trocar_email = str_replace("ò","o",$trocar_email);
	$trocar_email = str_replace("Ò","o",$trocar_email);
	$trocar_email = str_replace("õ","o",$trocar_email);
	$trocar_email = str_replace("Ô","o",$trocar_email);
        $trocar_email = str_replace("ô","o",$trocar_email);
	$trocar_email = str_replace("ú","u",$trocar_email);
	$trocar_email = str_replace("Ú","u",$trocar_email);
	$trocar_email = str_replace("ù","u",$trocar_email);
	$trocar_email = str_replace("Ù","u",$trocar_email);
	return $trocar_email; // RETORNA VALORES OBTIDOS

}
//===============================================================================================
?>