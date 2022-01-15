package ui;

import conexao.Conexao;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.Socket;

public class Registar_UI extends JFrame{
    private JPanel panel1;
    private JTextField nomeField;
    private JTextField passwordField;
    private JLabel nomeLabel;
    private JLabel passLabel;
    private JButton confirmarButton;

    private Socket socket;
    private Conexao conexao;

    public Registar_UI(Socket sock, Conexao conect) {
        this.socket = sock;
        this.conexao = conect;

        setActions();

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //Ainda não sei como mas será para salvar no estado atual
                //e será para salvar os dados
                //usar enum do encerrar
                //ln.save();
            }
        });

        this.setTitle("Registar Utilizador");
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);


    }

    private void setActions() {
        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}