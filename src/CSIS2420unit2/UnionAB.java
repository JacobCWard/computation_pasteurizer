package CSIS2420unit2;

//Implementing Sets
//Using hash tables: no order

import java.util.*;
import java.io.*;

public class UnionAB {
	public static void main (String[] args) throws IOException{
		String [] wordArray = utilities.fileToStringArray("awmt.txt");
		List<String> wordList = Arrays.asList(wordArray);
		TreeSet<String> setA = new TreeSet<String>(wordList);
		TreeSet<String> setB = new TreeSet<String>(wordList);
		TreeSet<String> setC;
		Iterator<String> it;

		it = setA.iterator();
		while (it.hasNext()){
			if (!condA(it.next())){
				it.remove();
			}
		}

		for(String s:setA){
			System.out.println(s);
		}
		
		it = setB.iterator();
		while (it.hasNext()){
			if (!condB(it.next())){
				it.remove();
			}
		}

		for(String s:setB){
			System.out.println(s);
		}

		System.out.println("SetA has "+setA.size()+" elements.");
		System.out.println("SetB has "+setB.size()+" elements.");
		
		setC=union(setA,setB);
		System.out.println("The union has "+setC.size()+" elements.");
	}

	public static boolean condA(String str){
		if (str.charAt(0)=='a'||str.charAt(0)=='b'||str.charAt(0)=='c'||str.charAt(0)=='d'){
			return true;
		}
		return false;
	}
	public static boolean condB(String str){
		if (str.charAt(0)=='c'||str.charAt(0)=='d'||str.charAt(0)=='e'||str.charAt(0)=='f'){
			return true;
		}
		return false;
	}
	
	//This is a good way to write a union method: it doesn't alter the input.
	public static TreeSet<String> union (TreeSet<String> A, TreeSet<String> B){
		TreeSet<String> Acopy=new TreeSet<String>();
		Acopy.addAll(A);
		Acopy.addAll(B);
		return Acopy;
	}

}
