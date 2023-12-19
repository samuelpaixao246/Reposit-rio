package cap05;
import javax.swing.JOptionPane;
public class questão5 {
    public static void main(String[] args) {
    
        /*5) Faça um algoritmo para ler um número e imprimir o número elevado á quinta potência.*/

        double num, resultado;
        String snum;

        snum=JOptionPane.showInputDialog("Digite um número:");
        num=Double.parseDouble(snum);
        
        resultado = Math.pow(num, 5);

        JOptionPane.showMessageDialog(null, num + " elevado à quinta potência é: " + resultado);
    }
}
