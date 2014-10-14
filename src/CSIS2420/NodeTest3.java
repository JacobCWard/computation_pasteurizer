package CSIS2420;


import java.math.*;

public class NodeTest3 {
	public static void main(String[] args){
		String[] information = ("Ward,Jacob,Information Systems,Sophomore").split(",");
		Character ch = new Character('%');
		BigInteger bi = new BigInteger("123456790987654321");
		
		Node n1 = new Node(bi);
		Node n2 = new Node (ch);
		
		Node lName = new Node(information[0]);
		Node fName = new Node(information[1]);
		Node major = new Node(information[2]);
		Node classYear = new Node(information[3]);
		
		System.out.println(n1.getObject());
		System.out.println(n2.getObject());
		System.out.println(lName.getObject());
		System.out.println(fName.getObject());
		System.out.println(major.getObject());
		System.out.println(classYear.getObject());
	}
}