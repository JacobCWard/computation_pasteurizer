package CSIS2420unit2;

//Using TreeMaps
//Count how many times each word appears

import java.io.*;
import java.util.*;

public class countwords {
	public static void main (String[] args) throws IOException{
		String [] wordArray = utilities.fileToStringArray("awmt.txt");
		List<String> wordList = Arrays.asList(wordArray); //All the words in text
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		String key;
		Integer value;
		Iterator<String> it = wordList.iterator();
		
		while(it.hasNext()){
			key = it.next().toLowerCase();
			value = tm.get(key);
			if(value==null){
				tm.put(key,1);
			}
			else{
				tm.put(key,value+1);
			}
		}
		
		Set<String> allKeys = tm.keySet();
		Iterator<String> ki = allKeys.iterator();
		
		/*
		while (ki.hasNext()){
			key = ki.next();
			value = tm.get(key);
			System.out.println(key+" -> "+value);
			
		}
		*/
		
		OrderedPair[] opArray = new OrderedPair[allKeys.size()];
		int index = 0;
		
		while(ki.hasNext()){
			key = ki.next();
			value = tm.get(key);
			opArray[index++] = new OrderedPair(key,value);
		}
		
		List<OrderedPair> opList = Arrays.asList(opArray);
		Collections.sort(opList);
		System.out.println(opList);
	}
}
