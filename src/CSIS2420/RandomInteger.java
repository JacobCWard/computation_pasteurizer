package CSIS2420;
public class RandomInteger{
	public static void main(String[] args){
		int n=Integer.parseInt(args[0]);
		int[] a=new int[n];
		for (int i=0; i < n; i++){
			a[i]=(int)(Math.random()*1000)+1;
			System.out.println("Position "+(i+1)+": "+a[i]);
		}	
	}
}