package cap03;
import javax.swing.JOptionPane;
public class questão3 {
    public static void main(String[] args) {
        
        /*3)A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a  cada dia. Cada pãozinho custa R$0,12 e a broa custa R$1,50.
        Ao final do dia, o dono quer saber quanto arrecadou com a venda dos pães e broas (juntos), e quanto deve guardar numa conta de poupança (10% do total arrecadado).
        Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos, faça um algoritmo para ler as quantidades de pães e de broas,
        e depois calcular os dados solicitados.*/

        int quantpaes,quantbroas;
        double  vtotal,vpoupanca,vpaes,vbroas;
        String squantpaes,squantbroas;
        
        squantpaes = JOptionPane.showInputDialog("Digite a quantidade de pães franceses:");
        squantbroas = JOptionPane.showInputDialog("Digite a quantidade de broas:");
        quantpaes = Integer.parseInt(squantpaes);
        quantbroas = Integer.parseInt(squantbroas);
                
        vpaes = quantpaes * 0.12;
        vbroas = quantbroas * 1.50;
        vtotal = vpaes + vbroas;
        vpoupanca = vtotal * 0.10;

        JOptionPane.showMessageDialog(null, "Custo total: R$" + vtotal +  "\nValor a ser guardado na poupança: R$" + vpoupanca);
    }
}