package countvowels;

import java.util.*;

/**
 * This program counts the number of vowels in a given string
 * 
 * @author matthew
 */
public class CountVowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // get our input
        Scanner io = new Scanner(System.in);
        System.out.print("Enter a string to see a vowel count: ");
        String s = io.nextLine().toLowerCase();
        char[] stringArray = s.toCharArray();
        
        // somewhat disgusting but works 
        int aCount = 0; 
        int eCount = 0; 
        int iCount = 0; 
        int oCount = 0;
        int uCount = 0;
        int vowelCount = 0;
        
        for (char i : stringArray) {
            // check if we are a vowel
            if (i == 'a') {
                aCount++;
                vowelCount++;
            } else if  (i == 'e') {
                eCount++;
                vowelCount++;
            } else if (i == 'i') {
                vowelCount++;
                iCount++;
            } else if (i == 'o') {
                vowelCount++;                
                oCount++;
            } else if (i == 'u') {
                vowelCount++;
                uCount++;
            } 
            
        }
        // print our counts 
        System.out.println("Total Vowel Count: " + vowelCount);
        System.out.println("Breakdown:");
        System.out.println("A : " + aCount);
        System.out.println("E : " + eCount);
        System.out.println("I : " + iCount);
        System.out.println("O : " + oCount);
        System.out.println("U : " + uCount);
    }
    
}
