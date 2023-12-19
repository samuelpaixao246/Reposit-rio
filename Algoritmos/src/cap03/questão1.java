package cap03;
import javax.swing.JOptionPane;
public class questão1 {
    public static void main(String[] args) {

         /*1)A imobiliária Imóbilis vende apenas terrenos retangulares.
        Faça um algoritmo para ler as dimensões de um terreno e depois exibir a área do terreno*/

        double comprimento,largura,area;       
        String scomprimento,slargura;

        scomprimento = JOptionPane.showInputDialog("Digite o comprimento do terreno:");
        slargura = JOptionPane.showInputDialog("Digite a largura do terreno:");
        comprimento=Double.parseDouble(scomprimento);
        largura=Double.parseDouble(slargura);

        area = comprimento * largura;
        
            JOptionPane.showMessageDialog(null, "A área do terreno é: " + area + " metros quadrados.");
    }
}