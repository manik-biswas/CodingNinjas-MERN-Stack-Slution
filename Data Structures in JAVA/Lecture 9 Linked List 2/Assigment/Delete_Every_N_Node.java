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
	
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
		//Your code goes here

        if(head == null){
            return head;
        }
        if(M == 0){
            return null;
        }
        LinkedListNode<Integer> newHead = head, temp = head;
        while(head != null){
            for(int i =0; i < M-1; i++){
                if(head == null){
                    return newHead;
                }
                head = head.next;
            }
            temp = head;

            for(int j = 0; j < N+1; j++){
                if(head == null){
                    temp.next = head;
                    return newHead;
                }
                head = head.next;
            }
            temp.next = head;
        }
        return newHead;
	}
}