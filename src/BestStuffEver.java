/*Sources:
 * stackOverflow.com for efficiently finding if string contains special character
 * */


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class BestStuffEver {

	public static void main(String args[])throws IOException{

		//Scanner in = new Scanner(new File(args[0]));
		//Scanner in = new Scanner(new File("data/test.txt"));
		//Scanner in = new Scanner(new File("../data/test.txt"));
		Scanner in = new Scanner(new File("data/INPUT"));

		UIMS hashtable = new UIMS();

		//for finding if string contains special character (stackOverflow.com)
		Pattern regex = Pattern.compile("[^A-Za-z0-9]");
		Matcher match;

		hashtable.salt = hashtable.generateSalt();

		while(in.hasNextLine()){
			String UI = in.nextLine();

			match = regex.matcher(UI);
			boolean specialChar = match.find();

			//incorrect input
			if(UI.length() > 16){
				System.out.println(UI + " has more than 16 characters");
			}
			else if(specialChar){
				System.out.println(UI + " can only contain 0-9, a-z, or A-Z");
			}
			//correct input
			else{
				if(hashtable.isAvailable(UI)){
					hashtable.add(UI);
					//UIMS.add(tmpID);
					if(hashtable.load(hashtable.m, hashtable.customerID)){
						hashtable.userT = hashtable.rehash(hashtable.userT);
					}
				}
			}
		}
		in.close();
		hashtable.printCurrentState();
	}
}
