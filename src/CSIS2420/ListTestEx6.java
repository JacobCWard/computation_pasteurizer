package CSIS2420;



import java.math.*;

public class ListTestEx6{
	public static void main (String[] args) {
		
		BigInteger bi = new BigInteger("110000777788449933");
		String s = new String("Go Thunderbirds!");
		Character ch = new Character('W');
		int i = 1897;
		
		List lst = new List();
		
		lst.insertAtFront(bi);
		lst.insertAtFront(s);
		lst.insertAtFront(ch);
		lst.insertAtFront(i);
		
		Node n = lst.getLastNode();
		n.setNext(lst.getFirstNode());
		lst.setLastNode(n);
		
		System.out.println(lst.print());
	}
}