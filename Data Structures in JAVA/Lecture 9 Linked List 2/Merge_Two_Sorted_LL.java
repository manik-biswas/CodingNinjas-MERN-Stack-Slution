/*

    Following is the Node class already written for the Linked List

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }

*/

public class Solution {
    
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        //Your code goes here
       if(head1 == null){
           return head2;
       } 
       if(head2 == null){
           return head1;
       }
       LinkedListNode<Integer> h1 = head1, h2 = head2, head = null, tail = null;

       if(head1.data <= head2.data){
           head = h1;
           tail = h1;
           h1 = h1.next;
       }
       else{
           head = h2;
           tail = h2;
           h2 = h2.next;
       }
            
       while(h1 != null && h2 != null){
           if(h1.data <= h2.data){
               tail.next = h1;
               tail = h1;
               h1 = h1.next;
           }
           else{
               tail.next = h2;
              tail = tail.next;
              h2 = h2.next;
           }
       }
        if(h1 == null){
            tail.next = h2;
        }
        if(h2 == null){
            tail.next = h1;
        }
       return head;

    }

}