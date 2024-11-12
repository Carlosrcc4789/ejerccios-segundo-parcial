package mi_tienda;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClienteGUI extends JFrame {

    private JTextField tfNombre, tfDireccion, tfTelefono, tfEmail, tfTipoDocumento, tfNumDocumento;
    private JButton btnGuardar, btnLimpiar;
    private ClienteDAO clienteDAO;

    public ClienteGUI() {
        clienteDAO = new ClienteDAO();

        setTitle("Formulario de Registro de Clientes");
        setLayout(new GridLayout(8, 2, 10, 10));


        add(new JLabel("Nombre:"));
        tfNombre = new JTextField();
        add(tfNombre);

        add(new JLabel("Dirección:"));
        tfDireccion = new JTextField();
        add(tfDireccion);

        add(new JLabel("Teléfono:"));
        tfTelefono = new JTextField();
        add(tfTelefono);

        add(new JLabel("Email:"));
        tfEmail = new JTextField();
        add(tfEmail);

        add(new JLabel("Tipo de Documento:"));
        tfTipoDocumento = new JTextField();
        add(tfTipoDocumento);

        add(new JLabel("Número de Documento:"));
        tfNumDocumento = new JTextField();
        add(tfNumDocumento);

        btnGuardar = new JButton("Guardar Cliente");
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = tfNombre.getText();
                String direccion = tfDireccion.getText();
                String telefono = tfTelefono.getText();
                String email = tfEmail.getText();
                String tipoDocumento = tfTipoDocumento.getText();
                String numDocumento = tfNumDocumento.getText();

                if (nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || email.isEmpty() || tipoDocumento.isEmpty() || numDocumento.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
                } else {

                    Cliente cliente = new Cliente(nombre, direccion, telefono, email, tipoDocumento, numDocumento);
                    boolean exito = clienteDAO.agregarCliente(cliente);
                    if (exito) {
                        JOptionPane.showMessageDialog(null, "Cliente agregado exitosamente!");
                        limpiarCampos();
                    } else {
                        JOptionPane.showMessageDialog(null, "Hubo un error al agregar el cliente.");
                    }
                }
            }
        });
        add(btnGuardar);

        btnLimpiar = new JButton("Limpiar Campos");
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
            }
        });
        add(btnLimpiar);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void limpiarCampos() {
        tfNombre.setText("");
        tfDireccion.setText("");
        tfTelefono.setText("");
        tfEmail.setText("");
        tfTipoDocumento.setText("");
        tfNumDocumento.setText("");
    }

    public static void main(String[] args) {
        new ClienteGUI();
    }
}
