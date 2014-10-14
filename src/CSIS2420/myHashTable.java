package CSIS2420;
// Very simple Hash Table
// Resolve collision by chaining

public class myHashTable {
	public static void main (String [] args){
		List[] hashTable = new List[23];
		int key;
		int value;
		
		//Always initialize object arrays
		for(int i=0; i<hashTable.length; i++){
			hashTable[i] = new List();
		}
		
		for(int i=0; i<15; i++){
			value = (int)(Math.random()*1000);
			key = value % 23; //Hash function
			hashTable[key].insertAtFront(value);
		}
		
		for(int i=0; i<23; i++){
			System.out.println("index "+i+" "+hashTable[i].print());
		}
	}
}