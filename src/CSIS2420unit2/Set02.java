package CSIS2420unit2;

//Implementing Sets
//Using hash tables: no order

import java.util.*;
import java.io.*;

public class Set02 {
	public static void main (String[] args) throws IOException{
		String [] wordArray = utilities.fileToStringArray("awmt.txt");
		List<String> wordList = Arrays.asList(wordArray);
		TreeSet<String> ts = new TreeSet<String>(wordList);
		
		for(String s:ts){
			System.out.println(s);
		}
		
		System.out.println("Our set has "+ts.size()+" elements.");
	}
}
