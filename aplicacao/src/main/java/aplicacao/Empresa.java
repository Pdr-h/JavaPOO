/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacao;

/**
 *
 * @author ph863
 */

import java.util.*;
import javax.swing.*;

public class Empresa {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    Produto produto = new Produto();
    Cliente cliente = new Cliente();
    Fornecedor fornecedor = new Fornecedor();
    Funcionario funcionario = new Funcionario();
    
String opcao = JOptionPane.showInputDialog(null, "[1] - Cadastrar Cliente\n" + "[2] - Cadastrar Funcionário\n" + "[3] - Opçoes Produto\n"+ "[4] - Sair", "OPÇOES", JOptionPane.PLAIN_MESSAGE);
boolean sair = false;
do{
switch (opcao) {
            case "1":
                //cadastrar cliente
                cliente.cadastrarCliente();
                opcao = JOptionPane.showInputDialog(null, "[1] - Cadastrar Cliente\n" + "[2] - Cadastrar Funcionário\n" + "[3] - Opçoes Produto\n"+ "[4] - Sair", "OPÇOES", JOptionPane.PLAIN_MESSAGE);
                break;
            case "2":
                //cadastrar funcionário
                funcionario.cadastrarFuncionario();
                opcao = JOptionPane.showInputDialog(null, "[1] - Cadastrar Cliente\n" + "[2] - Cadastrar Funcionário\n" + "[3] - Opçoes Produto\n"+ "[4] - Sair", "OPÇOES", JOptionPane.PLAIN_MESSAGE);
                break;
            case "3":
                String escolhaProduto = JOptionPane.showInputDialog(null, "[1] - Adicionar\n" + "[2] - Remover\n" + "[3] - Consultar Lista\n" + "[4] - Fornecedor\n", "PRODUTOS", JOptionPane.PLAIN_MESSAGE);
                    if (escolhaProduto.equals("4")) {
                        String produtoSorteado = fornecedor.sortearProduto();
                        produto.gerenciarProdutos(escolhaProduto, produtoSorteado);
                    } else {
                        produto.gerenciarProdutos(escolhaProduto, null);
                    }
                    opcao = JOptionPane.showInputDialog(null, "[1] - Cadastrar Cliente\n" + "[2] - Cadastrar Funcionário\n" + "[3] - Opçoes Produto\n"+ "[4] - Sair", "OPÇOES", JOptionPane.PLAIN_MESSAGE);
                    break;
            case "4":
                //sair
                sair = true;
                return;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                break;
        }
}while(!sair);
    
    }
}
