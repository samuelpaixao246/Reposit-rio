package cap03;
import javax.swing.JOptionPane;
public class questão5 {
    public static void main(String[] args) {
        
        /*5)Um motorista deseja colocar no seu tanque X reais de gasolina.
        Escreva um algoritmo para ler o preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu colocar no tanque*/

        double plitro,vpagamento,litrosabastecidos;
        String splitro,svpagamento;
        
        splitro = JOptionPane.showInputDialog("Digite o preço do litro da gasolina:");
        svpagamento = JOptionPane.showInputDialog("Digite o valor do pagamento:");
        plitro=Double.parseDouble(splitro);
        vpagamento=Double.parseDouble(svpagamento);

        litrosabastecidos = vpagamento / plitro;
        
        JOptionPane.showMessageDialog(null, "Você conseguiu abastecer " + litrosabastecidos + " litro(s) de gasolina.");
    }
}
