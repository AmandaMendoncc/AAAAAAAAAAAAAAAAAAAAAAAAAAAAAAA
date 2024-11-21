package view;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuCliente extends JFrame {

    // Construtor da classe MenuCliente
    public MenuCliente() {
        // Define o título da janela
        setTitle("Menu Cliente - Banco Malvader");

        // Define o layout da tela
        setLayout(new GridLayout(6, 1)); // Organiza os botões em uma coluna com 6 linhas

        // Criação dos botões
        JButton consultarSaldoButton = new JButton("Consultar Saldo");
        JButton depositoButton = new JButton("Depósito");
        JButton saqueButton = new JButton("Saque");
        JButton extratoButton = new JButton("Extrato");
        JButton consultarLimiteButton = new JButton("Consultar Limite");
        JButton sairButton = new JButton("Sair");

        // Adiciona os botões ao layout
        add(consultarSaldoButton);
        add(depositoButton);
        add(saqueButton);
        add(extratoButton);
        add(consultarLimiteButton);
        add(sairButton);

        // Adiciona os listeners para os botões
        consultarSaldoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Redireciona para a tela de Consultar Saldo
                new ConsultarSaldoScreen().setVisible(true);
                dispose(); // Fecha o Menu Cliente
            }
        });

        depositoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Redireciona para a tela de Depósito
                new DepositoScreen().setVisible(true);
                dispose(); // Fecha o Menu Cliente
            }
        });

        saqueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Redireciona para a tela de Saque
                new SaqueScreen().setVisible(true);
                dispose(); // Fecha o Menu Cliente
            }
        });

        extratoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Redireciona para a tela de Extrato
                new ExtratoScreen().setVisible(true);
                dispose(); // Fecha o Menu Cliente
            }
        });

        consultarLimiteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Redireciona para a tela de Consultar Limite
                new ConsultarLimiteScreen().setVisible(true);
                dispose(); // Fecha o Menu Cliente
            }
        });

        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Fecha o Menu Cliente e retorna ao Menu Principal
                dispose();
                new MenuPrincipal().setVisible(true); // Retorna ao Menu Principal
            }
        });

        // Configurações adicionais da janela
        setSize(300, 300); // Define o tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha a aplicação ao fechar a janela
        setLocationRelativeTo(null); // Centraliza a janela
    }

    // Método principal para rodar a aplicação
    public static void main(String[] args) {
        // Cria e exibe a janela do Menu Cliente
        new MenuCliente().setVisible(true);
    }
}
