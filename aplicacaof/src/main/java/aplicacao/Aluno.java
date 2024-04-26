/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacao;

/**
 *
 * @author ph863
 */
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Aluno {
    ArrayList<String> listaAlunos = new ArrayList<>();

    void cadastrarAluno() {
        JTextField Jnome = new JTextField(10);
        JTextField Jemail = new JTextField(10);

        JPanel tela = new JPanel(new GridLayout(0, 1));
        tela.add(new JLabel("Digite seu Nome:"));
        tela.add(Jnome);
        tela.add(new JLabel("Digite seu Email:"));
        tela.add(Jemail);

        int resultado = JOptionPane.showConfirmDialog(null, tela, "CADASTRO - ALUNO", JOptionPane.OK_CANCEL_OPTION);

        if (resultado == JOptionPane.OK_OPTION) {
            String nome = Jnome.getText();
            String email = Jemail.getText();
            listaAlunos.add(nome);
            JOptionPane.showMessageDialog(null, "Aluno cadastrado!\nNome: " + nome + "\nEmail:" + email, "PÁGINA DO ALUNO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("Operação cancelada");
        }
    }
    void exibirListaAlunos(){
        StringBuilder alunosCadastrados = new StringBuilder("Lista de Alunos:\n\n");
        for (String aluno : listaAlunos) {
            alunosCadastrados.append("Nome: ").append(aluno).append("\n");
        }

        JOptionPane.showMessageDialog(null, alunosCadastrados.toString(), "Lista dos Alunos", JOptionPane.PLAIN_MESSAGE);
    }
}