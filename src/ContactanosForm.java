import javax.swing.*;
import java.awt.*;

public class ContactanosForm extends JFrame {

    public ContactanosForm() {
        setTitle("Contáctanos");
        setSize(350, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JLabel titulo = new JLabel("Contáctanos", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        add(titulo, BorderLayout.NORTH);

        JPanel panelCentral = new JPanel(new GridLayout(4, 2, 5, 5));
        panelCentral.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        panelCentral.add(new JLabel("Asunto:"));
        JComboBox<String> comboAsunto = new JComboBox<>(new String[]{"Consulta", "Sugerencia", "Reclamo"});
        panelCentral.add(comboAsunto);

        panelCentral.add(new JLabel("Nombre:"));
        JTextField txtNombre = new JTextField();
        panelCentral.add(txtNombre);

        panelCentral.add(new JLabel("Email:"));
        JTextField txtEmail = new JTextField();
        panelCentral.add(txtEmail);

        panelCentral.add(new JLabel("Mensaje:"));
        JTextArea txtMensaje = new JTextArea(3, 15);
        panelCentral.add(new JScrollPane(txtMensaje));

        add(panelCentral, BorderLayout.CENTER);

        JPanel panelBotones = new JPanel(new FlowLayout());
        JButton btnLimpiar = new JButton("Limpiar");
        JButton btnEnviar = new JButton("Enviar");
        panelBotones.add(btnLimpiar);
        panelBotones.add(btnEnviar);
        add(panelBotones, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ContactanosForm().setVisible(true));
    }
}
