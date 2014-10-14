package CSIS2420;
//Random Number Generator
import java.util.Random;

public class RandomGenerator{

	public static void main (String[] args) {
		int [] a = randomInts(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		String s = "Random Numbers Generated: ";
		
		for (int i=0;i<a.length;i++) {
			s+=a[i]+" ";
		}
		System.out.println(s);
	}
		
	public static int[] randomInts(int quantity, int range){
		Random r = new Random();
		int[] a = new int[quantity];
		
		for (int i=0;i<a.length;i++) {
			a[i]=r.nextInt(range);
		}
		
		return a;
	}
	
	public static int[] randomInts(int quantity, int range, boolean print){
		Random r = new Random();
		int[] a = new int[quantity];
		
		for (int i=0;i<a.length;i++) {
			a[i]=r.nextInt(range);
		}
		if(print==true){
			String s = "Random Numbers Generated: ";
		
			for (int i=0;i<a.length;i++) {
				s+=a[i]+" ";
			}
			System.out.println(s);
		}
		
		return a;
	}
}