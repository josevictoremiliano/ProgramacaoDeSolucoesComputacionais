/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formulario.saldacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author 12824131860
 */
public class Saudacao extends JFrame implements ActionListener{
    private JTextField textField;
    private JButton button;

    public Saudacao(){
        setTitle("Bem Vindo");
        setSize(240, 250);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        //Criando e adicionando componentes
        JPanel panel = new JPanel();
        textField = new JTextField(15);
        button = new JButton("Enviar");        
        button.addActionListener(this);

        panel.add(new JLabel("Digite seu nome:"));
        panel.add(textField);
        panel.add(button);

        add(panel);

       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            String nome = textField.getText();
            String mensagem = "Olá, " + nome + "!";

            JOptionPane.showConfirmDialog(this, mensagem);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Saudacao().setVisible(true);
            }
        });
        
    }
}
