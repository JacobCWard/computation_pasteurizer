import CSIS2420.List;
import CSIS2420.Node;
import CSIS2420.TreeNode;



public void inOrderTraversal (TreeNode node) {

	if (node == null) {
		return;
	}

	inOrderTraversal(node.getLeft());
	//System.out.println(node.getKey()+" ");
	inOrderTraversal(node.getRight());	
}

public void insertAtFront (Object insertItem){
	if (isEmpty()) {
		firstNode = lastNode = new Node(insertItem);
	}
	else {
		firstNode = new Node(insertItem, firstNode);
	}
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

public class myHashTable {
	public static void main (String [] args){
		List[] hashTable = new List[23];
		int key;
		int value;
		
		//Always initialize object arrays
		for(int i=0; i<hashTable.length; i++){
			hashTable[i] = new List();
		}
		
		for(int i=0; i<15; i++){
			value = (int)(Math.random()*1000);
			key = value % 23; //Hash function
			hashTable[key].insertAtFront(value);
		}
		
		for(int i=0; i<23; i++){
			System.out.println("index "+i+" "+hashTable[i].print());
		}
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