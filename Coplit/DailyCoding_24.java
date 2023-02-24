import java.util.*;
import java.util.stream.Collectors;

public class Solution { 
 	public boolean isSubsetOf(int[] base, int[] sample) {

    List<Integer> intList
         = Arrays.stream(base)
          .boxed()
          .collect(Collectors.toList());

    for (int i : sample) {
      if (!intList.contains(i)) {
        return false;
      }
    }
    return true;
  }
}
