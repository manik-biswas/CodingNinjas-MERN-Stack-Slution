/*

 	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
		T data;
		LinkedListNode<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

*/


public class Solution {

	public static int length(LinkedListNode<Integer> head){
		//Your code goes here

		LinkedListNode<Integer> temp = head;
		int count = 0;
		if(head == null){
			return 0;
		}
		else{
			while(temp != null){
				temp = temp.next;
				count ++;
			}
		}
		return count;
	}
}