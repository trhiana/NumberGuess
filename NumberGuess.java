/**
 * @author Rhiana Thelemaque
 */


/**
 * Import packages
 */
import javax.swing.JOptionPane;


public class NumberGuess{
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100 + 1);
        int answer = 0;
        System.out.println("The correct guess would be " + number);
        int count = 1;

        while(answer != number) {
            String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100: ", "Guessing Game", 3);
            answer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, "" + determineGuess(answer, number, count));
            count ++;
        }
    }

    public static String determineGuess(int answer, int number, int count){
        if (answer <= 0 || answer > 100){
            return "Invalid guess";
        }
    }
}