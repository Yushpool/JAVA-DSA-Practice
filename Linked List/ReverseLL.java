import java.util.*;

public class ReverseLL {
    public static void main(String[] args) {
        LinkedList<Integer> ab = new LinkedList<>();
        ab.add(1);
        ab.add(5);
        ab.add(7);
        ab.add(3);
        ab.add(8);
        ab.add(2);
        ab.add(3);

        // System.out.println(ab);
        for(int i = 0; i<ab.size();i++){
            System.out.print(ab.get(i));
            System.out.print("->");

        }
        System.out.println("null");
        System.out.println();


        // for(int i = ab.size()-1; i>=0; i--){
        //     System.out.print(ab.get(i));
        //     System.out.print("->");
        // }
        // System.out.println();

        Collections.reverse(ab);
        System.out.println(ab);
    }
    
}
