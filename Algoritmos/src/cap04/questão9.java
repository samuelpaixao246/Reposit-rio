package cap04;
import javax.swing.JOptionPane;
public class questão9 {
    public static void main(String[] args) {

         /*9) Faça um algoritmo para ler a idade de uma pessoa e imprimir as menagens:
        Para maior de idade : Você é maior de idade
        para menor de idade: Você é menor de idade. Ainda faltam <x> anos para ser maior*/

        int idade,anosrestantes;
        String sidade;        
        
        sidade=JOptionPane.showInputDialog("Digite sua idade:");
        idade=Integer.parseInt(sidade);
        
        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Você é maior de idade.");
        } else {
            anosrestantes = 18 - idade;
            JOptionPane.showMessageDialog(null, "Você é menor de idade. Ainda faltam " + anosrestantes + " anos para ser de maior.");
        }
    }    
}
