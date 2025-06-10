import java.util.*;

public class average {

    public static void avg(int a, int b, int c){
        int avg = (a+b+c)/3;
        System.out.println("The average of given numbers is "+avg);
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        avg(a, b, c);

        sc.close();


    }

    
}