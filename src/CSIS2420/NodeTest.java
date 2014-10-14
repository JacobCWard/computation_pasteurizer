package CSIS2420;



import java.math.*;

public class NodeTest {
	public static void main(String[] args){
		Character ch = new Character('$');
		BigInteger bi = new BigInteger("123456790987654321");
		
		Node n1 = new Node(bi);
		Node n2 = new Node (ch,n1);
		
		System.out.println(n2.getObject());
		System.out.println(n1.getObject());
		System.out.println(n2.getNext().getObject());
		
		n2.setObject("hello");
		System.out.println(n2.getObject());
		
		n1.setNext(n2);
		System.out.println(n1.getNext().getObject());
	}
}