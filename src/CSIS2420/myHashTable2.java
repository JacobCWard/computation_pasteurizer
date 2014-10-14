package CSIS2420;
// Very simple Hash Table
// Resolve collision by chaining

public class myHashTable2 {
	public static void main (String [] args){
		int[] a = RandomGenerator.randomInts(100,1000000);
		List[] hashTable = new List[199];
		int key;
		int value;
		
		//Always initialize object arrays
		for(int i=0; i<hashTable.length; i++){
			hashTable[i] = new List("index "+i);
		}
		
		for(int i=0; i<a.length; i++){
			value = a[i];
			key = value % hashTable.length; //Hash function
			hashTable[key].insertAtFront(value);
		}
		
		for(int i=0; i<hashTable.length; i++){
			System.out.println(hashTable[i].print());
		}
	}
}