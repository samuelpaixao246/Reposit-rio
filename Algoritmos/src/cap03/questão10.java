package cap03;
import javax.swing.JOptionPane;
public class questão10 {
    public static void main(String[] args) {
        
        /*10) Construa um algoritmo para calcular a distância entre dois pontos de um plano cartesiano.
        Cada ponto é um par ordenado (x,y)*/

            double x1,y1,x2,y2;
            String sx1,sy1,sx2,sy2;
            
            sx1=JOptionPane.showInputDialog("Digite a coordenada x do primeiro ponto:");
            sy1=JOptionPane.showInputDialog("Digite a coordenada y do primeiro ponto:");
            sx2=JOptionPane.showInputDialog("Digite a coordenada x do segundo ponto:");
            sy2=JOptionPane.showInputDialog("Digite a coordenada y do segundo ponto:");
            x1=Double.parseDouble(sx1);
            y1=Double.parseDouble(sy1);
            x2=Double.parseDouble(sx2);
            y2=Double.parseDouble(sy2);

            double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

            JOptionPane.showMessageDialog(null, "A distância entre os pontos é: " + distancia);
    }   
}
