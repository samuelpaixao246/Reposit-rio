package cap04;
import javax.swing.JOptionPane;
public class questão5 {
    public static void main(String[] args) {
        
        /*5) Entar com a distância percorrida (Km) e a quantidade de combustivel (Litros) gasto.
        Depois informe quantos quilômetros são percorridos por litro.
        Sabendo que um carro econômico percorre 15Km/l, diga se o veículo em questão é econômico ou não.*/
        double distancia, combustivel, consumo;
        String sdistancia, scombustivel;
        
        sdistancia = JOptionPane.showInputDialog("Digite a distância percorrida (Km):");
        scombustivel = JOptionPane.showInputDialog("Digite a quantidade de combustível (Litros):");
        distancia = Double.parseDouble(sdistancia);
        combustivel = Double.parseDouble(scombustivel);
        
        consumo = distancia / combustivel;

        JOptionPane.showMessageDialog(null, "O consumo é de " + consumo + " Km/l.");

        if (consumo > 15) {
            JOptionPane.showMessageDialog(null, "O veículo não é econômico.");
        } else {
            JOptionPane.showMessageDialog(null, "O veículo é econômico.");
        }
    }    
}
