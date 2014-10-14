package CSIS2420;
// Basic BST

public class TreeS {
	public TreeNodeS root;
	
	public TreeS (String key) {
		root = new TreeNodeS(key);
	}
	
	public void insertNode  (TreeNodeS t, String d) {
		if (d.compareTo(t.getKey()) < 0) {
			if (t.getLeft() == null) {
				t.setLeft(new TreeNodeS(d));
			}
			else {
				insertNode(t.getLeft(),d);	//recursive call
			}
		}
		else if (d.compareTo(t.getKey()) > 0) {
			if (t.getRight() == null) {
				t.setRight(new TreeNodeS(d));
			}
			else {
				insertNode(t.getRight(),d);
			}
		}
	}
	
	//One of the most powerful algorithms you ever see
	public void inOrderTraversal (TreeNodeS node) {
		if (node == null) {
			return;
		}
		
		inOrderTraversal(node.getLeft());
		System.out.println(node.getKey()+" ");
		inOrderTraversal(node.getRight());
		
	}


}