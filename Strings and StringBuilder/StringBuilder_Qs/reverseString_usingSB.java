import java.util.*;

public class reverseString_usingSB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bro = sc.next();
        StringBuilder sb = new StringBuilder(bro);

        for(int i =0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
        sc.close();
    }

    
}