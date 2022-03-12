package Problems_1_to_19;

public class PalindromeNumber_9 {
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
	}
	
	public static boolean isPalindrome(int x) {
        if(x < 0) return false;		//negative numbers are no palindromes
        
        int reversedX = 0;
        int i = x;
        
        while(i != 0){				//reverse x
            int digit = i % 10;
            reversedX = reversedX * 10 + digit;
            i /= 10;
        }

        if(x == reversedX) return true;		//if x and the reversed x are the same, x is a palindrome
        return false;
    }
}
