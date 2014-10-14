package CSIS2420;


// Test driver for the Tree class

public class TreeTest4 {
	public static void main (String[] args) {
		
		int [] a = RandomGenerator.randomInts(1000000,1000000000);
		Tree myTree = new Tree(a[0]);
		
		for (int i =1; i<=a.length-1; i++) {
			//System.out.println("inserting " + a[i]);
			myTree.insertNode(myTree.root, a[i]);
		}

		//System.out.println();
		//System.out.println("After inOrderTraversal");
		
		long startTime = System.currentTimeMillis();
		myTree.inOrderTraversal(myTree.root);
		long endTime = System.currentTimeMillis();
		System.out.println("That took " + (endTime - startTime) + " milliseconds");
	}
}