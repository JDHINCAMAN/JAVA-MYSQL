package bd_registro;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    private Conexion() {
        
    }
    
    // variable para guardar el estado de la conexion a la bd
    private static Connection conexion;
    
    // variable para crear una sola instancia
    private static Conexion instancia;
    
    // variables para conectarse a la bd
    private static final String URI = "jdbc:mysql://localhost/bd_registros";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    // metodo para conectarse a la bd
    public Connection conectarBD() {
        try {
            //cargar el driver el driver para conectarse a la bd
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URI, USERNAME, PASSWORD);
            
            return conexion;
            
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return conexion;
    }
    
    // metodo para cerrar la conexion
    public void cerrarConexion() throws SQLException {
        try {
            conexion.close();
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            conexion.close();
        } finally {
            conexion.close();
        }
    }
    
    public static Conexion getInstance() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }
}
