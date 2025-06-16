import java.util.*;

public class findCumulativeLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1: ");
        StringBuilder sb = new StringBuilder(sc.next());
        System.out.println("Enter string 2: ");
        StringBuilder sk = new StringBuilder(sc.next());

        sb.append(sk);
        System.out.println(sb);
        System.out.println(sb.length());

        sc.close();




    }
    
}
