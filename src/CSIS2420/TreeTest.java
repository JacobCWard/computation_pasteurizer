package CSIS2420;


// Test driver for the Tree class

public class TreeTest {
	public static void main (String[] args) {
		Tree myTree = new Tree(50);
		int n;
		//System.out.println("Original List");
		for (int i =1; i<=50; i++) {
			n = (int) (Math.random()*100)+1;
			myTree.insertNode(myTree.root, n);
			//System.out.println(n + " ");
		}
		
		System.out.println();
		System.out.println("After inOrderTraversal");
		myTree.inOrderTraversal(myTree.root);
	}
}