import java.util.Scanner;
/**
 * Program Description
 * 1) Reads a temperature and a unit (C or F)
 * 2) Holds the user in a while pit until the unit is C or F
 * 3) Converts F->C or C->F and prints to one decimal place
 * 4) Repeats in a do-while while the user enters yes
 * 
 * @author Tobey Agapito
 * @version v1.0
 * @since 09/25/2026
 */
public class Temperature {
    public static void main (String[] args) {
        String tempText;
        double inputTemp, output;
        char inputUnit;
        String again;

        Scanner keyboard = new Scanner(System.in);

        do{
            System.out.print("Enter a whole number, a space, and C or F (ie 100 F converts to Cels): ");
            tempText = keyboard.next();
            inputTemp = Double.parseDouble(tempText);
            inputUnit = keyboard.next().toUpperCase().charAt(0);

            while (!(inputUnit == 'C' || inputUnit == 'F')) {
                System.out.print("Enter C to convert to F or vice versa: ");
                inputUnit = keyboard.next().toUpperCase().charAt(0);
            }

            if (inputUnit == 'F') {
                output = (inputTemp - 32) * 5.0 / 9;
                System.out.printf("%sF converted is: %.1fC%n", tempText, output);
            }
            else {
                output = inputTemp * 9.0 / 5 + 32;
                System.out.printf("%sC converted is: %.1fF%n", tempText, output);
            }

            System.out.print("Do you want to calculate another temp? If so, enter yes otherwise no: ");
            again = keyboard.next();
        } while (again.equalsIgnoreCase("yes"));
    }
}