import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame {

    public LoginForm() {
        setTitle("MI APLICACIÓN");
        setSize(300, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Título
        JLabel titulo = new JLabel("MI APLICACIÓN", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        add(titulo, BorderLayout.NORTH);

        // Panel central con campos
        JPanel panelCentral = new JPanel(new GridLayout(4, 2, 5, 5));
        panelCentral.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        panelCentral.add(new JLabel("Usuario:"));
        JTextField txtUsuario = new JTextField();
        panelCentral.add(txtUsuario);

        panelCentral.add(new JLabel("Clave:"));
        JPasswordField txtClave = new JPasswordField();
        panelCentral.add(txtClave);

        JCheckBox recordar = new JCheckBox("Recordarme");
        panelCentral.add(new JLabel()); // espacio vacío
        panelCentral.add(recordar);

        add(panelCentral, BorderLayout.CENTER);

        // Botón entrar
        JPanel panelBoton = new JPanel(new GridLayout(2, 1));
        JButton btnEntrar = new JButton("Entrar");
        panelBoton.add(btnEntrar);

        JLabel olvidar = new JLabel("¿Olvidaste tu clave?", SwingConstants.CENTER);
        panelBoton.add(olvidar);

        add(panelBoton, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginForm().setVisible(true));
    }
}
