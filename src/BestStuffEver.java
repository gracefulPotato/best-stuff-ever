import java.util.*;
import java.io.*;

public class BestStuffEver {
	
	
	public static void main(String args[])throws IOException{
		//Scanner in = new Scanner(new File(args[0]));
		Scanner in = new Scanner(new File("input/test.txt"));
		while(in.hasNextLine()){
			System.out.println(in.nextLine());
		}
		in.close();
	}

	
	public void majikaruBanana(){
		System.out.println("MAJIKARU BANANA!!!\nMAJIKARU BANANA!!!");
		for(int i = 0; i<10; i++){
			if(i%2==0) System.out.println("BANANA TO ITTARA KIIRO");
			else System.out.println("KIIRO TO ITTARA BANANA");
			
		}
	}
}
