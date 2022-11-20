import java.util.*;

public class Solution { 
	public int largestProductOfThree(int[] arr) {
    
    Arrays.sort(arr);

		int multiple1 = arr[arr.length-1] * arr[arr.length-2] * arr[arr.length-3];
		
		int multiple2 = arr[0] * arr[1] * arr[arr.length-1];
		
		return Math.max(multiple1, multiple2);
	} 
}
