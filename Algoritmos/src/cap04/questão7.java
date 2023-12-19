package cap04;
import javax.swing.JOptionPane;
public class questão7 {
    public static void main(String[] args) {

        /*7)Na escola Meu Jardim o aluno recebe quatro notas por disciplina.
        Faça um algoritmo para entrar com quatro notas, o nome do aluno, calcular a média e dizer se o aluno foi aprovado ou reprovado.
        Considere aprovação para valor de média igual ou superior a seis.*/
        
            double nota1,nota2,nota3,nota4,media;
            String snota1,snota2,snota3,snota4;
            String aluno;
            
            aluno=JOptionPane.showInputDialog("Digite o nome do aluno:");
            
            snota1=JOptionPane.showInputDialog("Digite a primeira nota:");
            snota2=JOptionPane.showInputDialog("Digite a segunda nota:");
            snota3=JOptionPane.showInputDialog("Digite a terceira nota:");
            snota4=JOptionPane.showInputDialog("Digite a quarta nota:");
            nota1=Double.parseDouble(snota1);
            nota2=Double.parseDouble(snota2);
            nota3=Double.parseDouble(snota3);
            nota4=Double.parseDouble(snota4);
                    
            media = (nota1 + nota2 + nota3 + nota4) / 4;

            if (media >= 6) {
                JOptionPane.showMessageDialog(null, aluno + " foi aprovado com média " + media);
            } else {
                JOptionPane.showMessageDialog(null, aluno + " foi reprovado com média " + media);
            }
    }    
}
