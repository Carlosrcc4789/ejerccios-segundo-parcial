package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private Connection conexion;
    public UsuarioDAO(Connection conexion){
        List<Usuario> usuarios=new ArrayList<>();
        String sql ="SELECT id, nombre,email FROM usuarios";
        try (PreparedStatement statement = conexion.prepareStatement(sql));
        ResultSet resultSet = statement.executeQuery();{
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString(nombre);
                String email = resultSet.getString("email");
                usuario usuario = new Usuario(id,nombre,email);
                usuario.add(usuario);

            }
        }catch (SQLException e){
            throw new RuntimeException("Error al obtener los usurarios"+e.getMessage)
        }
        return usuarios;
    }
    public void agregarUsuario(String nombre,String email)throws  SQLException{
        String sql ="insert into usurios (nombre,email)VALUES(?,?)";
        try(preparedStratement stmt = conexion.prepareSTATEMENT(SQL)){
            stmt.setString(1,nombre);
            stmt.setString(2,email);
            stm.executeUPdate();
        }cath(SQLException e){
            thow new runtimeEXception("error al obtenerlos usuarios"+e.getMessage(),e);
        }
    }

}
