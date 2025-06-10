import java.util.*;

public class prime {

    public static int isPrime(int n){
        if(n<=1){
            System.out.println("Number is not prime");
            return 0; //not prime

        }
        for(int i = 2; i*i <= n; i++){
            if(n%i == 0){
                System.out.println("The number is not prime");
                return 0;
            }

        }

        System.out.println("Number is prime");
        return 1;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        isPrime(n);

        sc.close();


    }
    
}
