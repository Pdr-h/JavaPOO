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

public class Cliente {
    ArrayList<String> listaClientes = new ArrayList<>();

    void cadastrarCliente() {
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente:", "Cadastro de Cliente", JOptionPane.PLAIN_MESSAGE);
        String idadeStr = JOptionPane.showInputDialog(null, "Digite a idade do cliente:", "Cadastro de Cliente", JOptionPane.PLAIN_MESSAGE);
        int idade = Integer.parseInt(idadeStr); 

        listaClientes.add(nome);

        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!\nNome: " + nome + "\nIdade:" + idade, "Cliente Cadastro", JOptionPane.INFORMATION_MESSAGE);

        StringBuilder clientesCadastrados = new StringBuilder("Lista de Clientes Cadastrados:\n");
        for (String cliente : listaClientes) {
            clientesCadastrados.append("Nome: ").append(cliente).append("\n");
        }

        JOptionPane.showMessageDialog(null, clientesCadastrados.toString(), "Lista de Clientes", JOptionPane.PLAIN_MESSAGE);
    }
}
