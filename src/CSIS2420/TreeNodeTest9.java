package CSIS2420;


// Test driver for TreeNode



public class TreeNodeTest9{
	public static void main (String[] args) {
		int [] a = {29,48,67,94,98,52,86,0,25,27};
		//           0  1  2  3  4  5  6 7  8  9 
		TreeNode [] tn= new TreeNode[a.length];
		String s = "keys are: ";
		
		for(int i=0;i<a.length;i++){
			tn[i] = new TreeNode(a[i]);
			s+=a[i]+" ";
		}
		System.out.println(s);
		
		//29
		tn[0].setRight(tn[1]); //48>29
		tn[1].setRight(tn[2]); //67>48
		tn[2].setRight(tn[3]); //94>67
		tn[3].setRight(tn[4]); //98>94
		tn[2].setLeft(tn[5]);  //48<52<67
		tn[3].setLeft(tn[6]);  //67<86<94
		tn[0].setLeft(tn[7]);  //0<29
		tn[7].setRight(tn[8]); //25>0
		tn[8].setRight(tn[9]); //27>25
		
		System.out.print("traversed/sorted tree: ");
		inOrderTraversal(tn[0]);
	}
	
	public static void inOrderTraversal (TreeNode node) {
		if (node == null) {
			return;
		}
		
		inOrderTraversal(node.getLeft());
		System.out.print(node.getKey()+" ");
		inOrderTraversal(node.getRight());
		
	}
}