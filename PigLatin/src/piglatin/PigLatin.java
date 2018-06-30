package piglatin;

import java.util.*;
/**
 *
 * @author matthew
 */
public class PigLatin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // get our string to work with 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to convert to pig latin: ");
        String s = input.nextLine();
        
        // okay so now we need to break the string into words to convert
        String[] words = s.split("\\s"); // converts the strings into an array
        String returnString;
        returnString = "";
        
        for (String word : words) {
            // convert the word to pig latin 
            word = word.substring(1) + word.substring(0,1) + "ay";
            
            // build up our return string 
            returnString += word + " ";
        }
        // return our output
        System.out.println(returnString);
    }
    
}
