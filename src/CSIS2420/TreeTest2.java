package CSIS2420;


// Test driver for the Tree class

public class TreeTest2 {
	public static void main (String[] args) {
		int [] a = RandomGenerator.randomInts(10,100,true);
		Tree myTree = new Tree(a[0]);
		
		for (int i =1; i<=a.length-1; i++) {
			myTree.insertNode(myTree.root, a[i]);
		}
		
		System.out.println("max " + myTree.maxValue(myTree.root) + "\n" + "min " + myTree.minValue(myTree.root));
	}
}