package tienda_de_celular;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

class MySQLConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/tienda_celulares";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos MySQL");

            Statement stmt = conn.createStatement();

            String sql = "SELECT * FROM cliente";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int idcliente = rs.getInt("idcliente");
                String nombre = rs.getString("nombre");
                System.out.println("ID: " + idcliente + ", Nombre: " + nombre);
            }

        } catch (ClassNotFoundException e) {
            System.err.println("Error al cargar el driver JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Error de conexión o ejecución SQL: " + e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}
