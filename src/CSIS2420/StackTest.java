package CSIS2420;



import java.math.*;

public class StackTest{
	public static void main (String [] args){
		Character ch = new Character('S');
		BigInteger bi1 = new BigInteger("1234567890987654321");
		double d = 3.141592654;
		boolean b = true;

		Stack objStack = new Stack();

		objStack.push(ch);
		objStack.push(bi1);
		objStack.push("nanometer");
		objStack.push(31415);
		objStack.push(d);
		objStack.push(b);
		
		System.out.println(objStack.print());

		for(int i=0; i<6;i++){
			objStack.pop();
			System.out.println(objStack.print());
		}
	}
}