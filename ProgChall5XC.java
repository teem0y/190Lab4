import java.util.Scanner;
/**
 * Program Description
 * 1) Reads a phrase and a character from the user
 * 2) Loops through the phrase and counts matches
 * 3) Prints the phrase and the count
 * 
 * @author Tobey Agapito
 * @version v1.0
 * @since 09/25/2026
 */
public class ProgChall5XC {
    public static void main (String[] args) {
        String phrase, charInput;
        char target;
        int count = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a String: ");
        phrase = keyboard.nextLine();
        System.out.print("Enter the char to be assessed: ");
        charInput = keyboard.nextLine().trim();
        target = charInput.charAt(0);

        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == target)
                count++;
        }

        System.out.println("In the phrase: " + phrase);
        System.out.println("There are " + count + " " + target + "'s");
    }
}