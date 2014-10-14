package CSIS2420;


// Comparing Strings in Java

public class TreeNodeSTest{
	public static void main (String[] args){
		String s1 = "Zebra";
		String s2 = "Antelope";
		String s3 = "Eagle";
		@SuppressWarnings("unused")
		String s4 = "Animal";
		
		TreeNodeS childNode1 = new TreeNodeS(s2);
		TreeNodeS childNode2 = new TreeNodeS(s1);
		TreeNodeS root = new TreeNodeS(s3, childNode1, childNode2);
		
		System.out.println(root.getKey());
		System.out.println();
		System.out.println(root.getLeft().getKey());
		System.out.println();
		System.out.println(root.getRight().getKey());
		System.out.println();
	}


}