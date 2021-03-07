package prueba;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Crud {
    Conexion conexion = new Conexion();
    Connection cn = conexion.Conectar();
    public void Insertar() {
        try {
            String sql = "INSERT INTO users (user,password) VALUES(?,?) ";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, "usuario@correo.com");
            ps.setString(2, "123456");
            ps.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
    

}
