package cap05;
import javax.swing.JOptionPane;
public class questão2 {
    public static void main(String[] args) {
    
        /*2) Faça um algoritmo para exibir os números 1, 4, 9, 16, 25, 36, ... , 10000.*/

        int limite = 1000, quadrado;

        StringBuilder resultado = new StringBuilder();

        for (int i = 1; i * i <= limite; i++) {
            quadrado = i * i;
            resultado.append(quadrado);

            if (i * i < limite) {
                resultado.append(", ");
            }
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    
    }      
}
