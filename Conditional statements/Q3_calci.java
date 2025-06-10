import java.util.*;

public class Q3_calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter your choice: \n1: Addition\n2: Subtraction\n3: Multiplication\n4: Division\n5: Remainder");
        int choice = sc.nextInt();

        switch(choice){
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4: System.out.println(a/b);
            break;
            case 5: System.out.println(a%b);
            break;
            default: System.out.println("Invalid choice");
        }
        sc.close();

    }
}
