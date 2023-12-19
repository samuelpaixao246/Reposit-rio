package cap04;
import javax.swing.JOptionPane;
public class questão2 {
    public static void main(String[] args) {

        /*2) O indice de massa corpórea (IMC) é calculado a partir da seguinte fórmula:
    IMC= peso(kg)/ altura²(m)*/

            double peso, altura, imc;
            String speso, saltura;
            
            speso=JOptionPane.showInputDialog("Digite seu peso em quilogramas:");
            saltura=JOptionPane.showInputDialog("Digite sua altura em metros:");
            peso=Double.parseDouble(speso);
            altura=Double.parseDouble(saltura);
            
            imc = peso / (altura * altura);
            
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc);
        
            if (imc < 18.5) {
                JOptionPane.showMessageDialog(null, "Abaixo do peso");
            } else if (imc >= 18.5 && imc < 25) {
                JOptionPane.showMessageDialog(null, "Peso normal");
            } else if (imc >= 25 && imc < 30) {
               JOptionPane.showMessageDialog(null, "Sobrepeso");
            } else if (imc >= 30 && imc < 35) {
                JOptionPane.showMessageDialog(null, "Obesidade leve");
            } else if (imc >= 35 && imc < 40) {
                JOptionPane.showMessageDialog(null, "Obesidade moderada");
            } else {
                JOptionPane.showMessageDialog(null, "Obesidade mórbida");
            }
    }
}
