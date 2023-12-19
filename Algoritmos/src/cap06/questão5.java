package cap06;
import javax.swing.JOptionPane;
public class questão5 {
    public static void main(String[] args) {
    
        /*5)Criar a matriz:
        1 1 1 1 1 1
        1 2 2 2 2 1
        1 2 3 3 2 1
        1 2 3 3 2 1
        1 2 2 2 2 1
        1 1 1 1 1 1
        Generalize o problema para uma matriz NxN*/

        int[][] matriz = new int[6][6];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 2;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                JOptionPane.showMessageDialog(null, "matriz[" + i + "][" + j + "]: " + matriz[i][j]);
            }
        }
    }    
}
