import java.util.HashSet;

public class removeDup {

    public static void removeD(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
        }

        System.out.println(set);
        
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 1, 2, 3};
        removeD(arr);
        
    }
    
}
