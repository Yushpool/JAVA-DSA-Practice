import java.util.*;

public class evenO {

    public static void evenOrOdd(int n){
        if(n%2 == 0){
            System.out.println("Number is even");
            return;
        } else{
            System.out.println("The number is odd");
            return;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        evenOrOdd(n);

        sc.close();


    }
}
