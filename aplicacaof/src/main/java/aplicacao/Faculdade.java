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


public class Faculdade {
    static String menu(){
            String opcao = JOptionPane.showInputDialog(null, """
                                                     [1] - Cadastrar Aluno
                                                     [2] - Consultar Alunos
                                                     [3] - Cadastrar Docente
                                                     [4] - Consultar Docente
                                                     [5] - Calculo de Notas
                                                     [6] - Financeiro
                                                     [7] - Sair
                                                     ""","MENU INICIAL", JOptionPane.PLAIN_MESSAGE);
            return opcao;
    }
    
    public static void main(String[] args) {
         Aluno aluno = new Aluno();
         Professor professor = new Professor();
         Notas media = new Notas();
         Divida divida = new Divida();
    
    boolean sair = false;
    String opcao = menu();
    
    do{
        switch(opcao){
            case "1":
                aluno.cadastrarAluno();
                opcao = menu();
                break;
            case "2":
                aluno.exibirListaAlunos();
                opcao = menu();
                break;
            case "3":
                professor.cadastrarProf();
                opcao = menu();
                break;
            case "4":
                professor.exibirListaProfessores();
                opcao = menu();
                break;
            case "5":
                media.mediaCalc();
                opcao = menu();
                break;
            case "6":
                divida.realizarPagamento();
                opcao = menu();
                break;
            case "7":
                sair = true;
                return;
            default:
                JOptionPane.showMessageDialog(null, "ERRO", "ERRO", JOptionPane.ERROR_MESSAGE);
                opcao = menu();
                break;
        }
}while(!sair);

    }
}
