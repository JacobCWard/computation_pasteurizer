package CSIS2420;



import java.math.*;

public class ListTest3{
	public static void main (String[] args) {
		BigInteger bi = new BigInteger("110000777788449933");
		String s = new String("Go Thunderbirds!");
		Character ch = new Character('W');
		int i = 1897;
		
		List list1 = new List("First List");
		List list2 = new List("Second List");
		List list3 = new List("Empty List");
		
		list1.insertAtFront(bi);
		list1.insertAtFront(s);
		list1.insertAtFront(ch);
		list1.insertAtFront(i);
		
		System.out.println(list1.print());
		System.out.println("There are "+list1.length()+" items in this list.\n");
		
		list2.insertAtFront(i+200);
		System.out.println(list2.print());
		System.out.println("There are "+list2.length()+" items in this list.\n");
		
		List appendedList1 = List.append(list1,list2);
		System.out.println(appendedList1.print());
		System.out.println("There are "+appendedList1.length()+" items in this list.\n");
		
		List appendedList2 = List.append(list3, list1);
		System.out.println(appendedList2.print());
		System.out.println("There are "+appendedList2.length()+" items in this list.\n");
		
		List appendedList3 = List.append(list1, list3);
		System.out.println(appendedList3.print());
		System.out.println("There are "+appendedList3.length()+" items in this list.\n");
		
	}
}