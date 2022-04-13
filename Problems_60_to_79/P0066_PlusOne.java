package Problems_60_to_79;

public class P0066_PlusOne {

	public static void main(String[] args) {
		int[] ar = new int[] {8,9,9,9};
		int[] result = plusOne(ar);
		
		for(int i : result) {
			System.out.print(i + ", ");
		}
	}
	
	public static int[] plusOne(int[] digits) {
		digits[digits.length -1]++;
		
		for(int i = digits.length -1; i > 0; i--) {
			if(digits[i] == 10) {
				digits[i-1]++;
				digits[i] = 0;
			}
		}
		
		if(digits[0] == 10 || (digits[0] == 9 && digits.length == 1)) {
			int[] digits2 = new int[digits.length +1];
			for(int i = 0; i < digits.length; i++) {
				digits2[i+1] = digits[i];
			}
			digits2[1] = 0;
			digits2[0] = 1;
			return digits2;
		}
		
		return digits;
	}

}
