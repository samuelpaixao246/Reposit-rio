package cap05;
import javax.swing.JOptionPane;
public class questão4 {
    public static void main(String[] args) {
    
        /*4) Faça um algoritmo para gerar o valor da constante Pi(3,145..).
          Este valor pode ser obtido pela soma da seguinte série (estabeleça um fim; quanto maior, mais preciso)   pi=4-4/3+4/5-4/7+4/9-4/11*/

        int entrada;
        double pi = 0.0, piaproximado;
        String sentrada;
        
        sentrada=JOptionPane.showInputDialog("Digite o número de interações para calcular Pi:");
        entrada=Integer.parseInt(sentrada);

        for (int i = 0; i < entrada; i++)
        {
            double termo = 4.0 / (2 * i + 1);

            if (i % 2 == 0) {
                pi += termo;
            } else {
                pi -= termo;
            }
        }
        piaproximado = pi;

        JOptionPane.showMessageDialog(null, "Valor aproximado de Pi: " + piaproximado);
    }    
}
