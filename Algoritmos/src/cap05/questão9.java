package cap05;
import javax.swing.JOptionPane;
public class questão9 {
    public static void main(String[] args) {
    
        /*9) Faça um algoritmo para calcular a soma da série a seguir (o usuário deve informar a quantidade de termos da série):
        1/11+1 + 2/22+1 + 3/33+1 + ...*/

        int n;
        double soma = 0, termo;
        String sn;

        sn=JOptionPane.showInputDialog("Digite o número de termos da série:");
        n=Integer.parseInt(sn);
        
        for (int i = 1; i <= n; i++) 
        {
        termo = (i * i) / (i + 1);
        soma += termo;
        }

        JOptionPane.showMessageDialog(null, "A soma da série é: " + soma);
    }
}
