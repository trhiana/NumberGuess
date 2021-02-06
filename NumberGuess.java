/**
 * @author Rhiana Thelemaque
 */


/**
 * Import packages
 */

public class NumberGuess{
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100 + 1);
        int answer = 0;
        System.out.println("The correct guess would be " + number);
        int count = 1;
    }
}