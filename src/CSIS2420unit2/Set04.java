package CSIS2420unit2;

//Implementing Sets
//Using hash tables: no order

import java.util.*;
import java.io.*;

public class Set04 {
	public static void main (String[] args) throws IOException{
		String [] wordArray = utilities.fileToStringArray("awmt.txt");
		List<String> wordList = Arrays.asList(wordArray);
		TreeSet<String> setA = new TreeSet<String>(wordList);
		TreeSet<String> setB = new TreeSet<String>(wordList);
		TreeSet<String> setC;
		Iterator<String> it;

		it = setA.iterator();
		while (it.hasNext()){
			if (condG7(it.next())){
				it.remove();
			}
		}

		for(String s:setA){
			System.out.println(s);
		}

		System.out.println("Our set has "+setA.size()+" elements.");
		
		it = setB.iterator();
		while (it.hasNext()){
			if (condLE7(it.next())){
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

	public static boolean condG7(String str){
		if (str.length()>7){
			return true;
		}
		return false;
	}
	
	public static boolean condLE7(String str){
		if (str.length()<=7){
			return true;
		}
		return false;
	}
	
	
	public static TreeSet<String> union (TreeSet<String> A, TreeSet<String> B){
		A.addAll(B);
		return A;
	}
}
