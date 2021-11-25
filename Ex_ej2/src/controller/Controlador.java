package controller;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import view.Principal;

public class Controlador {

    public static Connection con;
    
        
    
    public static void executeQuery(String Query) throws SQLException{
    

    
            //mandar query a la base de datos
        Statement miOrden = dbms.DataBase.getCon().createStatement();
        miOrden.execute(Query);

        ResultSet resultado = miOrden.getResultSet();

    }

    public static String createQuery(String Query){
        Query = "INSERT INTO CASAS(ID_CASAS, POBLACION, SUPERFICIE, ASEOS) VALUES (SEQ_CASAS2.NEXTVAL,"+model.Casa.getiPoblacion()+ " ," + model.Casa.getdSuperficie()+ " ," +model.Casa.getiAseos()+ ");COMMIT;";
        return Query;
        

    }

}
