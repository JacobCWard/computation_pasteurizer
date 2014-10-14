package CSIS2420;


// Test driver for TreeNode



public class TreeNodeTest2{
	public static void main (String[] args) {
		int num1 = 1000;
		int num2 = 2000;
		int num3 = 3000;
		
		TreeNode child1 = new TreeNode(num1);
		TreeNode child2 = new TreeNode(num2);
		TreeNode root = new TreeNode(num3);
		
		root.setLeft(child1);
		root.setRight(child2);
		
		System.out.println(root.getKey());
	}
}