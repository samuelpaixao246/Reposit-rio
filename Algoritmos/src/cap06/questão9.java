package cap06;
import javax.swing.JOptionPane;
public class questão9 {
    public static void main(String[] args) {

        /*9) Modifique o algoritmo anterior para informar também o número da disciplina em que o aluno tirou a nota mais alta*/

        int ndisciplinas = 5;
        int nnotasdisciplina = 4;

        double notamaisalta = Double.MIN_VALUE;
        int disciplinanotamaisalta = 0;

        for (int i = 1; i <= ndisciplinas; i++) {

            for (int j = 1; j <= nnotasdisciplina; j++) {

                String input = JOptionPane.showInputDialog("Digite a nota " + j + " da disciplina " + i + ":");

                double nota = Double.parseDouble(input);

                if (nota > notamaisalta) {
                    notamaisalta = nota;
                    disciplinanotamaisalta = i;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "A nota mais alta é: " + notamaisalta + " na disciplina " + disciplinanotamaisalta);
    }
}
