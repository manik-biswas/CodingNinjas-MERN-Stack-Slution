
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
        public static void printIthNode(LinkedListNode<Integer> head, int i){
    
            if(head == null){
                return;
            }
    
            int count = 0;
            LinkedListNode<Integer> temp = head;
    
            while(temp != null){
            if(count == i){
                System.out.println(temp.data + " ");
                return;
            }	
            else{
                count ++;
                temp = temp.next;
            }
            }
    
        }
    }