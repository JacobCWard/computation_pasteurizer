package CSIS2420;


//



public class ListTestBack{
	public static void main (String[] args) {
		String[] info = ("Ward,Jacob,Information Systems,Sophomore").split(",");
		
		List lst = new List();
		
		lst.insertAtBack(info[0]);
		lst.insertAtBack(info[1]);
		lst.insertAtBack(info[2]);
		lst.insertAtBack(info[3]);
		
		System.out.println(lst.print());
		
		lst.removeFromBack();
		System.out.println(lst.print());
		lst.removeFromBack();
		System.out.println(lst.print());
		lst.removeFromBack();
		System.out.println(lst.print());
		lst.removeFromBack();
		System.out.println(lst.print());
	}
}