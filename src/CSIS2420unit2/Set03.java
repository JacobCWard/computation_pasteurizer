package CSIS2420unit2;

//Implementing Sets
//Using hash tables: no order

import java.util.*;
import java.io.*;

public class Set03 {
	public static void main (String[] args) throws IOException{
		String [] wordArray = utilities.fileToStringArray("awmt.txt");
		List<String> wordList = Arrays.asList(wordArray);
		TreeSet<String> setA = new TreeSet<String>(wordList);
		TreeSet<String> setC;
		Iterator<String> it;

		it = setA.iterator();
		while (it.hasNext()){
			if (condAB(it.next())){
				it.remove();
			}
		}

		for(String s:setA){
			System.out.println(s);
		}

		System.out.println("Our set has "+setA.size()+" elements.");
		
		setC=union(setA,setA);
		
		System.out.println("Our set has "+setC.size()+" elements.");
		
	}

	public static boolean condAB(String str){
		String s = str.toLowerCase();
		if (s.compareTo("c")>=0){
			return true;
		}
		return false;
	}
	
	public static TreeSet<String> union (TreeSet<String> A, TreeSet<String> B){
		A.addAll(B);
		return A;
	}
}
