package Problems_20_to_39;

public class P0020_ValidParentheses {
	public static void main(String[] args) {
		System.out.println(isValid("([]{()})"));
	}
	
	public static boolean isValid(String s) {
		if(s.length() == 0) return true;
		if(!s.contains("()") && !s.contains("[]") && !s.contains("{}")) return false;
			
        s = s.replaceAll("\\(\\)", "");
        s = s.replaceAll("\\[\\]", "");
        s = s.replaceAll("\\{\\}", "");
        
        return isValid(s);
    }
}
