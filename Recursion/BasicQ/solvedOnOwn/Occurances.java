package BasicQ.solvedOnOwn;

public class Occurances {

    public static void findOccr(int i, int [] arr, String str){
        if(i == arr.length){
            System.out.println(str);
            return;
           
        }

        if(arr[i] == 2){
            str += i;
        }
        findOccr(i+1, arr, str);
    }

    public static void main(String[] args) {
        int [] arr = {3,2,4,5,6,2,7,2,2};
        findOccr(0, arr, "");
       
        
        
    }
    
}
