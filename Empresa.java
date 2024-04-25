package aplicacao;

/**
 *
 * @author Aluno
 */
import java.util.*;
import javax.swing.*;
import java.text.*;

public class Empresa {

public static void main (String[]args){
Fornecedor fornecedor = new Fornecedor();

String nomeEmpresa = JOptionPane.showInputDialog("Digite o nome da Empresa!");
fornecedor.ProdutoFornecido(nomeEmpresa);

Object[] opcoes = {"CLIENTE", "FUNCIONÁRIO"};
int opcaoSlct = JOptionPane.showOptionDialog(null, "Selecione uma Opção", "OPÇÕES", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]); 

if(opcaoSlct == 0){
    JOptionPane.showMessageDialog(null, "OI ");
}
}

}
