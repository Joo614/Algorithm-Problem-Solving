import java.util.*;

public class Solution { 
	public ArrayList<String> powerSet(String str) {

		String deduplStr = deduplicated(str);
		Stack<String> stack = new Stack<>();

		ArrayList<String> result = new ArrayList<>();

		result = pickOrNot(stack, 0, deduplStr, result);
		Collections.sort(result);
		return result;
	};
  
	public String deduplicated(String str) {
    String result = "";
    for(int index = 0; index < str.length(); index++) {
      if(str.indexOf(str.charAt(index)) == index) {
        result += str.charAt(index);
      }
    }

    String[] sorted = result.split("");
    Arrays.sort(sorted);
    result = String.join(",", sorted).replaceAll(",", "");
    return result;
  }	

	public ArrayList<String> pickOrNot(Stack<String> stack, int idx, String subset, ArrayList<String> result) {

    if(idx >= subset.length()) {
      result.add(stack.toString()
                .replaceAll("\\[", "")
                .replaceAll("]", "")
                .replaceAll(",", "")
                .replaceAll(" ", ""));
      return result;
    } else {
      stack.push(Character.toString(subset.charAt(idx)));
      pickOrNot(stack, idx + 1, subset, result);


      stack.pop();
      pickOrNot(stack, idx + 1, subset, result);
    }
    return result;
  }
}
