package cap04;
import javax.swing.JOptionPane;
public class questão8 {
    public static void main(String[] args) {

        /*8) Faça um algoritmo para ler um ponto (x,y) do plano cartesiano e exibir uma mensagem se está acima,
            abaixo ou pertence á parábola x² -3x + 1 = 0.*/

            double x,y,parabola;
            String sx,sy;
            
            sx=JOptionPane.showInputDialog("Digite o valor de x:");
            sy=JOptionPane.showInputDialog("Digite o valor de y:");
            x=Double.parseDouble(sx);
            y=Double.parseDouble(sy);
                    
            parabola = x * x - 3 * x + 1;

            if (y > parabola) {
                JOptionPane.showMessageDialog(null, "O ponto está acima da parábola.");
            } else if (y < parabola) {
                JOptionPane.showMessageDialog(null, "O ponto está abaixo da parábola.");
            } else {
                JOptionPane.showMessageDialog(null, "O ponto pertence à parábola.");
            }
    }    
}
