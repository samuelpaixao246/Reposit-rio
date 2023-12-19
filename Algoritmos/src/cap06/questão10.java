package cap06;
import javax.swing.JOptionPane;
public class questão10 {
    public static void main(String[] args) {

        /*10) Faça um algoritmo para ler os valores gastos em cheque por uma pessoa durante um mês, e depois imprimir a lista com todos os valores, o maior e o menor valor.
        No início do algoritmo o usuário deve informar quantos cheques foram usados no mês; estabeleça um número máximo de cheques*/

        int maxcheques = 10;

        double[] valorescheques = new double[maxcheques];

        int numerocheques;
        do {
            String input = JOptionPane.showInputDialog("Informe o número de cheques usados no mês (até " + maxcheques + " cheques):");
            numerocheques = Integer.parseInt(input);
        } while (numerocheques <= 0 || numerocheques > maxcheques);

        for (int i = 0; i < numerocheques; i++) {
            String input = JOptionPane.showInputDialog("Digite o valor do cheque " + (i + 1) + ":");
            valorescheques[i] = Double.parseDouble(input);
        }

        double maiorvalor = valorescheques[0];
        double menorvalor = valorescheques[0];

        for (int i = 1; i < numerocheques; i++) {
            if (valorescheques[i] > maiorvalor) {
                maiorvalor = valorescheques[i];
            }
            if (valorescheques[i] < menorvalor) {
                menorvalor = valorescheques[i];
            }
        }

        StringBuilder listavalores = new StringBuilder("Valores dos cheques:\n");
        for (int i = 0; i < numerocheques; i++) {
            listavalores.append("Cheque ").append(i + 1).append(": ").append(valorescheques[i]).append("\n");
        }

        JOptionPane.showMessageDialog(null, listavalores.toString() + "Maior valor: "
                + maiorvalor + "\n" + "Menor valor: " + menorvalor);
    }    
}
