package CSIS2420;
// Basic Binary Search Tree Node

public class TreeNode {
	private int key;
	//private Record myrecord; //We have a key associated with
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(int n) {
		key = n;
		left = right = null;
	}
	
	public TreeNode (int n, TreeNode leftNode, TreeNode rightNode){
		key = n;
		left = leftNode;
		right = rightNode;
	}
	
	// Normally, we would want a constructor that takes a record
	
	//public TreeNode (int n, TreeNode leftNode, TreeNode rightNode) {
	//this constructor has to be considered from the point of security
	
	public int getKey() {
		return key;
	}
	
	public TreeNode getLeft (){
		return left;
	}
	
	public TreeNode getRight (){
		return right;
	}
	
	// Be aware that you need to add checking code if you use this in aT
	public void setKey (int n) {
		key = n;
	}
	
	public void setLeft (TreeNode leftNode) {
		left = leftNode;
	}
	
	public void setRight (TreeNode rightNode) {
		right = rightNode;
	}
	
}