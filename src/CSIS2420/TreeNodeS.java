package CSIS2420;
// Basic Binary Search Tree Node

public class TreeNodeS {
	private String key;
	//private Record myrecord; //We have a key associated with
	private TreeNodeS left;
	private TreeNodeS right;
	
	public TreeNodeS(String s) {
		key = s;
		left = right = null;
	}
	
	public TreeNodeS (String s, TreeNodeS leftNode, TreeNodeS rightNode){
		key = s;
		left = leftNode;
		right = rightNode;
	}
	
	// Normally, we would want a constructor that takes a record
	
	//public TreeNodeS (int n, TreeNodeS leftNode, TreeNodeS rightNode) {
	//this constructor has to be considered from the point of security
	
	public String getKey() {
		return key;
	}
	
	public TreeNodeS getLeft (){
		return left;
	}
	
	public TreeNodeS getRight (){
		return right;
	}
	
	// Be aware that you need to add checking code if you use this in aT
	public void setKey (String s) {
		key = s;
	}
	
	public void setLeft (TreeNodeS leftNode) {
		left = leftNode;
	}
	
	public void setRight (TreeNodeS rightNode) {
		right = rightNode;
	}
	
}