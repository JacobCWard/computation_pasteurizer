package CSIS2420;


public class myHashTable3 {
	public static void main (String [] args){
		int [] a = {5,30,51,66,96,77,42,38,36,35,95,42,35,68,98};
		List[] hashTable = new List[31];

		for(int i=0;i<hashTable.length;i++){
			hashTable[i] = new List("index "+i);
		}

		hashTable[a[0]%31].insertAtFront(a[0]);
		hashTable[a[1]%31].insertAtFront(a[1]);
		hashTable[a[2]%31].insertAtFront(a[2]);
		hashTable[a[3]%31].insertAtFront(a[3]);
		hashTable[a[4]%31].insertAtFront(a[4]);
		hashTable[a[5]%31].insertAtFront(a[5]);
		hashTable[a[6]%31].insertAtFront(a[6]);
		hashTable[a[7]%31].insertAtFront(a[7]);
		hashTable[a[8]%31].insertAtFront(a[8]);
		hashTable[a[9]%31].insertAtFront(a[9]);
		hashTable[a[10]%31].insertAtFront(a[10]);
		hashTable[a[11]%31].insertAtFront(a[11]);
		hashTable[a[12]%31].insertAtFront(a[12]);
		hashTable[a[13]%31].insertAtFront(a[13]);
		hashTable[a[14]%31].insertAtFront(a[14]);

		for(int i=0;i<31;i++){
			System.out.println(hashTable[i].print());
		}

	}
}
