// Given the head of a linked list, remove the nth node from the end of the list and return its head

//   Definition for singly-linked list.
 public class ListNode {
    int val;
    ListNode next;  
    ListNode(int val) { 
        this.val = val; 
    }
    ListNode(int val, ListNode next) {
        this.val = val; 
        this.next = next; 
    }
 }
 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }

        int size = 0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }

        
        if(n==size){
            return head.next;
        }


        int indexToSearch = size-n;
        ListNode prev = head;
        int i = 1;
        while(i<indexToSearch){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return head;
   
    }
}