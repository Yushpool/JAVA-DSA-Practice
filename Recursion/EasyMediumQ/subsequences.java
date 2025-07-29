package EasyMediumQ;

public class subsequences {

    public static void subS(String str, int idx, String newString){

        if(idx == str.length()){
            System.out.println(newString);
            return;

        }


        char currChar = str.charAt(idx);

        // choice to be in the new string
        subS(str, idx+1, newString+currChar);

        //not to be in it
        subS(str, idx+1, newString);


    }

    public static void main(String[] args) {
        String str = "abc";
        subS(str, 0, "");
    }
    
}
