<html>
    <head></head>
    <body>
    

        <?php
            $nombre = $_POST["txtNombre"];
            $apellido = $_POST["txtApellido"];
          
            echo '<b>'; 
            echo 'Te llamas ' . $nombre . ' ' . $apellido. ;
            echo '</b>';
            if(!$conn){
                    echo "Error: no va";
            }else{
                    echo "Conexion correcta";
            }

        ?>
    
    </body>

</html> 
