package mi_tienda;

import java.sql.*;

public class ClienteDAO {

    public boolean agregarCliente(Cliente cliente) {
        String query = "INSERT INTO cliente (nombre, direccion, telefono, email, tipo_documento, num_documento) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection con = ConexionDB.getConnection();
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, cliente.getNombre());
            pst.setString(2, cliente.getDireccion());
            pst.setString(3, cliente.getTelefono());
            pst.setString(4, cliente.getEmail());
            pst.setString(5, cliente.getTipo_documento());
            pst.setString(6, cliente.getNum_documento());

            return pst.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
