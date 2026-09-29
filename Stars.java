import java.util.Scanner;
/**
 * Program Description
 * 1) Gets a max width from the user
 * 2) Top half: lines 1 to width/2+1, spaces shrink, stars grow by 2
 * 3) Bottom half: lines width/2 down to 1, spaces grow, stars shrink by 2
 * 
 * @author Tobey Agapito
 * @version v1.0
 * @since 09/25/2026
 */
public class Stars {
    public static void main (String args[]) {
        int width, line, spaces, stars;
        Scanner keyboard = new Scanner(System.in);
 
        System.out.print("Enter max width for stars: ");
        width = keyboard.nextInt();
        if (width % 2 == 0)
            width++;
 
        for (line = 1, spaces = width / 2; line <= width / 2 + 1; line++, spaces--){
            for (int i = 1; i <= spaces; i++){
                System.out.print(" ");
            }
            for (stars = 1; stars <= line * 2 - 1; stars++){
                System.out.print("*");
            }
            System.out.println("");
        }
 
        for (line = width / 2, spaces = 1; line > 0; line--, spaces++){
            for (int i = 1; i <= spaces; i++){
                System.out.print(" ");
            }
            for (stars = 1; stars <= line * 2 - 1; stars++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
 











