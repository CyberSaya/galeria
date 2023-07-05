
    
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conex {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:SID"; // remplace "SID" por el SID de nuestra base de datos Oracle
    private static final String USUARIO = "nombre_usuario"; // remplace "nombre_usuario" por su nombre de usuario de Oracle
    private static final String CONTRASEÑA = "contraseña"; // remplace "contraseña" por su contraseña de Oracle
    
    public static Connection establecerConexion() throws SQLException {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            return DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        return null;
    }
}

    

