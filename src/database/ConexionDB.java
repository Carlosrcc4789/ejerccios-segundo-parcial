package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static final String URL ="jdbc:mysql://localhost:3306/db_prueba";
    private static final String USER="root";
    private static final String PASSWORD="";
    private static Connection getConnection() throws SQLException{
        if (conexion == null || conexion.isClosed()){
            try {
                conexion = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("conexion establecida");
            }catch (SQLException e){
                System.out.println("Error al conectar con la base de datos");
                thow e;
            }
            return conexion;
        }
        public static void cerrarConexion()throws SQLException{
            if (conexion)!=null){
    try{
        conexion.close();
        System.out.println("conexion cerrada");
        }catch (SQLException e){
        System.out.println("error al cerrar conexion");
        throw e;
    }

                }
            }
        }

}
