package cap03;
import javax.swing.JOptionPane;
public class questão6 {
    public static void main(String[] args) {
        
        /*6)O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição.
        Escreva um algoritmo que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar.
        Assuma que a balança já desconte o peso do prato. */

        double pesoprato,vpagar;
        String spesoprato;
        
        spesoprato = JOptionPane.showInputDialog("Digite o peso do prato (em quilos):");
        pesoprato = Double.parseDouble(spesoprato);
        
        vpagar = pesoprato * 12.00;
                
        JOptionPane.showMessageDialog(null, "O valor a pagar é R$" + vpagar);
    }    
}
