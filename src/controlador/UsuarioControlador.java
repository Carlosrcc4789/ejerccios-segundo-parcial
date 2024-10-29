package controlador;

import modelo.Usuario;
import modelo.UsuarioDAO;
import vista.UsuarioVista;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class UsuarioControlador {
        private UsuarioDAO=usuarioDAO;
        private vista.UsuarioVista=usuarioVista;
        public UsuarioControlador(UsuarioDAO usuarioDAO , vista.UsuarioVista usuarioVista){
            this.usuarioDAO =usuraioDAO;
            this.usuariovista = usuarioVista;
        }
        public void listarUsuarios(){
            List<Usuario> usuarios = usuarioDAO.obtenerUsuarios();
            usuarioVista.mostrarUsuarios(usuarios);
        }
        public void agregarUsuario() throws SQLException {
            Scanner sc = new Scanner(System.in);
            System.out.println("ingrese el nomnre :");
            String nombre = sc.nextLine();
            System.out.println("ingrese el correo:");
            String email = sc.nextLine();

            usuarioDAO.agregarUsuario(nombre,email);
            System.out.println("usuario agregado con exito");
        }
    }


