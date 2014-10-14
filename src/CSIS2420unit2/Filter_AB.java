package CSIS2420unit2;

import java.io.*;
import java.util.*;

public class Filter_AB {
	public static void main (String[] args) throws IOException{
		String [] wordArray= utilities.fileToStringArray("awmt.txt");
		List<String> wordList = Arrays.asList(wordArray);
		ArrayList<String> al = new ArrayList<String>(wordList);
		
		Iterator<String> it = al.iterator();
		
		while(it.hasNext()){
			if(!cond(it.next())){
				it.remove();
			}
		}
		
		for(String s:al){
			System.out.println(s);
		}
		System.out.println("al now has this many elements: "+al.size());
	}
	
	public static boolean cond (String str){
		str.toLowerCase();
		return (str.charAt(0)=='a')||(str.charAt(0)=='b');
	}
}
