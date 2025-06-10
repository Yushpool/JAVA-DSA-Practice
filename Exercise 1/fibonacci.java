import java.util.*;

public class fibonacci {

    public static void fibo(int n) {
        int a = 0, b = 1;  // First two numbers in Fibonacci series

        System.out.print(a + " " + b + " ");  // Print first two numbers

        for (int i = 2; i < n; i++) {  // Start loop from 2 since first two numbers are already printed
            int next = a + b;  // Calculate the next number in the series
            System.out.print(next + " ");  // Print the next number

            a = b;  // Move the previous number forward
            b = next;  // Move the current number forward
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();  // Number of terms to be printed in Fibonacci series

        if (n >= 2) {  // Ensure that at least two terms are printed
            fibo(n);
        } else {
            System.out.println("Please enter a number greater than or equal to 2.");
        }

        sc.close();
    }
}
