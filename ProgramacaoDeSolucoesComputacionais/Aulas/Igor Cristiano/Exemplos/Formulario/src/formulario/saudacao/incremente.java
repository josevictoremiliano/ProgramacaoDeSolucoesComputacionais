/*
 * Criar  um programa que tenha um botão que incrente +1  e tenha um botão zerar
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class incremente extends JFrame implements ActionListener {

    private JTextField textField;
    private JButton buttonADD;
    private JButton buttonZerar;

    public incremente() {
        setTitle("Vamos incrementar numeros?");
        setSize(450, 280);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        textField = new JTextField(15);
        textField.setText("0");
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setFocusable(false);

        buttonADD = new JButton("Add +1");
        buttonZerar = new JButton("Zerar");
        buttonADD.addActionListener(this);
        buttonZerar.addActionListener(this);

        panel.add(new JLabel("Numero:"));
        panel.add(textField);
        panel.add(buttonADD);
        panel.add(buttonZerar);

        add(panel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonADD) {
            int valor = Integer.parseInt(textField.getText());
            valor++;
            textField.setText(String.valueOf(valor));
        }

        if (e.getSource() == buttonZerar) {
            textField.setText("0");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new incremente().setVisible(true);
            }
        });

    }
}
