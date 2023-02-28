import java.util.*;

public class Solution { 
	public int numberSearch(String str) {
    
    String digits = "0123456789";
    
    if(str.length() == 0) return 0;

    double sum = 0;
    String justStr = "";
    
    for(int i = 0; i < str.length(); i++) {
      if(digits.indexOf(str.charAt(i)) != -1) {
        sum = sum + Character.getNumericValue(str.charAt(i));
      } else if(str.charAt(i) != ' ') {   
        pureStr = justStr + str.charAt(i);
      }
    }
    double result = sum / justStr.length();
    
    return (int) Math.round((result * 10) / 10);
  } 
}
