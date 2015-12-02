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

		Scanner in = new Scanner(new File("data/test.txt"));
		//Scanner in = new Scanner(new File("input/test.txt"));
		Conversion converter = new Conversion();
		UIMS hashtable = new UIMS();

		//for finding if string contains special character (stackOverflow.com)
		Pattern regex = Pattern.compile("[^A-Za-z0-9]");
		Matcher match;

		int[] bitseq;
		int[] salt = hashtable.generateSalt();
		SLItemList testList = new SLItemList();

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
				bitseq = converter.stringToBitseq(UI);
				/*******************/
				//System.out.print(UI + ": " + hash + "\n");
				/*******************/
				
			}
		}
		in.close();
		//testList.debugPrint();
		//TestDrivers.generateRandomShit();
	}


	public void majikaruBanana(){
		System.out.println("MAJIKARU BANANA!!!\nMAJIKARU BANANA!!!");
		for(int i = 0; i<10; i++){
			if(i%2==0) System.out.println("BANANA TO ITTARA KIIRO");
			else System.out.println("KIIRO TO ITTARA BANANA");

		}
		System.out.print("");
	}
}
