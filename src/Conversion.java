
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
	
	int[] bitseqToDigitSeq(){
		int[] arr = new int[1];
		return arr;
	}
	
	long bitSeqToBigNum(){
		return 0;
	}
	
	int[] numToBitSeq(int n){
		int[] arr = new int[1];
		return arr;
	}
}
