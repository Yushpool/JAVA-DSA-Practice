// Take elements(numbers in the range of 1-50) of a Linked List as input from the user. 
// Delete all nodes which have values greater than 25

import java.util.*;

public class manipulateLL {
    public static void main(String[] args) {
        LinkedList<Integer> del = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 7 elements in range of 1-50 :");
        del.add(sc.nextInt());
        del.add(sc.nextInt());
        del.add(sc.nextInt());
        del.add(sc.nextInt());
        del.add(sc.nextInt());
        del.add(sc.nextInt());
        del.add(sc.nextInt());


        for(int i = 0; i<del.size();i++){
            System.out.print(del.get(i));
            System.out.print("->");

        }
        System.out.println("null");
        System.out.println();

        //iterating with cleanest way
//         Iterator<Integer> it = del.iterator();
// while (it.hasNext()) {
//     if (it.next() > 25) {
//         it.remove();
//     }
// }


        // System.out.println(del);

        for (int i = del.size() - 1; i >= 0; i--) {

            if (del.get(i) > 25) {
                del.remove(i);
    }
}




        for(int i = 0; i<del.size();i++){
            System.out.print(del.get(i));
            System.out.print("->");

        }
        System.out.println("null");
        System.out.println();

        sc.close();
        
    }
    
}
