// import java.util.*;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "geet";
        String t = "Teeg";

        if(s.length() != t.length()){
            System.out.println("Given strings are not anagrams");
        }
        else{
            char sArr[] = s.toLowerCase().toCharArray();
            char tArr[] = t.toLowerCase().toCharArray();

            Arrays.sort(sArr);
            Arrays.sort(tArr);

            if(Arrays.equals(sArr, tArr)){
                System.out.println("It is an valid anagram");
            }
            else{
                System.out.println("It is not valid anagram");
            }
        }
        

        
    }
    
}
