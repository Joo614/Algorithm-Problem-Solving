import java.util.*;

public class Solution { 
	public String readVertically(String[] arr) {
    
    int maxLen = 0;
    for(int i = 0; i < arr.length; i ++) {
        if(arr[i].length() > maxLen) {
          maxLen = arr[i].length();
        }
    }
      
    String[] strArr = new String[maxLen];

    for(int i = 0; i < arr.length; i ++) {
      String str = arr[i];

      for(int j = 0; j < str.length(); j++) {
      
        if(strArr[j] == null) { 
          strArr[j] = Character.toString(str.charAt(j)); 
        } else { 
          strArr[j] = strArr[j] + str.charAt(j);
        }
      }
    }
    String result = "";
    for(int i = 0; i < strArr.length; i++) result = result + strArr[i];
    return result;
  } 
}
