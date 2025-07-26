package EasyMediumQ;

public class occurance {
    public static int first = -1;
    public static int last = -1;

    public static void occur(String str, int idx, char character){

        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currentChar = str.charAt(idx);
        if(currentChar == character){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
           
    }

    occur(str, idx+1, character);
    
}

public static void main(String[] args) {
    String str = "abcdsaajnaf";
    occur(str, 0, 'a');
}


}
