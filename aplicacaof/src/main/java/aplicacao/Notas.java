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
import java.awt.*;

public class Notas {

    float mediaCalc() {
        JPanel tela = new JPanel(new GridLayout(0,1));
        JTextField[] camposNotas = new JTextField[4];

        for (int i = 0; i < 4; i++) {
            camposNotas[i] = new JTextField();
            tela.add(new JLabel("Nota " + (i+1) + ":"));
            tela.add(camposNotas[i]);
        }
        int result = JOptionPane.showConfirmDialog(null, tela, "CALCULO DE MÉDIA", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
                float soma = 0;
                for (int i = 0; i < 4; i++) {
                    float nota = Float.parseFloat(camposNotas[i].getText());
                    soma += nota;
                }

                float media = soma / 4;
                JOptionPane.showMessageDialog(null, "A média é: " + media);
                return media;
            } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada.");
            return -1; 
        }
    }
}
