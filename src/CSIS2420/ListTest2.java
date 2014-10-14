package CSIS2420;



import java.math.*;

public class ListTest2{
	public static void main (String[] args) {
		
		BigInteger bi = new BigInteger("110000777788449933");
		String s = new String("Go Thunderbirds!");
		Character ch = new Character('W');
		int i = 1897;
		
		List lst = new List("Test List");
		
		lst.insertAtFront(bi);
		lst.insertAtFront(s);
		lst.insertAtFront(ch);
		lst.insertAtFront(i);
		
		System.out.println(lst.print());
		
		System.out.println("There are "+lst.length()+" items in this list.\n");
		
		for(int j=lst.length(); j!=0; j--){
			lst.removeFromFront();
			System.out.println(lst.print());
			System.out.println("There are "+lst.length()+" items in this list.\n");
		}
		
	}
}