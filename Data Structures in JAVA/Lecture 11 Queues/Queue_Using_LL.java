/*
	Following is the structure of the node class for a Singly Linked List

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

*/

public class Queue {
	
	//Define the data members
	private Node front;
	private Node rear;
	int size;


	public Queue() {
		//Implement the Constructor
		front = null;
		rear = null;
		size = 0;
	}
	


	/*----------------- Public Functions of Stack -----------------*/


	public int getSize() { 
		//Implement the getSize() function
		return size;
    }


    public boolean isEmpty() { 
    	//Implement the isEmpty() function
		return (size == 0);
    }


    public void enqueue(int data) {
    	//Implement the enqueue(element) function
		if(front == null){
			Node N = new Node(data);
			front = N;
			rear = N;
			size++;
		}
		else{
			Node N = new Node(data);
			rear.next = N;
			rear = rear.next;
			size++;
		}
    }


    public int dequeue() {
    	//Implement the dequeue() function
		if(front == null){
			return -1;
		}
		int temp;
		temp = front.data;
		front = front.next;
		size--;
		

		return temp;
    }


    public int front() {
    	//Implement the front() function
		if(front == null){
			return -1;
		}
		return front.data;
    }
}
