package EasyMediumQ;

import java.util.HashSet;

public class uniqSubSeq {
    
    public static void subS(String str, int idx, String newString, HashSet<String> set){

       if(idx == str.length()){
        if(set.contains(newString)){
            return;
        }else{
            System.out.println(newString);
            set.add(newString);
            return;
        }
       }


        char currChar = str.charAt(idx);

        // choice to be in the new string
        subS(str, idx+1, newString+currChar, set);

        //not to be in it
        subS(str, idx+1, newString, set);


    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subS(str, 0, "", set);
    }
    
}
