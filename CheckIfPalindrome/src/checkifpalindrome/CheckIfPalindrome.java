package checkifpalindrome;

import java.util.*;

/**
 * Checks if a given string is a palindrome (e.g. "racecar")
 * 
 * @author matthew
 */
public class CheckIfPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // get our input 
        Scanner io = new Scanner(System.in);
        System.out.print("Enter a string and check if it is a palindrome: ");
        String s = io.nextLine().toLowerCase();
        
        //reverse our string and compare
        String reverseString = new StringBuilder(s).reverse().toString();
        
        if (s.equals(reverseString)) {
            System.out.println(s + " is a palindrome!");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }
    
}
