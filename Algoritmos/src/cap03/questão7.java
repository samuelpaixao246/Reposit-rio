package cap03;
import javax.swing.JOptionPane;
public class questão7 {
    public static void main(String[] args) {

         /*7)Entrar com o dia e o mês de uma data e informar quantos dias se  passaram desde o inicio do ano.
        Esqueça a questão dos anos bissextos e considere sempre que um mês possui 30 dias.*/

            int dia,mes,diasPassados;
            String sdia,smes;
            
            sdia = JOptionPane.showInputDialog("Digite o dia:");
            smes = JOptionPane.showInputDialog("Digite o mês:");
            dia = Integer.parseInt(sdia);
            mes = Integer.parseInt(smes);
                    
            diasPassados = (mes - 1) * 30 + dia;

            JOptionPane.showMessageDialog(null, "Desde o início do ano passaram-se " + diasPassados + " dias.");
    }    
}
