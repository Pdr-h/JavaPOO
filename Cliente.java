package aplicacao;

/**
 *
 * @author ph863
 */
import java.util.*;
import javax.swing.*;
import java.text.*;

public class Cliente {

static class Cadastro {
    String nomeCampo;
    String senhaCampo;
    public Cadastro(String nomeCampo, String senhaCampo) {
    this.nomeCampo = nomeCampo;
    this.senhaCampo = senhaCampo;
    }
}
    
Cadastro cadastroCliente(){
    JTextField nomeField = new JTextField(10);
    JPasswordField senhaField = new JPasswordField(10);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new JLabel("Digite seu nome:"));
        panel.add(nomeField);
        panel.add(new JLabel("Digite uma senha:"));
        panel.add(senhaField);

        int tela = JOptionPane.showConfirmDialog(null, panel, "Cadastro - Cliente", JOptionPane.OK_CANCEL_OPTION);
        
        if (tela == JOptionPane.OK_OPTION) {
            String nomeCampo = nomeField.getText();
            String senhaCampo = new String(senhaField.getPassword());
            JOptionPane.showMessageDialog(null, "Cadastro concluído", "Cadastro - Concluido", JOptionPane.INFORMATION_MESSAGE);
            return new Cadastro(nomeCampo, senhaCampo);
        } else{
            return null;
        }
}

void verificarCliente(){
    
}
    
    
}
