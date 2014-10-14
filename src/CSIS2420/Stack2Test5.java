package CSIS2420;



import java.math.*;

public class Stack2Test5{
	public static void main (String[] args) {
		String s1="This is a test of the Stack class";
		int i=87;
		Character ch='$';
		BigInteger bi= new BigInteger("167895431424573821");
		
		Stack2 objStack = new Stack2();
		
		objStack.push(s1);
		objStack.push(i);
		objStack.push(ch);
		objStack.push(bi);
		
		System.out.println(objStack.peek());
		
	}
}