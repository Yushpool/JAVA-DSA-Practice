import java.util.*;

public class ifelse {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int age = var.nextInt();

        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }

        var.close();
    }
}
