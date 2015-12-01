
public class Conversion {
	//returns an array of 0s and 1s constructed by
	//representing each char in s by its assigned
	//bit pattern
	public Conversion(){}
	
	int[] stringToBitseq(String s){
		String characters = "0123456789abcdefghijklmnopqurstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] charArray = s.toCharArray();
		int[] arr = new int[charArray.length];
		
		for(int i = 0; i < charArray.length; i++){
			arr[i] = characters.indexOf(charArray[i]) + 1;
		}
		
		return arr;
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
