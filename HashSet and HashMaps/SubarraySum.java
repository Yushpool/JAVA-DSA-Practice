import java.util.*;

public class SubarraySum {
    public static void main(String[] args) {
        int arr[] = {10,2,-2,-20,10};
        int k = -10;
        HashMap<Integer, Integer> mp = new HashMap<>();

        mp.put(0, 1);
        int ans = 0;
        int sum = 0;

        for(int j = 0; j<arr.length; j++){
            sum += arr[j];

            if(mp.containsKey(sum-k)){
                ans += mp.get(sum-k);
            }

            if (mp.containsKey(sum)) {
                mp.put(sum, mp.get(sum)+1);
                
            }else{
                mp.put(sum, 1);
            }
        }
        System.out.println(ans);
    }


    
    
}
