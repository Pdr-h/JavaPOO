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
import java.util.List;

public class Divida {
    private ArrayList<String> meses;
    private ArrayList<Double> valores;
    private ArrayList<String> mesesfora;
    private ArrayList<Double> valorJuros;
    int count;
    public Divida() {
        meses = new ArrayList<>(List.of("JANEIRO", "FEVEREIRO", "MARÇO"));
        mesesfora = new ArrayList<>(List.of("ABRIL", "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO"));
        valores = new ArrayList<>(List.of(500.00, 550.00, 600.00));
        valorJuros = new ArrayList<>(List.of(650.00, 700.00, 750.00, 800.00, 850.00, 900.00, 950.00, 1000.00, 1100.00));
    }

    void realizarPagamento() {
        StringBuilder messagem = new StringBuilder("Escolha uma dívida para pagar:\n");
        for (int i = 0; i < meses.size(); i++) {
            messagem.append((i + 1)).append("-> ").append(meses.get(i)).append(": R$").append(valores.get(i)).append("\n");
        }

        String escolhaStr = JOptionPane.showInputDialog(null, messagem.toString(), "Realizar Pagamento", JOptionPane.QUESTION_MESSAGE);
        if (escolhaStr != null && !escolhaStr.isEmpty()) {
            int escolha = Integer.parseInt(escolhaStr);
                if (escolha >= 1 && escolha <= meses.size()) {
                    meses.remove(escolha - 1);
                    valores.remove(escolha - 1);
                    JOptionPane.showMessageDialog(null, "Pagamento realizado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Opção inválida. Pagamento cancelado.");
                }
        }else {
            JOptionPane.showMessageDialog(null, "Pagamento cancelado.");
             if (count < mesesfora.size()) {
                meses.add(mesesfora.get(count));
                valores.add(valorJuros.get(count));
                count++;
            }
        }
    }
}
    