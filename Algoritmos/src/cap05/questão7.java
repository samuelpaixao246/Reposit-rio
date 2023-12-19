package cap05;
import javax.swing.JOptionPane;
public class questão7 {
    public static void main(String[] args) {
    
         /*7) Mostre o que será impresso pelo algoritimo abaixo:
         Loop infinito: Passei por aqui!1, 13 e Ufa, cheguei aqui!*/

        int i = 1;

        while (i < 20) {
            i += 2;

            JOptionPane.showMessageDialog(null, "Passei por aqui!");

            quad(1);

            JOptionPane.showMessageDialog(null, 13);

            JOptionPane.showMessageDialog(null, "Ufa, cheguei aqui!");
        }
    }

    public static void quad(int x) {
        JOptionPane.showMessageDialog(null, x * x);
    }    
}
