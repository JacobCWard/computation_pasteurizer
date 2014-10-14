package CSIS2420;

import java.io.*;

public class fileToString02 {
	public static void main (String[] args) throws IOException{
		String data = fileToString("/awmt.txt");
		System.out.println(data);
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
