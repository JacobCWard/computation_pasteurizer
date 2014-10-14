package CSIS2420;
// Basic BST

public class Tree {
	public TreeNode root;
	
	public Tree (int key) {
		root = new TreeNode(key);
	}
	
	public void insertNode  (TreeNode t, int d) {
		if (d < t.getKey()) {
			if (t.getLeft() == null) {
				t.setLeft(new TreeNode(d));
			}
			else {
				insertNode(t.getLeft(),d);	//recursive call
			}
		}
		else if (d > t.getKey()) {
			if (t.getRight() == null) {
				t.setRight(new TreeNode(d));
			}
			else {
				insertNode(t.getRight(),d);
			}
		}
	}
	
	public boolean find(int key, TreeNode t){
		if(t == null){
			return false;
		}
		else if(key > t.getKey()){
			return find(key,t.getRight());
		}
		else if(key < t.getKey()){
			return find(key,t.getLeft());
		}
		else if(key == t.getKey()){
			return true;
		}
		return false;
	}
	
	public TreeNode min(TreeNode node){
		if (node.getLeft() == null){
			return node;
		}
		return min(node.getLeft());
	}
	
	public int minValue(TreeNode t){
		return min(t).getKey();
	}
	
	public TreeNode max(TreeNode node){
		if (node.getRight() == null){
			return node;
		}
		return max(node.getRight());
	}
	
	public int maxValue(TreeNode t){
		return max(t).getKey();
	}
	
	public void inOrderTraversal (TreeNode node) {
		
		if (node == null) {
			return;
		}
		
		inOrderTraversal(node.getLeft());
		System.out.println(node.getKey());
		inOrderTraversal(node.getRight());	
	}
}