package cap05;
import javax.swing.JOptionPane;
public class questão3 {
    public static void main(String[] args) {

        /*3) Em matemática, uma série é uma sequencia de números que possui uma lei de formação.
        Faça um algoritmo para calcular a soma da série abaixo, onde N é fornecido pelo usuário: 1/2 + 1/4 + 1/6 + ... 1/2N*/

        int n;
        double soma = 0;

        n =Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N:")) ;

        for (int i = 1; i <= n; i++) {
            soma = soma + 1.0 / (2 * i);
        }
        
        JOptionPane.showMessageDialog(null, "A soma da série para N = " + n + " é: " + soma);
    }
}
