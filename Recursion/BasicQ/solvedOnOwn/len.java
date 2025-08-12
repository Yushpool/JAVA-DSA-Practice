package BasicQ.solvedOnOwn;

public class len {
    public static void findLength(StringBuilder str, int i, int length){
        if(i == str.length()){
            System.out.println(length);
            return;
        }

        char currentChar = str.charAt(i);
        if(currentChar != ' '){
            length++;
        }
        
        findLength(str, i + 1, length);



    }

    public static void main(String[] args) {
        findLength(new StringBuilder("Ayush"), 0, 0);
    }

    
}
