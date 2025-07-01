import java.util.*;

public class intersectionOfTwoArr {
    public static int interSection(int arr1[], int arr2[]){
        int count = 0;
        HashSet<Integer> st = new HashSet<>();

        for(int i = 0; i<arr1.length; i++){
            st.add(arr1[i]);
        }

        for(int j =0; j<arr2.length; j++){
            if(st.contains(arr2[j])){
                count++;
                st.remove(arr2[j]);
            }


        }

        return count;

    }

    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        System.out.println(interSection(arr1, arr2));
    }

    
}