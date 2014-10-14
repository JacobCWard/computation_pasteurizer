package CSIS2420;


public class StringTest{
	public static void main (String[] args){
		String s1 = "Zebra";
		String s2 = "Antelope";
		String s3 = "Eagle";
		String s4 = "Animal";
		
		System.out.println("Comparing Zebra to Antelope: " + s1.compareTo(s2));
		System.out.println("Comparing Antelope to Zebra: " + s2.compareTo(s1));
		System.out.println("Comparing Zebra to Eagle: " + s1.compareTo(s3));
		System.out.println("Comparing Antelope to Animal: " + s2.compareTo(s4));
	}


}