package CSIS2420;
//List Test Driver - Squares 1-100



public class SquaresList{
	public static void main (String[] args) {
		List squares = new List("Squares");
		
		for(int i=1;i<=100;i++){
			squares.insertAtBack((int)Math.pow(i,2));
		}
		
		System.out.println(squares.print());
	}
}