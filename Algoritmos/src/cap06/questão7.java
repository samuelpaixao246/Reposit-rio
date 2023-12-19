package cap06;
import javax.swing.JOptionPane;
public class questão7 {
    public static void main(String[] args) {

        /*7) Faça um algoritmo para ler dois preços de 15 produtos de uma cesta básica (anotados no inicio e no fim de uma semana),
        e imprimir uma listagem com o preço médio de cada produto.*/

        double[] piniciais = new double[15];

        double[] pfinais = new double[15];

        for (int i = 0; i < piniciais.length; i++) {
            piniciais[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto " + (i + 1) + " no início da semana:"));
        }

        for (int i = 0; i < pfinais.length; i++) {
            pfinais[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto " + (i + 1) + " no fim da semana:"));
        }

        double[] variacoes = new double[15];
        for (int i = 0; i < variacoes.length; i++) {
            variacoes[i] = pfinais[i] - piniciais[i];
        }

        double[] pmedios = new double[15];
        for (int i = 0; i < pmedios.length; i++) {
            pmedios[i] = (piniciais[i] + pfinais[i]) / 2;
        }

        for (int i = 0; i < pmedios.length; i++) {
            JOptionPane.showMessageDialog(null, "Preço médio do produto " + (i + 1) + ": " + String.format("%.2f", pmedios[i]));
        }
    }    
}
