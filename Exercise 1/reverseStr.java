import java.util.*;

public class reverseStr {
    public static void reverse(String str){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            st.push(str.charAt(i));
        }

        String str2 = "";
        for(int i = 0; i<str.length(); i++){
            str2 += st.pop();
        }
        System.out.println(str2);

    }


    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String str = sc.next();
        reverse(str);
    }

    
}