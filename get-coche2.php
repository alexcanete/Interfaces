<?php
    require_once("conect.php");

    //get-coche2.php
    //SELECT * FROM Coche 
    $sql = "SELECT * FROM Coche";

    $result = $conn->query($sql);

    $myArray = array();

    while($fila = mysqli_fetch_assoc($result)) {
        $myArray[] = array("id"             => $fila["id_coche"], 
                           "campo_marca"    => $fila["marca"],
                           "campo_potencia" => $fila["potencia"]);
    }

    $json = json_encode ( $myArray );
    
    echo $json;

    mysqli_close($conn);

    
?>