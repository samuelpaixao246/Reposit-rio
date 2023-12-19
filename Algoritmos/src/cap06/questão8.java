package cap06;
import javax.swing.JOptionPane;
public class questão8 {
    public static void main(String[] args) {
    
        /*8) Um aluno possui 4 notas em cada uma das 5 disciplinas que cursa num colégio.
        Faça um algoritmo para ler as notas do aluno, e indicar qual foi a mais alta.*/

        int ndisciplinas = 5;
        int nnotasdisciplina = 4;

        double notamaisalta = Double.MIN_VALUE;

        for (int i = 1; i <= ndisciplinas; i++) {

            for (int j = 1; j <= nnotasdisciplina; j++) {

                String input = JOptionPane.showInputDialog("Digite a nota " + j + " da disciplina " + i + ":");

                double nota = Double.parseDouble(input);

                if (nota > notamaisalta) {
                    notamaisalta = nota;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Nota mais alta: " + notamaisalta);
    }    
}
