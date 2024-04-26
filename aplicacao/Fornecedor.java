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

public class Fornecedor {
    private ArrayList<String> listaProdutos = new ArrayList<>(List.of("Papel Higiênico", "Detergente", "Pasta de Dente", "Sabão em Pó",
            "Amaciante", "Óleo", "Vinagre", "Escova de Dentes", "Lâmpada", "Pilhas"));

    public String sortearProduto() {
        Random random = new Random();
        int pdtSorteado = random.nextInt(listaProdutos.size());
        return listaProdutos.get(pdtSorteado);
    }
}

