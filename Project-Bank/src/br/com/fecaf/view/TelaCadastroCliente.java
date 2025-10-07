package br.com.fecaf.view;

import br.com.fecaf.model.Cliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroCliente extends JFrame {

    // Campos de texto
    private JTextField textNome = new JTextField();
    private JTextField textCpf = new JTextField();
    private JTextField textRg = new JTextField();
    private JTextField textEmail = new JTextField();
    private JTextField textTelefone = new JTextField();
    private JTextField textIdade = new JTextField();

    // Rótulos
    private JLabel lblNome = new JLabel("Nome:");
    private JLabel lblCpf = new JLabel("CPF:");
    private JLabel lblRg = new JLabel("RG:");
    private JLabel lblEmail = new JLabel("Email:");
    private JLabel lblTelefone = new JLabel("Telefone:");
    private JLabel lblIdade = new JLabel("Idade:");

    // Botões
    private JButton btnCadastro = new JButton("Cadastrar");
    private JButton btnLimpar = new JButton("Limpar");
    private JButton btnSair = new JButton("Sair");

    // Painel de título
    private JPanel painelTitulo = new JPanel();
    private JLabel lblTitulo = new JLabel("Cadastro de Clientes");

    public TelaCadastroCliente() {
        // Configurações da janela
        setTitle("Cadastro de Clientes");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        // Painel do título
        painelTitulo.setBounds(0, 0, 500, 50);
        painelTitulo.setLayout(null);
        painelTitulo.setBackground(new Color(211, 84, 0));

        lblTitulo.setBounds(10, 10, 300, 30);
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));

        painelTitulo.add(lblTitulo);
        add(painelTitulo);

        // Posição dos campos e rótulos
        int y = 70;

        addLabelAndField(lblNome, textNome, y);
        addLabelAndField(lblCpf, textCpf, y += 40);
        addLabelAndField(lblRg, textRg, y += 40);
        addLabelAndField(lblEmail, textEmail, y += 40);
        addLabelAndField(lblTelefone, textTelefone, y += 40);
        addLabelAndField(lblIdade, textIdade, y += 40);

        // Botões
        btnCadastro.setBounds(50, y += 50, 120, 30);
        btnLimpar.setBounds(180, y, 120, 30);
        btnSair.setBounds(310, y, 120, 30);

        add(btnCadastro);
        add(btnLimpar);
        add(btnSair);

        // Eventos
        btnCadastro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarCliente();
            }
        });

        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparCampos();
            }
        });

        btnSair.addActionListener(e -> dispose());

        // Exibir janela
        setVisible(true);
    }

    private void addLabelAndField(JLabel label, JTextField field, int y) {
        label.setBounds(30, y, 100, 25);
        field.setBounds(140, y, 300, 25);
        add(label);
        add(field);
    }

    private void cadastrarCliente() {
        try {
            Cliente cliente = new Cliente();
            cliente.setNome(textNome.getText());
            cliente.setCpf(textCpf.getText());
            cliente.setRg(textRg.getText());
            cliente.setEmail(textEmail.getText());
            cliente.setTelefone(Integer.parseInt(textTelefone.getText()));
            cliente.setIdade(Integer.parseInt(textIdade.getText()));

            JOptionPane.showMessageDialog(this,
                    "Cliente cadastrado com sucesso!\n\n" +
                            "Nome: " + cliente.getNome() + "\n" +
                            "CPF: " + cliente.getCpf() + "\n" +
                            "RG: " + cliente.getRg() + "\n" +
                            "Email: " + cliente.getEmail() + "\n" +
                            "Telefone: " + cliente.getTelefone() + "\n" +
                            "Idade: " + cliente.getIdade(),
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            limparCampos();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao cadastrar cliente. Verifique os campos numéricos (Telefone e Idade).",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limparCampos() {
        textNome.setText("");
        textCpf.setText("");
        textRg.setText("");
        textEmail.setText("");
        textTelefone.setText("");
        textIdade.setText("");
    }

}
