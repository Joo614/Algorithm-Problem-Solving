import java.util.*;

public class Solution { 
	public String[] removeExtremes(String[] arr) {
    
    if(arr.length == 0) return null;

		String[] result = new String[arr.length -2];

		int longestIdx = 0;
		int shortestIdx = 0;
		int longestLen = 0;
		int shortestLen = 20;

		for(int i = 0; i < arr.length; i++) {
			if(arr[i].length() >= longestLen) {
				longestLen = arr[i].length();
				longestIdx = i;
			}
			if (arr[i].length() <= shortestLen) {
				shortestLen = arr[i].length();
				shortestIdx = i;
			}
		}

		int curI = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i != longestIdx && i != shortestIdx) {
				result[curI] = arr[i];
				curI++;
			}
		}
		return result;
	} 
}
