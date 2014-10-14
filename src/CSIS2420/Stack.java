package CSIS2420;
// A simple stack created using Inheritance
// The ADT of the Stack class:
// push, pop, peek, isEmpty

public class Stack extends List {
	public Stack() {
		super("The stack");
	}
	
	public void push (Object obj) {
		super.insertAtFront(obj);
	}
	
	public Object pop () {
		return super.removeFromFront();
	}
	
	public boolean isEmpty() {
		return super.isEmpty();
	}
	
	public String print () {
		return super.print();
	}
}