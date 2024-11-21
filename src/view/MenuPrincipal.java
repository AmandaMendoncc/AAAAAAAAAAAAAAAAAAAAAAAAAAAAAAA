package view;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame {
    
    // Construtor da classe MenuPrincipal
    public MenuPrincipal() {
        // Configura o título da janela
        setTitle("Menu Principal - Banco Malvader");
        
        // Define o layout da tela
        setLayout(new FlowLayout());

        // Criação dos botões
        JButton funcionarioButton = new JButton("Menu Funcionário");
        JButton clienteButton = new JButton("Menu Cliente");
        JButton sairButton = new JButton("Sair");

        // Adiciona os botões à tela
        add(funcionarioButton);
        add(clienteButton);
        add(sairButton);

        // Adiciona os listeners para os botões
        funcionarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Redireciona para o Menu Funcionário
                new MenuFuncionario().setVisible(true);
                dispose(); // Fecha o MenuPrincipal
            }
        });

        clienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Redireciona para o Menu Cliente
                new MenuCliente().setVisible(true);
                dispose(); // Fecha o MenuPrincipal
            }
        });

        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Fecha a aplicação e retorna para o Login
                dispose();  // Fecha o MenuPrincipal
                new LoginScreen().setVisible(true);  // Retorna para a tela de login
            }
        });

        // Configuração da janela
        setSize(300, 150);  // Tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha a aplicação ao fechar a janela
        setLocationRelativeTo(null); // Centraliza a janela na tela
    }

    // Método principal para rodar a aplicação
    public static void main(String[] args) {
        // Cria a tela de Menu Principal e a exibe
        new MenuPrincipal().setVisible(true);
    }
}
