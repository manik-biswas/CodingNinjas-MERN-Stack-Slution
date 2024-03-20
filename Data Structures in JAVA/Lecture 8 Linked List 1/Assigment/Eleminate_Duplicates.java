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

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {

		   LinkedListNode<Integer> head1 = head;
		   while(head1 != null && head1.next != null){
		
               if(head1.data.equals(head1.next.data)){
				   head1.next = head1.next.next;
			   }else{
				   head1 = head1.next;
			   }  
			   } 
		   return head;
	}

}