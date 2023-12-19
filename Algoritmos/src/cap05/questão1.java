package cap05;
import javax.swing.JOptionPane;
public class questão1 {
    public static void main(String[] args) {

        /*1) A fábrica da Vôlquis produz uma determinada quantidade de automóveis por dia.
           Faça um algoritmo para ler a quantidade produzida diariamente ao longo de um ano, e depois informe:
            a) a quantidade produzida no ano td ;
            b) a menor produção diária.
            Obs: Considere que o valor -1 indica fim da digitação; observe que há dias em que não há   produção.*/

        int quantdiaria, quantprodano = 0, dia = 1;
        int menorproddiaria = Integer.MAX_VALUE;

        JOptionPane.showMessageDialog(null, "Digite a quantidade produzida diariamente ao longo do ano (-1 para encerrar):");

        while (true) {
            String input = JOptionPane.showInputDialog("Quantidade do dia " + dia + " (ou -1 para encerrar):");

            try {
                quantdiaria = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Formato inválido. Por favor, digite um número inteiro.");
                continue;
            }

            if (quantdiaria == -1) {
                break;
            }

            quantprodano += quantdiaria;

            if (quantdiaria < menorproddiaria) {
                menorproddiaria = quantdiaria;
            }

            dia++;
        }

        JOptionPane.showMessageDialog(null, "Quantidade produzida no ano: " + quantprodano + "\n" + "Menor produção diária: " + (menorproddiaria == Integer.MAX_VALUE ? "N/A" : menorproddiaria));
    }    
}
