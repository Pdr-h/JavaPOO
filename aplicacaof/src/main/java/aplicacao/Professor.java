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

public class Professor {
    ArrayList<String> listaProf = new ArrayList<>();
    ArrayList<String> listaDisc = new ArrayList<>();

    void cadastrarProf() {
        JTextField Jnome = new JTextField(10);
        JTextField Jdisciplina = new JTextField(10);

        JPanel tela = new JPanel(new GridLayout(0, 1));
        tela.add(new JLabel("Digite o nome do Docente:"));
        tela.add(Jnome);
        tela.add(new JLabel("Disciplina Ministrada:"));
        tela.add(Jdisciplina);

        int resultado = JOptionPane.showConfirmDialog(null, tela, "CADASTRO - DOCENTE", JOptionPane.OK_CANCEL_OPTION);

        if (resultado == JOptionPane.OK_OPTION) {
            String nome = Jnome.getText();
            String disciplina = Jdisciplina.getText();
            listaProf.add(nome);
            listaDisc.add(disciplina);
            JOptionPane.showMessageDialog(null, "Docente cadastrado!\nNome: " + nome + "\nDisciplina:" + disciplina, "PÁGINA DO DOCENTE", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("Operação cancelada");
        }
    }

    void exibirListaProfessores() {
        StringBuilder profsCadastrados = new StringBuilder("Lista de Docentes:\n\n");
        for (int i = 0; i < listaProf.size(); i++) {
            String professor = listaProf.get(i);
            String disciplinaMinistrada = listaDisc.get(i);
            profsCadastrados.append("Nome: ").append(professor).append("\n");
            profsCadastrados.append("Disciplina: ").append(disciplinaMinistrada).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, profsCadastrados.toString(), "Lista dos Professores", JOptionPane.PLAIN_MESSAGE);
    }
}

