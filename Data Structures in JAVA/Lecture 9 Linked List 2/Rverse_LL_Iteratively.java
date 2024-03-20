import java.util.concurrent.LinkedBlockingDeque;

/*************** 
     * Following is the Node class already written 
            class LinkedListNode<T> {
                T data;
                LinkedListNode<T> next;

                public Node(T data) {
                    this.data = data;
                }
            }
 ***************/

public class Solution {

	public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head){
        
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */

        if(head == null || head.next == null){
            return head;
        }

        LinkedListNode<Integer> preNode = null, currentNode = head;
        while(currentNode != null){
            LinkedListNode<Integer> nextNode = currentNode.next;
            currentNode.next=preNode;
            preNode = currentNode;
            currentNode=nextNode;
        }
        return preNode;
	}
}