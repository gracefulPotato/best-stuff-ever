
//contains helper methods for generating test data sets
//and running UIMs on the test data sets
//you will want to be able to (randomly) generate lists
//of user ids, for instance
//"more on this soon" yeah, right.
import java.util.*;
public class TestDrivers {
	static String generateRandomShit(){
		String rtn = "";
		Random random = new Random();
		String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		
		for(int i = random.nextInt(16)+1; i>0; i--){
			char tmp = alphabet.charAt(random.nextInt((alphabet.length())));
			rtn = rtn + tmp;
		}
		System.out.println(rtn);
		return rtn;
	}
}
