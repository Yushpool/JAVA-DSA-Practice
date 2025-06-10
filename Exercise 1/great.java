import java.util.*;


public class great {

    public static int greater(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int big = greater(a, b);

        System.out.println("The greater number is: "+big);


        sc.close();

    }
    
}
