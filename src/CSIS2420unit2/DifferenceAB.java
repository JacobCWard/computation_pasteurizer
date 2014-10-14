package CSIS2420unit2;

//Implementing Sets
//Using hash tables: no order

import java.util.*;
import java.io.*;

public class DifferenceAB {
	public static void main(String[] args) throws IOException {
		String[] wordArray = utilities.fileToStringArray("awmt.txt");
		List<String> wordList = Arrays.asList(wordArray);
		TreeSet<String> setA = new TreeSet<String>(wordList);
		TreeSet<String> setB = new TreeSet<String>(wordList);
		Iterator<String> it;

		it = setA.iterator();
		while (it.hasNext()) {
			if (!condA(it.next())) {
				it.remove();
			}
		}

		for (String s : setA) {
			System.out.println(s);
		}

		it = setB.iterator();
		while (it.hasNext()) {
			if (!condB(it.next())) {
				it.remove();
			}
		}

		for (String s : setB) {
			System.out.println(s);
		}

		System.out.println("SetA has " + setA.size() + " elements.");
		System.out.println("SetB has " + setB.size() + " elements.");

		Set<String> difference = new HashSet<String>(setA);
		difference.removeAll(setB);
		System.out.println("The difference has " + difference.size()
				+ " elements.");
	}

	public static boolean condA(String str) {
		if (str.charAt(0) == 'a' || str.charAt(0) == 'b'
				|| str.charAt(0) == 'c' || str.charAt(0) == 'd') {
			return true;
		}
		return false;
	}

	public static boolean condB(String str) {
		if (str.charAt(0) == 'c' || str.charAt(0) == 'd'
				|| str.charAt(0) == 'e' || str.charAt(0) == 'f') {
			return true;
		}
		return false;
	}

}
