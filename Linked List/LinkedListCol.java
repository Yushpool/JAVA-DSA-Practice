// Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). 
// Search for the number 7 & display its index.

import java.util.*;

public class LinkedListCol {

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

        for(int i = 0; i<ab.size(); i++){
            if(ab.get(i)==7){
                System.out.println(i);
            }
        }
        


    }
    
}
