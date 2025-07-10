package BasicQ;

import java.util.Scanner;

public class backwards {
    
    // static int num = 1;
    public static void backLinearN(int x){
        if(x == 0){
            return;

        }
        System.out.println(x);
        x--;
        backLinearN(x);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        backLinearN(N);

        sc.close();
    }
}
