import java.util.*;

public class checkPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String temp = "";

        for(int i = 0; i < input.length(); i++){
            temp += input.charAt(input.length()-i-1);
        }

        System.out.println(temp);
        if(input.toLowerCase().compareTo(temp.toLowerCase())==0){
            System.out.println("Strings are equal and palindrome");

        }

        
        else{
            System.out.println("string is not palindrome");
        }
        sc.close();
    }
    
}
