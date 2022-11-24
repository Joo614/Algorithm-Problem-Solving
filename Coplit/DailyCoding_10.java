import java.util.*;

public class Solution { 
	public String insertDash(String str) {
    
    if(str.length() == 0) return null;

		String result = str.charAt(0) + "";

		for(int i = 1; i < str.length(); i++) {
			int numI = Character.getNumericValue(str.charAt(i)) % 2;
			int numPreI = Character.getNumericValue(str.charAt(i-1)) % 2;
			if (numI != 0 && numPreI != 0) {
				result = result + "-";
			}
			result = result + str.charAt(i);
		}
		return result;
	} 
}
