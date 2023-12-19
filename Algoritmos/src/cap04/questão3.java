package cap04;
import javax.swing.JOptionPane;
public class questão3 {
    public static void main(String[] args) {
        
        /*3) Os ingressos no cinema Belas Artes custam X reais. Na terça-feira há um desconto de 50%, e em qualquer dia, menores de 14 anos também tem um desconto de 50%.
        Faça um algoritmo que, sendo lidos o dia da semana, a idade do espectador e o preço base do ingresso, imprima o valor a pagar.
     Considere que dia 1 é domingo, 2 é segunda-feira, etc. Ex: ingresso na terça-feira para um espectador de 11 anos, com preço-base de R$12,00 - o valor a pagar é de R$30,00.*/
            int diasemana, idade;
            double pbingresso, pfinal, descontodia, descontoidade;
            String sdiasemana, sidade, spbingresso;
            
            sdiasemana=JOptionPane.showInputDialog("Digite o dia da semana (1 a 7):");
            sidade=JOptionPane.showInputDialog("Digite a idade do espectador:");
            spbingresso=JOptionPane.showInputDialog("Digite o preço base do ingresso:");
            diasemana=Integer.parseInt(sdiasemana);
            idade=Integer.parseInt(sidade);
            pbingresso=Double.parseDouble(spbingresso);
            
            descontodia = (diasemana == 3) ? 0.5 : 0;
            descontoidade = (idade < 14) ? 0.5 : 0;
            
            pfinal = pbingresso * (1 - descontodia) * (1 - descontoidade);
            
            JOptionPane.showMessageDialog(null, "O valor a pagar é de R$" + pfinal);
        
    }
}
