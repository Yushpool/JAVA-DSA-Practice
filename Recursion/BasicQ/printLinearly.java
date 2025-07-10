package BasicQ;
import java.util.*;

public class printLinearly {

    static int num = 1;
    public static void LinearN(int x){
        if(num == x+1){
            return;

        }
        System.out.println(num);
        num++;
        LinearN(x);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        LinearN(N);

        sc.close();

        
    }
    
}
