/** This entire class will have methods to hand operations such as: (will be populated as i bump into more useful string manipulation problems)
 * 1. Checking if a string has all unique chaaracters
 * 2. Checking if two strings are permutations
 * 
 */
import java.util.*;

class StringManip {

    public static boolean isUnique(String s1) {

        // we only use 128 total character, but ASCII is 0 to 255
        if (s1.length() > 128) {
            // returning false if the string has more than 128 characters as it will be duplicates
            return false;
        }
        boolean[] charArray = new boolean[s1.length()];
        for (int i = 0; i <= s1.length(); i++) {
            int j = s1.charAt(i);
            if(charArray[j]) {
                return false;
            } else {
                charArray[j] = true;
            }
        }
        return true; 
    }

    // Check length -> get both strings in a form of character array -> sort -> compare 
    // Also want to know if user wants it to be case sensitive
    public static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1); 
        Arrays.sort(c2);

        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                return false;
            }
        }

        return true;
    }


}