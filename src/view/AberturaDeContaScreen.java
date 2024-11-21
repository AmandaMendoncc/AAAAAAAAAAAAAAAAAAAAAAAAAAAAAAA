package view;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AberturaDeContaScreen extends JFrame {
    
    // Componentes da tela
    private JTextField nomeField, cpfField, enderecoField, telefoneField;
    private JButton confirmarButton, cancelarButton;

    public AberturaDeContaScreen() {
        // Título da tela
        setTitle("Abertura de Conta - Banco Malvader");
        
        // Layout da tela
        setLayout(new GridLayout(5, 2, 10, 10)); // 5 linhas, 2 colunas, com espaçamento

        // Criação dos campos de texto
        nomeField = new JTextField(20);
        cpfField = new JTextField(15);
        enderecoField = new JTextField(20);
        telefoneField = new JTextField(15);

        // Botões
        confirmarButton = new JButton("Confirmar Abertura");
        cancelarButton = new JButton("Cancelar");

        // Adicionando os componentes ao layout
        add(new JLabel("Nome:"));
        add(nomeField);
        add(new JLabel("CPF:"));
        add(cpfField);
        add(new JLabel("Endereço:"));
        add(enderecoField);
        add(new JLabel("Telefone:"));
        add(telefoneField);
        add(confirmarButton);
        add(cancelarButton);

        // Ação do botão Confirmar Abertura
        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Validação dos dados inseridos
                if (validarCampos()) {
                    // Criar a conta do cliente
                    criarConta();
                    // Exibir mensagem de sucesso
                    JOptionPane.showMessageDialog(AberturaDeContaScreen.this, "Conta criada com sucesso!");
                    // Fechar a tela e voltar ao Menu Funcionário
                    dispose();
                    new MenuFuncionario().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(AberturaDeContaScreen.this, "Por favor, preencha todos os campos corretamente.");
                }
            }
        });

        // Ação do botão Cancelar
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Fechar a tela e voltar ao Menu Funcionário
                dispose();
                new MenuFuncionario().setVisible(true);
            }
        });

        // Configurações adicionais da janela
        setSize(400, 300); // Tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fechar a aplicação ao fechar a janela
        setLocationRelativeTo(null); // Centralizar a janela
    }

    // Método para validar os campos de entrada
    private boolean validarCampos() {
        // Verifica se algum campo está vazio
        return !nomeField.getText().isEmpty() && !cpfField.getText().isEmpty() && 
               !enderecoField.getText().isEmpty() && !telefoneField.getText().isEmpty();
    }

    // Método para criar a conta do cliente
    private void criarConta() {
        // Obter os dados dos campos
        String nome = nomeField.getText();
        String cpf = cpfField.getText();
        String endereco = enderecoField.getText();
        String telefone = telefoneField.getText();

        // Aqui você pode criar a lógica para salvar o cliente no banco de dados
        // ou em uma estrutura de dados na memória.

        // Exemplo de como você poderia salvar:
        // Cliente cliente = new Cliente(nome, cpf, endereco, telefone);
        // BancoController.criarConta(cliente); // Exemplo de como registrar o cliente no sistema
    }

    // Método principal para rodar a aplicação
    public static void main(String[] args) {
        // Cria e exibe a tela de Abertura de Conta
        new AberturaDeContaScreen().setVisible(true);
    }
}
