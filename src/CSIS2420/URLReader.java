package CSIS2420;
import java.net.*;
import java.io.*;

public class URLReader {
    public static void main(String[] args) throws Exception {
		String url="http://www.suu.edu/general/history.html";
        List list = reader(url);
		System.out.println(list.print());
    }
	
	public static List reader(String url) throws Exception{
		List list = new List(url);
		URL suu = new URL(url);
		String inputLine;
        BufferedReader in = new BufferedReader(
        new InputStreamReader(suu.openStream()));

        while((inputLine = in.readLine()) != null){
			list.insertAtBack(inputLine);
		}
        
        in.close();
		
		return list;
	}
}