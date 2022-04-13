package Problems_20_to_39;

public class P0028_ImplementstrStr {
	public static void main(String[] args) {
		System.out.println(strStr("", "a"));
	}
	
	public static int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)) return -1;
        return haystack.indexOf(needle);
    }
}
