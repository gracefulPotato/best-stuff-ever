import java.util.*;
public class UIMS {
	//the user id management system
			int customerID = 0;
			//increased by 1 each time a user id is added
			//since the value of customerID is always equal to the number
			//of user ids issued we will use it to compute the load factor
			//of the hash table

			SLItemList[] userT = new SLItemList[10]; 
			//should have m elements
			
			int m = 10;
			//size of currently allocated hash table
			//a prime number or power of 2, depending on hash
			//family used
			//initially 2 if hash table dynamically growing
			
			//userID: proposed user id
			//returns true if the userID is available, false otherwise
			boolean isAvailable(String userID){
				return true;
			}
			
			//precondition: userID is available and customerID = cid
			//postcondition: userID is in hash table userT associated with cid
			//and customerID = cid + 1
			void add(String userID){
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

				return 0;
			}
			
			int[] salt(int[] arr){
				return arr;
			}
			
			int generateSalt(int[] arr){
				double n = Math.random();
				return (int)(n%arr.length);
			}
			
			double load(int[] arr, String customerID){
				double loadFactor = 0.75;
				//double load = 
				return loadFactor;
			}
}
