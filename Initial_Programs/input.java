import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        int a = ab.nextInt();
        int b = ab.nextInt();
        int sum = a + b;
        System.out.println(sum);

        ab.close();
    }
}
