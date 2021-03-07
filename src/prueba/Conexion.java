package prueba;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    Connection cn = null;

    public Connection Conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/prueba", "root", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
        return cn;
    }
}
