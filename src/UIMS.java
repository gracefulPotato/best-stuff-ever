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
				System.out.println("index: "+index);
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
				int base = (int)(Math.log(m)/Math.log(2));
				System.out.println("base: "+base);
				int[] input = converter.bitseqToDigitSeq(converter.stringToBitseq(userID),base);
				int sum = 0;
				System.out.println("salt.length: "+salt.length+" input.length: "+input.length);
				System.out.println(input[input.length-1]);
				for(int i=0; i<input.length;i++){
					System.out.println("i: "+i);
					sum = sum + input[i]*salt[i];
				}
				int key = sum%m;
				System.out.println("key: "+key);
				return key;
			}
			
			int[] generateSalt(){
				base = (int)(Math.log(m)/Math.log(2));
				int saltLen = (16*6)/base;
				for(int i = 0; i < saltLen;i++){
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
