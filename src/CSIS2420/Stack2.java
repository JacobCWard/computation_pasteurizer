package CSIS2420;
// Inheritance allows too much access.
// This could be a security nightmare.
// We should use composition.
// We declare a private List and put in only those methods that are part of the definition of the Stack.
// An Abstract Data Type: the definition of the functionality of the type.

public class Stack2{
	private List s;

	public Stack2() {
		s = new List("The Stack");
	}
	
	public void push (Object obj) {
		s.insertAtFront(obj);
	}
	
	public Object pop () {
		return s.removeFromFront();
	}
	
	public boolean isEmpty() {
		return s.isEmpty();
	}
	
	public Object peek() {
		if(isEmpty()){
			return null;
		}
		return s.getFirstNode().getObject();
	}
	
	public String print () {
		return s.print();
	}
}