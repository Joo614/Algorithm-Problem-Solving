public class Solution { 
  public int[] insertionSort(int[] arr) {
		
    for(int i = 1; i < arr.length; i++) {
			int target = i;

			while(target > 0 && arr[target-1] > arr[target]) {
				int temp = arr[target-1];
				arr[target-1] = arr[target];
				arr[target] = temp;
				target--;
			}
		}
		return arr;
	}
}
