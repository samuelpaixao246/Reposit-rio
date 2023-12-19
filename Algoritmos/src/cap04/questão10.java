package cap04;
import javax.swing.JOptionPane;
public class questão10 {
    public static void main(String[] args) {

        /*10) A eleição do síndico de um prédio teve três candidatos.
        Faça um algoritimo para ler o nome e o total de votos de cada candidato e informar qual foi o vencedor.*/

        int votoscandidato1,votoscandidato2,votoscandidato3;
        String nomecandidato1,nomecandidato2,nomecandidato3,svotoscandidato1,svotoscandidato2,svotoscandidato3;
        
        nomecandidato1=JOptionPane.showInputDialog("Digite o nome do candidato 1:");
        svotoscandidato1=JOptionPane.showInputDialog("Digite o total de votos do candidato 1:");
        votoscandidato1=Integer.parseInt(svotoscandidato1);
                
        nomecandidato2=JOptionPane.showInputDialog("Digite o nome do candidato 2:");
        svotoscandidato2=JOptionPane.showInputDialog("Digite o total de votos do candidato 2:");
        votoscandidato2=Integer.parseInt(svotoscandidato2);
        
        nomecandidato3=JOptionPane.showInputDialog("Digite o nome do candidato 3:");
        svotoscandidato3=JOptionPane.showInputDialog("Digite o total de votos do candidato 3:");
        votoscandidato3=Integer.parseInt(svotoscandidato3);
        
        if (votoscandidato1 > votoscandidato2 && votoscandidato1 > votoscandidato3) {
            JOptionPane.showMessageDialog(null, nomecandidato1 + " venceu a eleição!");
        } else if (votoscandidato2 > votoscandidato1 && votoscandidato2 > votoscandidato3) {
            JOptionPane.showMessageDialog(null, nomecandidato2 + " venceu a eleição!");
        } else if (votoscandidato3 > votoscandidato1 && votoscandidato3 > votoscandidato2) {
            JOptionPane.showMessageDialog(null, nomecandidato3 + " venceu a eleição!");
        } else {
            JOptionPane.showMessageDialog(null, "A eleição terminou em empate.");
        }
    }    
}
