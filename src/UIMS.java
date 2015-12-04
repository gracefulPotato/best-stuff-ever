//Jolina Lam, Grace O'Hair-Sherman
//CMPS 101 12/4/2015
//
//UIMS
//The user ID management system
public class UIMS {
	//the user id management system
	//number of stuff in table
	int customerID = 0;

	//table size
	int m = 31;

	SLItemList[] userT = new SLItemList[m]; 
	//should have m elements

	//size of currently allocated hash table
	//a prime number or power of 2, depending on hash
	//family used
	//initially 2 if hash table dynamically growing

	public UIMS(){
		for(int i=0; i<m; i++){
			userT[i] = new SLItemList();
		}
	}
	int base = (int)(Math.log(m)/Math.log(2));
	int saltLen = (16*6)/base;
	int[] salt = new int[saltLen];

	//userID: proposed user id
	//returns true if the userID is available, false otherwise


	//userID: proposed user id
	//returns true if the userID is available, false otherwise
			
	boolean isAvailable(String userID){
		for(int i=0; i<userT.length; i++){
			if(!userT[i].find(userID).uid.equals(""))
				return false;
			}
			return true;
		}
			
		//precondition: userID is available and customerID = cid
		//postcondition: userID is in hash table userT associated with cid
		//and customerID = cid + 1
		void add(String userID){
			if(isAvailable(userID)==false){
				return;
			}
			int index = hash(userID);
			userT[index].pushFront(userID);
			customerID++;
		}
			
		//returns the customer id associated with user id userID
		//returns 0 if userID is not an assigned user id
		int lookupCustomer(String userID){
			return 0;
		}

	void printCurrentState(){
		SItem walker;
		for(int i=0; i<userT.length; i++){
			SItem head = userT[i].header;
			if(head.next != head){
				String listStr = "";
				walker = head.next;
				do{
					if(listStr.equals("") || walker.getUid().equals(""))
						listStr = walker.getUid()+listStr;
					else
						listStr=walker.getUid()+", "+listStr;
					walker = walker.next;
				}while(walker.next.next!=head);
				listStr = i+" - "+listStr;
				System.out.println(listStr);
			}
		}
	}
			
	//returns the hash value of the user id userID,
	//a value between 0 and m-1
	//define using helper functions
	int hash(String userID){
		Conversion converter = new Conversion();
		int base = (int)(Math.log(m)/Math.log(2));
		int[] input = converter.bitseqToDigitSeq(converter.stringToBitseq(userID),base);
		int sum = 0;
		for(int i=0; i<input.length;i++){
			sum = sum + input[i]*salt[i];
		}
		int key = sum%m;
		return key;
	}

	int[] generateSalt(){
		base = (int)(Math.log(m)/Math.log(2));
		int saltLen = (16*6)/base;
		for(int i = 0; i < saltLen;i++){
			salt[i] = (int)(Math.random()*m);
		}
		return salt;
	}

	//returns true if table needs to be reallocated (load > 0.75)
	boolean load(int tableSize, int stuffInTable){
		double loadFactor = 0.75;
		return ((double)(stuffInTable*1.0/tableSize) >= loadFactor);
	}

	SLItemList[] rehash(SLItemList[] oldHashTable){
		m = m*2 + 1;
		SLItemList[] newTable = new SLItemList[m];
		for(int i=0; i<m; i++){
			newTable[i] = new SLItemList();
		}
		for(int i = 0; i < oldHashTable.length; i++){
			if(oldHashTable[i].header.next == oldHashTable[i].header){
				continue;
			}else{
				SItem pointer = oldHashTable[i].header.next;
				while(pointer != oldHashTable[i].header){
					int index = hash(pointer.uid);
					newTable[index].pushFront(pointer.uid);
					pointer = pointer.next;
				}
			}
		}
		return newTable;
	}
}
