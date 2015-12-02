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
		int[] arr = new int[charArray.length];
		int[] bitString = new int[96];
		String[] strBit = new String[arr.length];
		String bits = "";
		
		for(int i = 0; i < charArray.length; i++){
			arr[i] = characters.indexOf(charArray[i]) + 1;
			strBit[i] = Integer.toString(arr[i], 2);
		}

		for(int i = 0; i < strBit.length; i++){
			while(strBit[i].length() != 6){
				strBit[i] = "0" + strBit[i];
			}
			bits = bits.concat(strBit[i]);
		}
		
		while(bits.length() != 96){
			bits = "0" + bits;
		}
		
		for(int i = 0; i < bits.length(); i++){
			bitString[i] = Integer.parseInt(String.valueOf(bits.charAt(i)));
		}

		return bitString;
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
