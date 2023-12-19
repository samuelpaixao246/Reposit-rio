package cap03;
import javax.swing.JOptionPane;
public class questão8 {
    public static void main(String[] args) {
        
         /*8)Faça um algoritmo para ler três notas de um aluno em uma disciplina e
        imprimir a sua média ponderada (as notas tem pesos respectivos de 1, 2 e 3)*/

        double nota1,nota2,nota3,media;
        String snota1,snota2,snota3;
        
        snota1=JOptionPane.showInputDialog("Digite a primeira nota:");
        snota2=JOptionPane.showInputDialog("Digite a segunda nota:");
        snota3=JOptionPane.showInputDialog("Digite a terceira nota:");
        nota1=Double.parseDouble(snota1);
        nota2=Double.parseDouble(snota2);
        nota3=Double.parseDouble(snota3);
        
        media = (nota1 * 1 + nota2 * 2 + nota3 * 3) / 6;

            JOptionPane.showMessageDialog(null, "Média ponderada : " + media);
    }    
}
