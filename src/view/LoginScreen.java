package view;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame {
    // Definição dos componentes da interface
    private JTextField usuarioField;
    private JPasswordField senhaField;
    private JButton funcionarioButton;
    private JButton clienteButton;

    // Construtor da tela de Login
    public LoginScreen() {
        // Configura o título da janela
        setTitle("Login - Banco Malvader");
        
        // Define o layout da tela (GridLayout com 3 linhas e 2 colunas)
        setLayout(new GridLayout(3, 2));

        // Criação dos componentes
        usuarioField = new JTextField();
        senhaField = new JPasswordField();
        funcionarioButton = new JButton("Entrar como Funcionário");
        clienteButton = new JButton("Entrar como Cliente");

        // Adiciona os componentes à tela
        add(new JLabel("Usuário:"));
        add(usuarioField);
        add(new JLabel("Senha:"));
        add(senhaField);
        add(funcionarioButton);
        add(clienteButton);

        // Adiciona os listeners para os botões
        funcionarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                autenticar("funcionario");
            }
        });
        
        clienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                autenticar("cliente");
            }
        });

        // Configuração da janela
        setSize(300, 150);  // Tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fechar a aplicação ao fechar a janela
        setLocationRelativeTo(null); // Centraliza a janela na tela
    }

    // Método para autenticar o usuário
    private void autenticar(String tipo) {
        String usuario = usuarioField.getText();  // Obtém o texto do campo de usuário
        String senha = new String(senhaField.getPassword());  // Obtém a senha (em formato char[])

        // Lógica simples de autenticação (exemplo estático, substitua com lógica real)
        if (usuario.equals("admin") && senha.equals("admin123")) {
            // Autenticação bem-sucedida
            JOptionPane.showMessageDialog(this, "Login bem-sucedido como " + tipo);
            // Redireciona para o menu principal
            new MenuPrincipal().setVisible(true);
            dispose();  // Fecha a tela de login
        } else {
            // Caso de falha na autenticação
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos. Tente novamente.");
        }
    }

    // Método principal para rodar a aplicação
    public static void main(String[] args) {
        // Cria a tela de login e a exibe
        new LoginScreen().setVisible(true);
    }
}
