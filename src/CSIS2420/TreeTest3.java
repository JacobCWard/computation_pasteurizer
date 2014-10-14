package CSIS2420;


// Test driver for the Tree class

public class TreeTest3 {
	public static void main (String[] args) {
		boolean b=false;
		
		while(b==false){
			int [] a = RandomGenerator.randomInts(10,20,true);
			Tree myTree = new Tree(a[0]);
			
			for (int i =1; i<=a.length-1; i++) {
				myTree.insertNode(myTree.root, a[i]);
			}
			
			b=myTree.find(5,myTree.root);
			System.out.println("Does the Tree contain 5? " + b + "\n");
		
		}
	}
}