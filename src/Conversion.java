//Jolina Lam, Grace O'Hair-Sherman
//CMPS 101 12/4/2015
//
//Conversion
//Helper class for hash function
public class Conversion {
	//returns an array of 0s and 1s constructed by
	//representing each char in s by its assigned
	//bit pattern
	public Conversion(){}
	int[] decimalArr;

	//takes a String input and returns its binary representation in an array of 96 1s and 0s
	int[] stringToBitseq(String s){
		String characters = "0123456789abcdefghijklmnopqurstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] charArray = s.toCharArray(); //turns input into array of chars
		int[] arr = new int[charArray.length];
		int[] bitString = new int[96];
		String[] strBit = new String[arr.length];
		String bits = "";

		//maps the chars of the input to ints and turns the ints into binary
		for(int i = 0; i < charArray.length; i++){
			arr[i] = characters.indexOf(charArray[i]) + 1;
			strBit[i] = Integer.toString(arr[i], 2);
		}

		//turns the binary into a uniform length of 6 bits by appending 0s in front
		for(int i = 0; i < strBit.length; i++){
			while(strBit[i].length() != 6){
				strBit[i] = "0" + strBit[i];
			}
			bits = bits.concat(strBit[i]);
		}
		
		//pad out to uniform length of 96 = 16 letter max * 6 bit int representation
		while(bits.length() != 96){
			bits = "0" + bits;
		}
		
		//convert String into ints
		for(int i = 0; i < bits.length(); i++){
			bitString[i] = Integer.parseInt(String.valueOf(bits.charAt(i)));
		}
		return bitString;
	}

	//takes bit sequence, chunks it into k-digit sequences, and converts base 2 to base 10
	int[] bitseqToDigitSeq(int[] bitseq, int k){
		String chunk = "";
		int digitLen = bitseq.length/k;
		int[] digitseq = new int[digitLen];
		int numDigits = 0;
		int digit = 0;
		int looptimes = (bitseq.length+k)-(bitseq.length%k);
		for(int i = 0; i<looptimes; i++){
			if(i%(k+1) == 0 && i>0){
				digitseq[i/k-1] = Integer.valueOf(chunk,2);
				chunk = "";
			}else{
				if(i<bitseq.length)
				chunk = chunk+bitseq[i];
				else
				chunk = chunk+"0";
			}
		}
		return digitseq;
	}
}
