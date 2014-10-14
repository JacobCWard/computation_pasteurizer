package CSIS2420;

import java.io.*;

public class fileToString {
	public static void main (String[] args) throws IOException{
		FileInputStream file = new FileInputStream(args[0]);
		byte[] b = new byte[file.available()];
		System.out.println("Number of bytes in this file = " + file.available());
		file.read(b);
		file.close();
		String result = new String (b);
		System.out.println(result);
		
	}
}
