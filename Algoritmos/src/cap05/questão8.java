package cap05;
import javax.swing.JOptionPane;
public class questão8 {
    public static void main(String[] args) {

        //8) Mostre o que será impresso pelo algoritimo abaixo:

        int x = 0, y = 30;

        while (x < 10) {
            x++;
            y--;

            JOptionPane.showMessageDialog(null, "x:"+ x + " " + "y:" + y);
        }
    }
}
