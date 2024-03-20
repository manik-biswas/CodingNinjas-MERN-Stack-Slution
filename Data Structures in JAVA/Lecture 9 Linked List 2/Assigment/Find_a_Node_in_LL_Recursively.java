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

    public static int count = 0;
	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
    	//Your code goes here

         if(head == null ){
              return -1;
          }

          if(head.data == n){
              return count;
          }
          count ++;
         int ans = findNodeRec(head.next, n);
            return ans;
    }

}