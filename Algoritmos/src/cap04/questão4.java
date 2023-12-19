package cap04;
import javax.swing.JOptionPane;
public class questão4 {
    public static void main(String[] args) {
    
        /*4) Uma máquina virtual recebe um valor e exibe o seu quadrado quando ele é par, e o seu cubo quando ele é impar.
        Faça o algoritmo para esta máquina.*/
        
        double valor,res;
        String svalor;
            
        svalor = JOptionPane.showInputDialog("Digite um valor:");
        valor = Double.parseDouble(svalor);
        
            if (valor % 2 == 0) {
                res = Math.pow(valor, 2);
                JOptionPane.showMessageDialog(null, "O quadrado do valor é: " + res);
            } else {
                res = Math.pow(valor, 3);
                JOptionPane.showMessageDialog(null, "O cubo do valor é: " + res);
            }
    }    
}
