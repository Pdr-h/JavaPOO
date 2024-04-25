package aplicacao;

/**
 *
 * @author Aluno
 */
import java.util.*;
import javax.swing.*;
import java.text.*;

public class Fornecedor {
Random random = new Random();

ArrayList <String> listaProdFornecedor = new ArrayList<>(List.of("Arroz", "Feijão", "Macarrão"
    ,"Manteiga", "Carne", "Biscoito", "Temperos", "Água Sanitária", "Sabonete", "Shampoo"
        ,"Desodorante", "Café", "Açúcar", "Leite", "Ovos", "Sushi", "Kimshi")); 
  
void ProdutoFornecido(String nomeEmpresa){
    int randProductInt = random.nextInt(listaProdFornecedor.size());
    String nomePdtFornecido = listaProdFornecedor.get(randProductInt);
    int randQnt = random.nextInt(401) + 100;
    float randValor = random.nextFloat(26) + 10;
    double valorFinal = randQnt * randValor;    
    String titulo = "FORNECEDOR";
    JOptionPane.showMessageDialog(null, "OLÁ " + nomeEmpresa + "!\nTENHO UM PRODUTO ESPECIALMENTE PARA VOCÊ:\n\n-" + nomePdtFornecido +"\n\n"+ 
            randQnt + " Caixas\n" + "Cada caixa sai por:\nR$" + new DecimalFormat(".##").format(randValor)+ "\n"+
                "Valor final:\nR$" + new DecimalFormat(".##").format(valorFinal), titulo, JOptionPane.INFORMATION_MESSAGE);
    }
}
