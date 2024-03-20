import java.util.LinkedList;

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
    public static boolean isPalindrome(LinkedListNode<Integer> head) {

		if(head == null){
			return true;
		}

		if(head.data != null && head.next == null){
			return true;
		}

        LinkedListNode<Integer> temp=head,mid,h2;
        mid=midPoint(temp);
        h2=mid.next ;
        mid.next=null;
        h2=reverseIt(h2);
        boolean flag=false;
        while(temp!=null && h2!=null)
        {   flag=false;
         if(temp.data.equals(h2.data))
              flag=true;
		 else{
			 		return false;
			  }
             temp=temp.next;
             h2=h2.next;

        }
        return flag;
    }
    

    private static LinkedListNode<Integer> reverseIt(LinkedListNode<Integer> head)
    {   if(head==null || head.next==null)
        return head;
     LinkedListNode<Integer> tail=head.next;
     LinkedListNode<Integer> ans=reverseIt(head.next);
     tail.next=head;
     head.next=null;
     return ans;


    }

    private static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head){
        LinkedListNode<Integer> slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;}

}