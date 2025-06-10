import java.util.*;

public class intFunction {

    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static int calculateProduct(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("Sum of 2 numbers is "+ sum);

        System.out.println("The product of two numbers is "+ calculateProduct(a, b));
         
        sc.close();

    }
}
