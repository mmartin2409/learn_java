package reverseastring;

import java.util.Scanner;
/**
 *
 * @author matthew
 */
public class ReverseAString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // get our scanner
        Scanner input = new Scanner(System.in);
        
        String s, reverseString;
        System.out.print("Enter a string: ");
        s = input.next();
        
        // reverse our string 
        reverseString = new StringBuilder(s).reverse().toString();
        
        //print my string to screen
        System.out.println("Your string backwards is: " + reverseString);
    }
}
