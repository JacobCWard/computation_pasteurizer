package CSIS2420;
// Simple List Class

public class List {
	private Node firstNode;
	private Node lastNode;
	private String name;
	
	public List () {
		name = "default list";
		firstNode = lastNode = null;
	}
		
	public List (String s) {
		name = s;
		firstNode = lastNode = null;
	}
	
	public Node getFirstNode (){
		return firstNode;
	}
	
	public void setFirstNode(Node firstNode){
		this.firstNode=firstNode;
	}
	
	public Node getLastNode (){
		return lastNode;
	}
	
	public void setLastNode(Node lastNode){
		this.lastNode=lastNode;
	}
	
	public void insertAtFront (Object insertItem){
		if (isEmpty()) {
			firstNode = lastNode = new Node(insertItem);
		}
		else {
			firstNode = new Node(insertItem, firstNode);
		}
	}
	
	public Object removeFromFront (){
		Object removeItem = null;
		if (isEmpty()) {
			removeItem = "This list is empty!";
			return removeItem;
		}
		removeItem = firstNode.getObject();
		if (firstNode.equals(lastNode)) {
			firstNode = lastNode = null;
		}
		else {
			firstNode = firstNode.getNext();
		}
		return removeItem;
	}
	
	public void insertAtBack(Object insertItem){
		if (isEmpty()) {
			 lastNode = firstNode = new Node(insertItem);
		}
		else {
			Node currentNode = new Node(insertItem);
			lastNode.setNext(currentNode);
			lastNode = currentNode;
		}
	}
	
	public Object removeFromBack(){
		Object removeItem = null;
		if (isEmpty()) {
			removeItem = "This list is empty!";
			return removeItem;
		}
		removeItem = lastNode.getObject();
		if (lastNode.equals(firstNode)) {
			lastNode = firstNode = null;
		}
		else {
			Node currentNode = firstNode;
			while(currentNode.getNext()!=lastNode){
				currentNode = currentNode.getNext();
			}
			lastNode = currentNode;
			lastNode.setNext(null);
		}
		return removeItem;
	}
	
	public static List append(List list1, List list2){
		List appendedList = new List(list1.name +" plus "+list2.name);
		if(list1.isEmpty()&&list2.isEmpty()){
			return appendedList;
		}
		else{
			if(list1.isEmpty()){
				appendedList.firstNode=appendedList.lastNode=null;
			}
			else{
				Node current = new Node(list1.firstNode.getObject(),list1.firstNode.getNext());
				while(current!=null){
					appendedList.insertAtBack(current.getObject());
					current=current.getNext();
				}
			}
			if(list2.isEmpty()){
				return appendedList;
			}
			else{
				Node current = new Node(list2.firstNode.getObject(),list2.firstNode.getNext());
				while(current!=null){
					appendedList.insertAtBack(current.getObject());
					current=current.getNext();
				}
			}
		}
		return appendedList;
	}

	public String print () {
		String result = "";
		String newline = "\n";
		int counter = 0;
		int stop = 2;
		if (isEmpty()) {
			result += name + " is Empty" + newline;
			return result;
		}
		result += name + " contains: " + newline;
		Node current = firstNode;
		while ((current != null)&&(counter<stop)) {
			result += current.getObject() + newline;
			if(current.equals(lastNode)){
				counter++;
				if(counter==stop){
					result += "Error: Infinite Loop";
				}
			}
			current = current.getNext();
			
		}
		
		return result;
	}
	
	public int length(){
		int length = 0;
		if(isEmpty()){
			return length;
		}
		else{
			Node currentNode=firstNode;
			while(currentNode!=null){
				length++;
				currentNode = currentNode.getNext();
			}
			return length;
		}
	}
	
	public boolean isEmpty(){
		return (firstNode == null);
	}
	

}