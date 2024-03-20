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

	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		//Your code goes here
        LinkedListNode<Integer> oddHead = null , oddTail = null, evenHead = null , evenTail = null ;
        if(head == null || head.next == null){
            return head;
        }

        while(head != null){

            if(head.data % 2 == 0){
                if(evenHead == null){
                    evenHead = head;
                    evenTail = head;
                    head = head.next;
                }
                else{
                    evenTail.next = head;
                    evenTail = head;
                    head = head.next;
                }
            }

            else{
                if(oddHead == null){
                    oddHead = head;
                    oddTail = head;
                    head = head.next;
                }
                else{
                    oddTail.next = head;
                    oddTail = head;
                    head = head.next;
                }
            }   
        }

        if(evenTail != null){
            evenTail.next = null;
        }

        if(oddTail != null){
            oddTail.next = null;
        }

        if(oddHead == null){
            return evenHead;
        }

        if(evenHead == null){
            return oddHead;
        }

        oddTail.next = evenHead;
        return oddHead;
	}
}