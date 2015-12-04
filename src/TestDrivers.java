//Jolina Lam, Grace O'Hair-Sherman
//CMPS 101 12/4/2015
//
//TestDrivers
//contains helper methods for generating test data sets
//and running UIMs on the test data sets
//
//**NOTE** our main() function is in BestStuffEver.java!!
import java.util.*;
public class TestDrivers {
	static String generateRandomUid(){
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
