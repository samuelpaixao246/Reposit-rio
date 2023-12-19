package cap03;
import javax.swing.JOptionPane;
public class questão9 {
    public static void main(String[] args) {
        
         /*9)Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo vendida respectivamente por 10, 12 e 15 reais.
        Construa um algoritmo em que o usuário forneça a quantidade de camisetas pequenas, médias e grandes referentes a uma venda,
        e a máquina informe quanto será o valor arrecadado.*/

        int qtdPequenas,qtdMedias,qtdGrandes,valorArrecadado;
        String sqtdPequenas,sqtdMedias,sqtdGrandes;
        
        sqtdPequenas=JOptionPane.showInputDialog("Digite a quantidade de camisetas pequenas:");
        sqtdMedias=JOptionPane.showInputDialog("Digite a quantidade de camisetas médias:");
        sqtdGrandes=JOptionPane.showInputDialog("Digite a quantidade de camisetas grandes:");
        qtdPequenas=Integer.parseInt(sqtdPequenas);
        qtdMedias=Integer.parseInt(sqtdMedias);
        qtdGrandes=Integer.parseInt(sqtdGrandes);
        
        valorArrecadado = qtdPequenas * 10 + qtdMedias * 12 + qtdGrandes * 15;

            JOptionPane.showMessageDialog(null, "Valor total: R$" + valorArrecadado);
    }
}
