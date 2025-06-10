import java.util.*;

public class printIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[] = new int[size];

        for(int i = 0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        //code to display array
        // System.out.print("[");
        // for(int i = 0; i<size; i++){
        //     System.out.print(nums[i] + " ");
        // }
        // System.out.println("]");
           
        //program to find number index
        int x = sc.nextInt();

        //output
        for(int i = 0; i<size; i++){
            if(nums[i]==x){
                System.out.println("x found at the index: " +i);

            }
        }
        sc.close();
    }
}
