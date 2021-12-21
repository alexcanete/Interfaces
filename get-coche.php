<?php
    require_once("conect.php");

    //get-coche.php?txtId=2
    //SELECT * FROM Coche WHERE id_coche = 2
    $sql = "SELECT * FROM Coche WHERE id_coche = " . $_GET["txtId"];

    $result = $conn->query($sql);

    $json = json_encode ( $result->fetch_assoc() );
    
    echo $json;

    mysqli_close($conn);

    
?>