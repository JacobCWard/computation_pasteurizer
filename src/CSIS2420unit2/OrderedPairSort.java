package CSIS2420unit2;

import java.util.*;

public class OrderedPairSort {
	public static void main(String[]args){
		OrderedPair [] opArray = {
				new OrderedPair("the",10),
				new OrderedPair("first",12),
				new OrderedPair("last",4),
				new OrderedPair("to",10)
		};
		
		List<OrderedPair> opList = Arrays.asList(opArray);
		Collections.sort(opList);
		System.out.println(opList);
		
	}
}
