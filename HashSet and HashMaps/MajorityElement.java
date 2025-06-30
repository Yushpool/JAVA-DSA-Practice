import java.util.*;

public class MajorityElement {

    public static void majorityElement(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1); // ✅ fixed here
            } else {
                map.put(nums[i], 1);
            }
        }

        // Print elements that appear more than n/3 times
        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 2};
        majorityElement(nums);
    }
}
