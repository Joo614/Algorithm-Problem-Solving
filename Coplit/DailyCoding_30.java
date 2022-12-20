public class Solution { 
	public int rotatedArraySearch(int[] rotated, int target) {
    int left = 0;
		int right = rotated.length - 1;

		while(left <= right) {
			int middle = (right + left) / 2;

		if(rotated[middle] == target) {
				return middle;
		}

		if (rotated[left] < rotated[middle]) {
      if (target < rotated[middle] && rotated[left] <= target) {
      	 right = middle - 1;
      }
      else {
       	left = middle + 1;
      }
    }
    else {
			if (target <= rotated[right] && rotated[middle] < target) {
				left = middle + 1;
			}
      else {
				right = middle - 1;
			}
    }
	}
	return -1;
  } 
}
