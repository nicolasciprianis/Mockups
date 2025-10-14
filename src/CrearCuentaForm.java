import javax.swing.*;
import java.awt.*;

public class CrearCuentaForm extends JFrame {

    public CrearCuentaForm() {
        setTitle("CREAR CUENTA");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JLabel titulo = new JLabel("CREAR CUENTA", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        add(titulo, BorderLayout.NORTH);

        JPanel panelCentral = new JPanel(new GridLayout(6, 2, 5, 5));
        panelCentral.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        panelCentral.add(new JLabel("Nombre:"));
        JTextField txtNombre = new JTextField();
        panelCentral.add(txtNombre);

        panelCentral.add(new JLabel("Email:"));
        JTextField txtEmail = new JTextField();
        panelCentral.add(txtEmail);

        panelCentral.add(new JLabel("Plan:"));
        JPanel panelPlan = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JRadioButton basico = new JRadioButton("Básico");
        JRadioButton pro = new JRadioButton("Pro");
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(basico);
        grupo.add(pro);
        panelPlan.add(basico);
        panelPlan.add(pro);
        panelCentral.add(panelPlan);

        panelCentral.add(new JLabel("País:"));
        JComboBox<String> comboPais = new JComboBox<>(new String[]{"Bolivia", "Argentina", "Chile", "Perú"});
        panelCentral.add(comboPais);

        panelCentral.add(new JLabel("Bio:"));
        JTextArea txtBio = new JTextArea(3, 15);
        panelCentral.add(new JScrollPane(txtBio));

        add(panelCentral, BorderLayout.CENTER);

        JPanel panelBotones = new JPanel(new FlowLayout());
        JButton btnCancelar = new JButton("Cancelar");
        JButton btnRegistrar = new JButton("Registrar");
        panelBotones.add(btnCancelar);
        panelBotones.add(btnRegistrar);
        add(panelBotones, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CrearCuentaForm().setVisible(true));
    }
}
