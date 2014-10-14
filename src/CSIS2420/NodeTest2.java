package CSIS2420;




public class NodeTest2 {
	public static void main(String[] args){
		String[] information = ("Ward,Jacob,Information Systems,Sophomore").split(",");
		
		Node lName = new Node(information[0]);
		Node fName = new Node(information[1]);
		Node major = new Node(information[2]);
		Node classYear = new Node(information[3]);
		
		System.out.println(lName.getObject());
		System.out.println(fName.getObject());
		System.out.println(major.getObject());
		System.out.println(classYear.getObject());
	}
}