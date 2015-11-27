import java.util.*;
import java.io.*;

public class BestStuffEver {
	
	
	public static void main(String args[])throws IOException{
		//Scanner in = new Scanner(new File(args[0]));
		Scanner in = new Scanner(new File("input/test.txt"));
		SLItemList testList = new SLItemList();
		while(in.hasNextLine()){
			String tmpID = in.nextLine();
			if(UIMS.idIsValid(tmpID)==false){
				System.out.println(tmpID+" is invalid "
						+ "(contains non-alphanumeric characters).");
				continue;
			}
			if(UIMS.isAvailable(tmpID)){
				testList.pushFront(tmpID,1);
				//UIMS.add(tmpID);
			}
		}
		in.close();
		testList.debugPrint();
	}

	
	public void majikaruBanana(){
		System.out.println("MAJIKARU BANANA!!!\nMAJIKARU BANANA!!!");
		for(int i = 0; i<10; i++){
			if(i%2==0) System.out.println("BANANA TO ITTARA KIIRO");
			else System.out.println("KIIRO TO ITTARA BANANA");
			
		}
	}
}
