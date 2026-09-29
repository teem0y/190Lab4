import java.util.Random;
/**
 * Program Description
 * 1) Generates three random ints from 0-999 and prints them
 * 2) Prints a NUMBER BAR CHART header
 * 3) For each number, prints one star per hundred, or "<100 no stars" if under 100
 * 
 * @author Tobey Agapito
 * @version v1.0
 * @since 09/25/2026
 */
public class BarChart {
    public static void main (String[] args) {
        int first, second, third;

        Random generator = new Random();
        first = generator.nextInt(1000);
        second = generator.nextInt(1000);
        third = generator.nextInt(1000);

        System.out.println("Number 1 is: " + first);
        System.out.println("Number 2 is: " + second);
        System.out.println("Number 3 is: " + third);
        System.out.println();

        System.out.println("NUMBER BAR CHART");

        System.out.print("Number 1: ");
        if (first < 100) {
            System.out.print("<100 no stars");
        }
        else {
            for (int i = 0; i < first / 100; i++) {
                System.out.print("*");
            }
        }
        System.out.println();

        System.out.print("Number 2: ");
        if (second < 100) {
            System.out.print("<100 no stars");
        }
        else {
            for (int i = 0; i < second / 100; i++) {
                System.out.print("*");
            }
        }
        System.out.println();

        System.out.print("Number 3: ");
        if (third < 100) {
            System.out.print("<100 no stars");
        }
        else {
            for (int i = 0; i < third / 100; i++) {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}