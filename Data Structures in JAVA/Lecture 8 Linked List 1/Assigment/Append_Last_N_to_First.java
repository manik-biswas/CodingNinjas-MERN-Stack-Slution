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

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		//Your code goes here
		if(head==null || n==0){
            return head;
        
           
        }
        int count=0;
        LinkedListNode<Integer> temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        
        temp=head;
        int i=1;
        while(i<(count-n) && temp!=null){
            temp=temp.next;
            i++;
        }
        LinkedListNode<Integer> head2 = temp.next;
        LinkedListNode<Integer> temp2 = temp.next;
        
        temp.next=null;
        
        while(temp2.next!=null){
            temp2=temp2.next;
            
        }
        temp2.next=head;
        return head2;
	}

}
