package cap06;
import javax.swing.JOptionPane;
public class questão1 {
    public static void main(String[] args) {
    
        /*1) O gichê de pédagio de uma rodovia possui um equipamento que registra diariamente a quantidade de carros qua ali passaram.
        Faça um algoritmo para ler cada registro do mês de setembro e informar qual o maior volume de carros que passaram e em qual dia ele ocorreu*/

        int[] registros = new int[30];

        for(int i = 0; i < registros.length; i++) {
            int quantcarros = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de carros que passaram no dia " + (i + 1)));
            registros[i] = quantcarros;
        }
        int maiorvolumecarros = 0;
        int diamaiorvolume = 0;
            for (int i = 0; i < registros.length; i++) {
            if (registros[i] > maiorvolumecarros) {
                maiorvolumecarros = registros[i];
             diamaiorvolume = i + 1;
            }
        }
        JOptionPane.showMessageDialog(null, "O maior volume de carros que passaram em setembro foi de " + maiorvolumecarros + " carros no dia " + diamaiorvolume);
    }    
}
