package CSIS2420;



import java.math.*;

public class QueueTest{
	
	public static void main(String [] args){
		String s1="My name is Jacob";
		int i=87;
		Character ch='$';
		BigInteger bi= new BigInteger("167895431424573821");
		
		Queue q = new Queue();
		
		System.out.println("This is a test of the Queue class using the print() method");
		
		q.enqueue(s1);
		System.out.println(q.print());
		q.enqueue(i);
		System.out.println(q.print());
		q.enqueue(ch);
		System.out.println(q.print());
		q.enqueue(bi);
		System.out.println(q.print());
		
		q.dequeue(s1);
		System.out.println(q.print());
		q.dequeue(i);
		System.out.println(q.print());
		q.dequeue(ch);
		System.out.println(q.print());
		q.dequeue(bi);
		System.out.println(q.print());
		
		System.out.println("This tests the peek() method in the Queue class");
		q.enqueue(s1);
		q.enqueue(i);
		q.enqueue(ch);
		q.enqueue(bi);
		
		System.out.println(q.peek());
	}

}