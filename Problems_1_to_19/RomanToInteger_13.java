package Problems_1_to_19;

import java.util.HashMap;

public class RomanToInteger_13 {

	public static void main(String[] args) {
		System.out.println(romanToInt("MCMXCIV"));
	}
	
	public static int romanToInt(String s) {
		HashMap<String, Integer> normalSymbols = new HashMap<>();
		normalSymbols.put("I", 1);
		normalSymbols.put("V", 5);
		normalSymbols.put("X", 10);
		normalSymbols.put("L", 50);
		normalSymbols.put("C", 100);
		normalSymbols.put("D", 500);
		normalSymbols.put("M", 1000);
		
		HashMap<String, Integer> specialSymbols = new HashMap<>();
		specialSymbols.put("IV", 4);
		specialSymbols.put("IX", 9);
		specialSymbols.put("XL", 40);
		specialSymbols.put("XC", 90);
		specialSymbols.put("CD", 400);
		specialSymbols.put("CM", 900);
		
		int result = 0;
		String sWithoutSpecialSymbols = s;
		
		for(String str : specialSymbols.keySet()) {
			String previous = sWithoutSpecialSymbols;
			sWithoutSpecialSymbols = sWithoutSpecialSymbols.replaceAll(str, "");
			
			if(previous != sWithoutSpecialSymbols) {
				result += specialSymbols.get(str);
			}
		}
		
		for(char c : sWithoutSpecialSymbols.toCharArray()) {
			result += normalSymbols.get(String.valueOf(c));
		}
		
		return result;
    }
}
