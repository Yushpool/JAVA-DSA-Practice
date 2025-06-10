import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();

        if (var % 2 ==0) {
            System.out.println("Number is even.");
            
        } else{
            System.out.println("Number is odd.");
        }
         sc.close();
    }
}
