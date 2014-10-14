package CSIS2420unit2;

//Implementing Sets
//Using hash tables: no order

import java.util.*;
import java.io.*;

public class Set01 {
	public static void main (String[] args) throws IOException{
		String [] wordArray = utilities.fileToStringArray("awmt.txt");
		List<String> wordList = Arrays.asList(wordArray);
		HashSet<String> hs = new HashSet<String>(wordList);
		
		for(String s:hs){
			System.out.println(s);
		}
		
		System.out.println("Our set has "+hs.size()+" elements.");
	}
}
