import java.util.*;
public class UIMS {
	//the user id management system
			//number of stuff in table
			int customerID = 0;

			//table size
            int m = 1021;

			SLItemList[] userT = new SLItemList[m]; 
			//should have m elements

			//size of currently allocated hash table
			//a prime number or power of 2, depending on hash
			//family used
			//initially 2 if hash table dynamically growing
			
			int[] salt = new int[16];
			
			public UIMS(){}
			
			//userID: proposed user id
			//returns true if the userID is available, false otherwise
			
			static boolean isAvailable(String userID){
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
			
			//returns the hash value of the user id userID,
			//a value between 0 and m-1
			//define using helper functions
			int hash(String userID){
				Conversion converter = new Conversion();
				int[] input = converter.bitseqToDigitSeq(converter.stringToBitseq(userID),m);
				
				return 0;
			}
			
			int[] generateSalt(int m){
				for(int i = 0; i < salt.length;i++){
					salt[i] = (int)(Math.random()*m);
					//System.out.println(salt[i]);
				}
				return salt;
			}
			
			//returns true if table needs to be reallocated (load > 0.75)
			boolean load(int tableSize, int stuffInTable){
				double loadFactor = 0.75;
				return ((double)(stuffInTable/tableSize) >= loadFactor);
			}
}
