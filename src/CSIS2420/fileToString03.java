package CSIS2420;

import java.io.*;

public class fileToString03 {
	public static void main (String[] args) throws IOException{
		String data = fileToString("awmt.txt");
		String [] wordArray = data.split(" ");
		
		for(String s: wordArray){
			System.out.println(s);
		}
		
		System.out.println("The number of words in our collection = " + wordArray.length);
	}
	
	public static String fileToString (String fileName) throws IOException{
		String result = "";
		try {
			FileInputStream file = new FileInputStream(fileName);
			byte[] b = new byte[file.available()];
			file.read(b);
			file.close();
			result = new String (b);
		} catch (FileNotFoundException e) {
			System.out.println("oops");
		}
		return result;
		
	}
}
