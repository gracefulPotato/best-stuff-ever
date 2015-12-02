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
		//put into chunks of six, pass to following
		//Integer.valueOf(binaryValue,baseCurrentlyIn)
		//store into array
		String chunk = "";
		int digitLen = bitseq.length/k;
		System.out.println("digitlen w/out ceiling: "+digitLen);
		//if(bitseq.length%k > 0)		//ceiling
		//	digitLen++;
		System.out.println("digitlen: "+digitLen);
		int[] digitseq = new int[digitLen];
		int numDigits = 0;
		int digit = 0;
		System.out.println("bitseq.length"+bitseq.length);
		int looptimes = (bitseq.length+k)-(bitseq.length%k);
		System.out.println("looptimes: "+looptimes);
		for(int i = 0; i<looptimes; i++){
		System.out.println("i: "+i);
			if(i%(k+1) == 0 && i>0){
				//int chunkInt = Integer.parseInt(chunk);
				System.out.println(chunk);
				System.out.println("digitseq["+(i/k-1)+"]");
				digitseq[i/k-1] = Integer.valueOf(chunk,2);
				System.out.println(digitseq[i/k-1]);
				chunk = "";
			}else{
				if(i<bitseq.length)
				chunk = chunk+bitseq[i];
				else
				chunk = chunk+"0";
			}
			//digit = 0;
			//for(int j=(k-1); j>=0; j--){
			//	//System.out.println(Math.pow(2,j));
			//	//System.out.println(bitseq[i+j]);
			//	System.out.println("i: "+i+", j: "+j);
			//	digit+=(Math.pow(2,j)*bitseq[i+(k-1-j)]);
			//	//chunk[j] = bitseq[i+j];
			//}
			//digitseq[numDigits] = digit;
			//numDigits++;
		}
		return digitseq;
	}
}
