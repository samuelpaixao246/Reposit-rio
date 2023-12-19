package cap04;
import javax.swing.JOptionPane;
public class questão1 {
    public static void main(String[] args) {

         /* 1) A partir do saldo bancário inicial, um cliente teve débitos e créditos ao longo do mês.
        Faça um algoritmo para ler o saldo inicial, o total de débitos e o total de créditos, e depois
        escrever o saldo final do cliente através da mensagem "Saldo positivo em R$xx" ou Saldo negativo em R$xx" ou "Saldo zero".*/

            double sinicial, debitos, creditos, sfinal;
            String ssinicial, sdebitos, screditos;
            
            ssinicial=JOptionPane.showInputDialog("Digite o saldo inicial:");
            sdebitos=JOptionPane.showInputDialog("Digite o total de débitos:");
            screditos=JOptionPane.showInputDialog("Digite o total de créditos:");
            sinicial=Double.parseDouble(ssinicial);
            debitos=Double.parseDouble(sdebitos);
            creditos=Double.parseDouble(screditos);
            
            sfinal = sinicial - debitos + creditos;

            if (sfinal > 0) {
                JOptionPane.showMessageDialog(null, "Saldo positivo em R$" + sfinal);
            } else if (sfinal < 0) {
                JOptionPane.showMessageDialog(null, "Saldo negativo em R$" + sfinal);
            } else {
                JOptionPane.showMessageDialog(null, "Saldo zero.");
            }
    }
    
}
