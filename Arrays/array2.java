import java.util.*;


public class array2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];

        //input
        for(int i =0; i<size; i++){
            num[i] = sc.nextInt();

        }

        //output
        System.out.print("["); 
        for(int i = 0; i<size; i++){
            System.out.print(num[i]+" ");
        }
        System.out.print("]");

        sc.close();
    }
    
}
