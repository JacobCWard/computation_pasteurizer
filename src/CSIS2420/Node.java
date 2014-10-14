package CSIS2420;
public class Node {
	private Object data;
	private Node next; //Self-referential
	
	public Node (Object obj, Node nextNode) {
		data = obj;
		next = nextNode;
	}
	
	public Node (Object obj) {
		data = obj;
		next = null;
	}
	
	public void setObject (Object obj){
		data = obj;
	}
	
	public Object getObject() {
		return data;
	}
	
	public void setNext (Node nextNode){
		next = nextNode;
	}
	
	public Node getNext(){
		return next;
	}
}