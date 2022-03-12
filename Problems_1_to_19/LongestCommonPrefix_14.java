package Problems_1_to_19;

public class LongestCommonPrefix_14 {

	public static void main(String[] args) {
		String[] ar = new String[] {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(ar));
	}
	
	public static String longestCommonPrefix(String[] strs) {
        String result = "";
        int shortestStringLength = strs[0].length();
        
        for(String s : strs) {
        	if(s.length() < shortestStringLength) shortestStringLength = s.length();
        }
        
        for(int i = 0; i < shortestStringLength; i++) {
        	char c = strs[0].charAt(i);
        	
        	for(int j = 0; j < strs.length; j++) {
        		if(strs[j].charAt(i) != c) return result;
        	}
        	
        	result += c;
        }
        
        return result;
    }

}
