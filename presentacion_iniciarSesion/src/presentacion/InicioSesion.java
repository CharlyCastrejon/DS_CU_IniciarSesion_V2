/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

/**
 *
 * @author castrejon
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import controlSesion.IValidadorAcceso;
import controlSesion.ValidadorAccesos;
import dto.UsuarioDTO;

public class InicioSesion extends JFrame {
    private JTextField txtUsuario;
    private JPasswordField txtContrasena;
    private JComboBox<String> cmbTipoUsuario;
    private JButton btnIngresar;
    private IValidadorAcceso validador;

    public InicioSesion() {
        super("Iniciar Sesión");
        validador = new ValidadorAccesos();
        initComponents();
    }

    private void initComponents() {
    JPanel panel = new JPanel();
    panel.setBackground(new Color(227,233,235,255));
    panel.setLayout(new GridBagLayout());
    panel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(10, 5, 5, 5);
    gbc.fill = GridBagConstraints.HORIZONTAL;

    JLabel lblLogo = new JLabel();
    try {
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/logo.png"));
        Image img = icon.getImage().getScaledInstance(220, 97, Image.SCALE_SMOOTH);
        lblLogo.setIcon(new ImageIcon(img));
    } catch (Exception e) {
        lblLogo.setText("LOGO");
    }
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridwidth = 2;
    gbc.anchor = GridBagConstraints.CENTER;
    panel.add(lblLogo, gbc);

    gbc.gridwidth = 1;
    gbc.anchor = GridBagConstraints.WEST;

    JLabel lblTipo = new JLabel("Tipo Usuario:");
    gbc.gridx = 0;
    gbc.gridy = 1;
    panel.add(lblTipo, gbc);

    cmbTipoUsuario = new JComboBox<>(new String[]{"Alumno", "Docente", "Administrador"});
    gbc.gridx = 0;
    gbc.gridy = 2;
    panel.add(cmbTipoUsuario, gbc);

    JLabel lblUsuario = new JLabel("Usuario:");
    gbc.gridx = 0;
    gbc.gridy = 3;
    panel.add(lblUsuario, gbc);

    txtUsuario = new JTextField(15);
    gbc.gridx = 0;
    gbc.gridy = 4;
    panel.add(txtUsuario, gbc);

    JLabel lblContrasena = new JLabel("Contraseña:");
    gbc.gridx = 0;
    gbc.gridy = 5;
    panel.add(lblContrasena, gbc);

    txtContrasena = new JPasswordField(15);
    gbc.gridx = 0;
    gbc.gridy = 6;
    panel.add(txtContrasena, gbc);

    btnIngresar = new JButton("Iniciar Sesión");
    gbc.gridx = 0;
    gbc.gridy = 7;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    panel.add(btnIngresar, gbc);

    btnIngresar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String usuario = txtUsuario.getText();
            String contrasena = new String(txtContrasena.getPassword());
            String tipo = (String) cmbTipoUsuario.getSelectedItem();

            UsuarioDTO dto = new UsuarioDTO(usuario, contrasena);
            boolean acceso = validador.validarUsuario(dto);

            if (acceso) {
                JOptionPane.showMessageDialog(null, "¡Bienvenido Carlos Alberto!\nTipo: " + tipo);
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    });

    add(panel);
    setSize(400, 500);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
}

    public static void main(String[] args) {
        new InicioSesion();
    }
}



