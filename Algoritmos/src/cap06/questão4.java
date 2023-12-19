package cap06;
import javax.swing.JOptionPane;
public class questão4 {
    public static void main(String[] args) {

        /*4) Faça um algoritmo para ler duas matrizes A e B 3x2 e 2x3 e imprimir a matriz da multiplicação.
      Lembre-se que o cálculo da multiplicação de matrizes é diferente do da soma.*/

      double[][] A = new double[3][2];
      double[][] B = new double[2][3];

      for (int i = 0; i < A.length; i++) {
          for (int j = 0; j < A[i].length; j++) {
              A[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A[" + i + "][" + j + "]:"));
          }
      }
      for (int i = 0; i < B.length; i++) {
          for (int j = 0; j < B[i].length; j++) {
              B[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B[" + i + "][" + j + "]:"));
          }
      }

      double[][] C = new double[A.length][B[0].length];
      for (int i = 0; i < A.length; i++) {
          for (int j = 0; j < B[0].length; j++) {
              for (int k = 0; k < A[0].length; k++) {
                  C[i][j] += A[i][k] * B[k][j];
              }
          }
      }

      for (int i = 0; i < C.length; i++) {
          for (int j = 0; j < C[0].length; j++) {
              JOptionPane.showMessageDialog(null, "C[" + i + "][" + j + "]: " + C[i][j]);
          }
      }
    }    
}
