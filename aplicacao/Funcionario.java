/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacao;

/**
 *
 * @author ph863
 */
import javax.swing.*;
import java.util.ArrayList;

public class Funcionario {
    private ArrayList<String> listaFuncionarios = new ArrayList<>();

    void cadastrarFuncionario() {
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do funcionário:", "Cadastro de Funcionário", JOptionPane.PLAIN_MESSAGE);
        String email = JOptionPane.showInputDialog(null, "Digite o e-mail do funcionário:", "Cadastro de Funcionário", JOptionPane.PLAIN_MESSAGE);
        String areaAtuacao = JOptionPane.showInputDialog(null, "Digite a área de atuação do funcionário:", "Cadastro de Funcionário", JOptionPane.PLAIN_MESSAGE);

        listaFuncionarios.add(nome);

        JOptionPane.showMessageDialog(null, "Funcionário cadastrado:\nNome: " + nome + "\nEmail: " + email + "\nÁrea de Atuação: " + areaAtuacao, "Funcionário Cadastrado", JOptionPane.INFORMATION_MESSAGE);

        StringBuilder nomesFuncionarios = new StringBuilder("Lista de Funcionários Cadastrados:\n");
        for (String funcionario : listaFuncionarios) {
            nomesFuncionarios.append("Nome: ").append(funcionario).append("\n");
        }
        JOptionPane.showMessageDialog(null, nomesFuncionarios.toString(), "Lista de Funcionários", JOptionPane.PLAIN_MESSAGE);
    }
}
