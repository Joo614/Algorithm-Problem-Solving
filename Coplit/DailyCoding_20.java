import java.util.*;

public class Solution { 
	public String compressString(String str) {
    
    if(str.length() == 0) return "";

    char before = str.charAt(0);

    int count = 1;
    
    String result = "";

    str = str + ' ';
    
    for (int i = 1; i < str.length(); i++) {
      if (before == str.charAt(i)) {
        count++;
      }
      else {
        if (count >= 3) {
          result = result + count + before;
        }
        else {
          for(int j = 0; j < count; j++) {
            result = result + before;
          }
        }
        before = str.charAt(i);
        count = 1;
      }
    }
    return result;
  }
}
