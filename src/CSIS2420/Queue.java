package CSIS2420;
// Implementation of a queue data structure through inheritance.
// Expected functionality of a Queue:
// enqueue: place an object at the end of the queue
// dequeue: remove an object from the front of the queue.
// peek: look at the top element

public class Queue{
	private List q;

	public Queue () {
		q = new List("The Queue");
	}
	
	public void enqueue (Object o) {
		q.insertAtBack(o);
	}
	
	public Object dequeue (Object o) {
		return q.removeFromFront();
	}
	
	public boolean isEmpty () {
		return q.isEmpty();
	}
	
	public Object peek (){
		if(isEmpty()){
			return null;
		}
		return q.getFirstNode().getObject();
	}
	
	// Throw this class away before releasing the product
	// It's very useful in coding up your class
	public String print () {
		return q.print();
	}
}