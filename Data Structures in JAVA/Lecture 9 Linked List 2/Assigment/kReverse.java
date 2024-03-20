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

	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		//Your code goes here
     
        if(head==null || k==0 )
        return head;
        LinkedListNode<Integer>current=head,prev=null,fdw=null;
        int count =0;
        while(count<k && current!=null){
            fdw=current.next;
            current.next=prev;
            prev= current;
            current=fdw;
            count++;
        }
        if(fdw!=null){
            head.next=kReverse(fdw,k);
        }
        return prev;
	}

}