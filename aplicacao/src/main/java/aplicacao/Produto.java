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
import java.util.*;

public class Produto {
    ArrayList<String> listaProdutos = new ArrayList<>(List.of("Arroz", "Feijao", "Macarrao",
        "Manteiga", "Carne", "Biscoito", "Temperos", "Agua Sanitaria", "Sabonete", "Shampoo",
            "Desodorante", "Cafe", "Açucar", "Leite", "Ovos", "Sushi", "Kimshi"));
    
    void gerenciarProdutos(String escolha, String produtoSorteado) {
        switch (escolha) {
            case "1":
            String produto = JOptionPane.showInputDialog(null, "Nome do produto para adicionar:");
            listaProdutos.add(produto);
            JOptionPane.showMessageDialog(null, "Produto adicionado: " + produto, "Gerenciar Produtos", JOptionPane.INFORMATION_MESSAGE);
        break;

            case "2":
            System.out.println("Lista de Produtos:");
            for (String produtoList : listaProdutos) {
            System.out.println(produtoList);
            }
            String produtoRemover = JOptionPane.showInputDialog(null, "Nome do produto para remover:", "Gerenciar Produtos", JOptionPane.QUESTION_MESSAGE);
            boolean encontrado = false;
            for (String produtoh : listaProdutos) {
                if (produtoh.equalsIgnoreCase(produtoRemover)) {
                    encontrado = true;
                    listaProdutos.remove(produtoh);
                    JOptionPane.showMessageDialog(null, "Produto removido: " + produtoh, "Gerenciar Produtos", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "Produto não encontrado na lista", "Gerenciar Produtos", JOptionPane.WARNING_MESSAGE);
        }
        break;
            case "3":
            if (listaProdutos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Lista de produtos vazia", "Gerenciar Produtos", JOptionPane.INFORMATION_MESSAGE);
            } else {
                StringBuilder sb = new StringBuilder("Lista de Produtos:\n");
                for (String prod : listaProdutos) {
                    sb.append(prod).append("\n");
                }
                JOptionPane.showMessageDialog(null, sb.toString(), "Gerenciar Produtos", JOptionPane.INFORMATION_MESSAGE);
            }
            break;
             case "4":
                int opcao = JOptionPane.showConfirmDialog(null, "Olá, tenho um produto especialmente para VOCE!\n\n" +"Nome:" + produtoSorteado + "\n\nQuer Adicionar a Lista?", "Adicionar Produto Sorteado", JOptionPane.YES_NO_OPTION);
                if (opcao == JOptionPane.YES_OPTION) {
                    listaProdutos.add(produtoSorteado);
                    JOptionPane.showMessageDialog(null, "Produto adicionado à lista: " + produtoSorteado, "Gerenciar Produtos", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Produto não adicionado à lista", "Gerenciar Produtos", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
        }
        
    }
}
