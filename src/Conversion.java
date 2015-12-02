import java.util.*;
public class Conversion {
	//returns an array of 0s and 1s constructed by
	//representing each char in s by its assigned
	//bit pattern
	public Conversion(){}
	int[] decimalArr;
	int[] stringToBitseq(String s){
		String characters = "0123456789abcdefghijklmnopqurstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] charArray = s.toCharArray();
		decimalArr = new int[charArray.length];
		int[] binaryArr	= new int[charArray.length*8];
		//8 bits to represent 62 different characters
		for(int i = 0; i < charArray.length; i++){
			decimalArr[i] = characters.indexOf(charArray[i]) + 1;
			int digit = decimalArr[i];
			for(int j=7; j>=0; j--){
				int powTwo = (int)Math.pow(2,j);
				binaryArr[i*7+j] = digit/powTwo;
				digit = digit%powTwo;
			}
		}
		return binaryArr;
	}
	
	int[] bitseqToDigitSeq(int[] bitseq, int k){
		int[] chunk = new int[k];
		int digitLen = bitseq.length/k;
		if(bitseq.length%k > 0)		//ceiling
			digitLen++;
		int[] digitseq = new int[digitLen];
		int numDigits = 0;
		int digit = 0;
		for(int i = 0; i<bitseq.length; i=i+k){
			digit = 0;
			for(int j=(k-1); j>=0; j--){
				//System.out.println(Math.pow(2,j));
				//System.out.println(bitseq[i+j]);
				digit+=(Math.pow(2,j)*bitseq[i+(k-1-j)]);
				chunk[j] = bitseq[i+j];
			}
			digitseq[numDigits] = digit;
			numDigits++;
		}
		return digitseq;
	}
	
	long bitSeqToBigNum(){
		return 0;
	}
	
	int[] numToBitSeq(int n){
		int[] arr = new int[1];
		return arr;
	}
}
