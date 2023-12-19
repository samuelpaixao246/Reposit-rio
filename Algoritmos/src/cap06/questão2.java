package cap06;
import javax.swing.JOptionPane;
public class questão2 {
    public static void main(String[] args) {
    
        /*2) Modifique o algoritmo anterior de forma que também informe o menor volume*/

        int[] registros = new int[30];

        for (int i = 0; i < registros.length; i++) {
            int quantcarros = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de carros que passaram no dia " + (i + 1)));
                registros[i] = quantcarros;
        }
        int maiorvolumecarros = 0;
        int diamaiorvolume = 0;
        int menorvolumecarros = Integer.MAX_VALUE;
        int diamenorvolume = 0;
        for (int i = 0; i < registros.length; i++) {
            if (registros[i] > maiorvolumecarros) {
                maiorvolumecarros = registros[i];
                diamaiorvolume = i + 1;
            } else if (registros[i] < menorvolumecarros) {
                menorvolumecarros = registros[i];
                diamenorvolume = i + 1;
            }
        }
        JOptionPane.showMessageDialog(null, "O maior volume de carros que passaram em setembro foi de " + maiorvolumecarros + " carros no dia " + diamaiorvolume + "\nO menor volume de carros que passaram em setembro foi de " + menorvolumecarros + " carros no dia " + diamenorvolume);
    }    
}
