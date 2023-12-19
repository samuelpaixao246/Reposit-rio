package cap03;
import javax.swing.JOptionPane;
public class questão2 {
    public static void main(String[] args) {

         /*2)Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados para um haras*/

        int quantCavalos,quantFerraduras = 4, quantNecessaria;
        String squantCavalos;        
        
        squantCavalos = JOptionPane.showInputDialog("Digite a quantidade de cavalos:");
        quantCavalos = Integer.parseInt(squantCavalos);
        
        quantNecessaria = quantCavalos * quantFerraduras;
        
        JOptionPane.showMessageDialog(null, "São necessárias " + quantNecessaria + " ferraduras.");
    }    
}
