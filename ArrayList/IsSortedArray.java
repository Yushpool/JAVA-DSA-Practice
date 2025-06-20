import java.util.*;

public class IsSortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(34);
        list.add(42);
        list.add(2, 46);

        System.out.println(list);
        Collections.sort(list);
        // System.out.println(list);
        System.out.println(list.get(0));

        boolean isTrue = true;

        for(int i = 0; i<list.size()-1; i++){
        if(list.get(i)> list.get(i+1)){
            isTrue = false;
            break;

        }
    }

    if(isTrue){
        System.out.println("Array is sorted");
    }else{
        System.out.println("Array is not sorted");
    }
        
    }
    
    
}
