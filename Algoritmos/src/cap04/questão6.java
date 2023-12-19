package cap04;
import javax.swing.JOptionPane;
public class questão6 {
    public static void main(String[] args) {

        /*6)Entrar com o ano e informar se o mesmo é bissexto ou não.
            Informe-se sobre como funciona o ano bisexto.*/

        int ano;
        String sano;
        
        sano=JOptionPane.showInputDialog("Digite o ano:");
        ano=Integer.parseInt(sano);

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            JOptionPane.showMessageDialog(null, ano + " é um ano bissexto.");
        } else {
            JOptionPane.showMessageDialog(null, ano + " não é um ano bissexto.");
        }
    }
}
