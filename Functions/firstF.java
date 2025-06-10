import java.util.*;

public class firstF {

    public static void printMyName(String name){
        System.out.print("Hello "+name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name); //call of the function
        sc.close();
     }
}