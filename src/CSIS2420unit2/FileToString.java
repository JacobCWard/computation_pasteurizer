package CSIS2420unit2;
// Write a file to a string
// Usage: java fileToString filename

import java.io.*;

public class FileToString {
	public static void main(String[] args) throws IOException {
		String data = fileToString("./SUUPrivacyPolicy.txt");
		String str = cleanText(data);
		String[] wordArray = str.split(" ");
		
		for(String s : wordArray){
			System.out.println(s);
		}

		System.out.println("The number of words in our collection = "+ wordArray.length);
	}

	public static String fileToString(String fileName){
		String result = "";
		try{
			FileInputStream file = new FileInputStream(fileName);
			byte[] b = new byte[file.available()];
			file.read(b);
			file.close();
			result = new String(b);
		}
		catch(Exception e){
			System.out.println("ERROR");
		}
		return result;
	}
	
	public static String cleanText (String s){
		s = s.replaceAll("vii\\p{Punct}", "");
		s = s.replaceAll("VI\\p{Punct}", "");
		s = s.replaceAll("vi\\p{Punct}", "");
		s = s.replaceAll("v\\p{Punct}", "");
		s = s.replaceAll("iv\\p{Punct}", "");
		s = s.replaceAll("iii\\p{Punct}", "");
		s = s.replaceAll("ii\\p{Punct}", "");
		s = s.replaceAll("II\\p{Punct}", "");
		s = s.replaceAll("i\\p{Punct}", "");
		
		s = s.replaceAll("\\p{Upper}\\p{Punct}", "");
		s = s.replaceAll("\\d\\p{Punct}", "");
		s = s.replaceAll("\\p{Punct}", "");
		s = s.replaceAll("\\s+", " ");
		
		
		return s;
	}
}
