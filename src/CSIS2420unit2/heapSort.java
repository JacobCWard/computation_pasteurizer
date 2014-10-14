package CSIS2420unit2;

import java.io.*;
import java.util.*;

public class heapSort {
	public static void main (String[] args) throws IOException{
		String [] wordArray= utilities.fileToStringArray("awmt.txt");
		List<String> wordList = Arrays.asList(wordArray);
		Queue<String> queue = new PriorityQueue<String>(wordList);
		
		while(!queue.isEmpty()){
			System.out.println(queue.poll());
		}
	}
}
