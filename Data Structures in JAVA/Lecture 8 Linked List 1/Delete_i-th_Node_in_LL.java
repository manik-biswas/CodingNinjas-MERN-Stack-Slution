/****************************************************************

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		// Write your code here.

	if(head == null){
		return head;
	}	

	int count = 0;
	LinkedListNode<Integer> temp = head;

	if(pos == 0){
		
		return head.next;
	}
	while(temp.next != null){
		if(pos == count + 1 && temp.next.next != null){
			temp.next = temp.next.next;
			return head;
		}
		else if(pos == count + 1 && temp.next.next == null){
			temp.next = null;
			return head;
		}
		else{
			count ++;
			temp = temp.next;
		}
	}
	  return head;
	}
}
