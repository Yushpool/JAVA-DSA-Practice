package EasyMediumQ;

public class isSorted {

    public static boolean sort(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }


        if(arr[idx]< arr[idx+1]){
            return sort(arr, idx+1);
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,4,7,9,8};
        System.out.println(sort(arr, 0));
    }
    
}
