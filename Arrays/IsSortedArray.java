import java.util.*;

public class IsSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []nums = new int[size];

        for(int i = 0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(nums);

        
        boolean isAscending = true;

        for(int i = 0; i<size; i++){
            if(nums[i]>nums[i+1]){
                isAscending = false;
            }
        }

        if(isAscending){
            System.out.println("Given array is sorted");
        }
        else{
            System.out.println("Given array is now sorted");
        }
        sc.close();

    }
    
}
