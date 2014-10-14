package CSIS2420unit2;

//Implementing Sets
//Using hash tables: no order

import java.util.*;
import java.io.*;

public class FindSetB {
	public static void main (String[] args) throws IOException{
		String [] wordArray = utilities.fileToStringArray("awmt.txt");
		List<String> wordList = Arrays.asList(wordArray);
		TreeSet<String> setB = new TreeSet<String>(wordList);

		Iterator<String> it;

		it = setB.iterator();
		while (it.hasNext()){
			if (!cond(it.next())){
				it.remove();
			}
		}

		for(String s:setB){
			System.out.println(s);
		}

		System.out.println("SetB has "+setB.size()+" elements.");

	}

	public static boolean cond(String str){
		if (str.charAt(0)=='c'||str.charAt(0)=='d'||str.charAt(0)=='e'||str.charAt(0)=='f'){
			return true;
		}
		return false;
	}
}
