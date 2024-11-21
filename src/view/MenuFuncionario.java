package view;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFuncionario extends JFrame {

    // Construtor da classe MenuFuncionario
    public MenuFuncionario() {
        // Define o título da janela
        setTitle("Menu Funcionário - Banco Malvader");

        // Define o layout da tela
        setLayout(new GridLayout(6, 1)); // Organiza os botões em uma coluna com 6 linhas

        // Criação dos botões
        JButton aberturaDeContaButton = new JButton("Abertura de Conta");
        JButton encerramentoDeContaButton = new JButton("Encerramento de Conta");
        JButton cadastroFuncionarioButton = new JButton("Cadastro de Funcionário");
        JButton relatoriosButton = new JButton("Geração de Relatórios");
        JButton voltarButton = new JButton("Voltar para Menu Principal");
        JButton sairButton = new JButton("Sair");

        // Adiciona os botões ao layout
        add(aberturaDeContaButton);
        add(encerramentoDeContaButton);
        add(cadastroFuncionarioButton);
        add(relatoriosButton);
        add(voltarButton);
        add(sairButton);

        // Adiciona os listeners para os botões
        aberturaDeContaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Redireciona para a tela de Abertura de Conta
                new AberturaDeContaScreen().setVisible(true);
                dispose(); // Fecha o Menu Funcionário
            }
        });

        encerramentoDeContaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Redireciona para a tela de Encerramento de Conta
                new EncerramentoDeContaScreen().setVisible(true);
                dispose(); // Fecha o Menu Funcionário
            }
        });

        cadastroFuncionarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Redireciona para a tela de Cadastro de Funcionário
                new CadastroFuncionarioScreen().setVisible(true);
                dispose(); // Fecha o Menu Funcionário
            }
        });

        relatoriosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Redireciona para a tela de Geração de Relatórios
                new RelatoriosScreen().setVisible(true);
                dispose(); // Fecha o Menu Funcionário
            }
        });

        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Redireciona de volta para o Menu Principal
                new MenuPrincipal().setVisible(true);
                dispose(); // Fecha o Menu Funcionário
            }
        });

        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Fecha o Menu Funcionário e retorna ao Login
                dispose();
                new LoginScreen().setVisible(true); // Retorna para o login
            }
        });

        // Configurações adicionais da janela
        setSize(300, 300); // Define o tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha a aplicação ao fechar a janela
        setLocationRelativeTo(null); // Centraliza a janela
    }

    // Método principal para rodar a aplicação
    public static void main(String[] args) {
        // Cria e exibe a janela do Menu Funcionário
        new MenuFuncionario().setVisible(true);
    }
}
