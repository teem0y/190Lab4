import java.util.Scanner;
/**
 * Program Description
 * 1) Reads words one at a time until the word quit
 * 2) Moves the first letter to the end, then spells the result backwards
 * 3) If new word matches the original word, it works
 * 4) Repeats in a do-while while the user enters yes
 * 
 * @author Tobey Agapito
 * @version v1.0
 * @since 09/25/2026
 */
public class ReverseWordProblem {
    public static void main (String[] args) {
        String word, remaining, combined, flipped, again;
        char firstLetter;

        Scanner keyboard = new Scanner(System.in);

        do{
            System.out.print("Enter words separated by a space ending with the word quit: ");
            word = keyboard.next().toLowerCase();

            while (!word.equals("quit")) {
                combined = "";
                flipped = "";
                firstLetter = word.charAt(0);
                remaining = word.substring(1);
                combined = remaining + firstLetter;

                for (int i = combined.length() - 1; i >= 0; i--) {
                    flipped += combined.charAt(i);
                }

                if (flipped.equals(word))
                    System.out.println(word + " works");
                else
                    System.out.println(word + " does not work");

                word = keyboard.next().toLowerCase();
            }

            System.out.print("Enter yes to process another line? ");
            again = keyboard.next();
        } while (again.equalsIgnoreCase("yes"));
    }
}