package CSIS2420;

import java.io.*;

public class utilities {
	public static String[] fileToStringArray(String fileName) throws IOException{
		String data = fileToString(fileName);
		String str = cleanText(data);
		String [] wordArray = str.split(" ");
		
		return wordArray;
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
	
	public static String cleanText(String s){
		s = s.replaceAll("\\p{Punct}","");
		s = s.replaceAll("\\s+"," ");
		
		return s;
		
	}
}
