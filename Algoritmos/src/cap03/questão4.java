package cap03;
import javax.swing.JOptionPane;
public class questão4 {
    public static void main(String[] args) {
    
        /*4)Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias de vida ela possui.
            Considere sempre anos completos, e que um ano possui 365 dias.
            Ex: uma pessoa com 19 anos possui 6935 dias de vida*/

        String nome,sidade;
        int idade,diasdevida;
        
        nome = JOptionPane.showInputDialog("Digite seu nome:");
        sidade = JOptionPane.showInputDialog("Digite sua idade:");
        idade = Integer.parseInt(sidade);
        
        diasdevida = idade * 365;
        
        JOptionPane.showMessageDialog(null, nome + " tem " + idade + " ano(s) de idade. Logo, tem " + diasdevida + " dia(s) de vida.");
  }
}