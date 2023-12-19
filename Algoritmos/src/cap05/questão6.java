package cap05;
import javax.swing.JOptionPane;
public class questão6 {
    public static void main(String[] args) {
    
        /*6)Modifique o algoritmo anterior para imprimir o valor de um número X elevado a uma potencia Y*/

        double base, res;
        int expoente;
        String sbase,sexpoente;
        
        sbase=JOptionPane.showInputDialog("Digite a base:");
        sexpoente=JOptionPane.showInputDialog("Digite o expoente:");
        base=Double.parseDouble(sbase);
        expoente=Integer.parseInt(sexpoente);
        
        res = Math.pow(base, expoente);

        JOptionPane.showMessageDialog(null, base + " elevado a " + expoente + " é: " + res);
    }
}
