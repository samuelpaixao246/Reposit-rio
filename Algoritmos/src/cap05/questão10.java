package cap05;
import javax.swing.JOptionPane;
public class questão10 {
    public static void main(String[] args) {

        /*10) Escreva um algoritmo que lê 5 valores para uma variável A,
        e informa quantos destes valores são negativos, escrevendo está informação.*/

        int valor, quantnegativos = 0;
        String svalor;
        
        for (int i = 0; i < 5; i++) {
            // Obter valor do usuário usando JOptionPane
            svalor=JOptionPane.showInputDialog("Digite o valor " + (i + 1) + ":");
            valor=Integer.parseInt(svalor);
            
            if (valor < 0) {
                quantnegativos++;
            }
        }

        JOptionPane.showMessageDialog(null, "Quantidade de valores negativos: " + quantnegativos);
    }
}
