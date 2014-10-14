package CSIS2420unit2;

//Implementing Sets
//Using hash tables: no order

import java.util.*;
import java.io.*;

public class FindSetA {
	public static void main (String[] args) throws IOException{
		String [] wordArray = utilities.fileToStringArray("awmt.txt");
		List<String> wordList = Arrays.asList(wordArray);
		TreeSet<String> setA = new TreeSet<String>(wordList);

		Iterator<String> it;

		it = setA.iterator();
		while (it.hasNext()){
			if (!cond(it.next())){
				it.remove();
			}
		}

		for(String s:setA){
			System.out.println(s);
		}

		System.out.println("SetA has "+setA.size()+" elements.");

	}

	public static boolean cond(String str){
		if (str.charAt(0)=='a'||str.charAt(0)=='b'||str.charAt(0)=='c'||str.charAt(0)=='d'){
			return true;
		}
		return false;
	}
}
