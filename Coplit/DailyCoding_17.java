import java.util.*;

public class Solution { 
	public String computeSquareRoot(int num) {
    
    int precision = 10;
    // precision = 정확성

    double x = num / 2.0;

    for (int i = 0; i < precision; i++){
		  x = (x + (num / x)) / 2;
	  }
    
	  return String.format("%.2f", x);
	} 
}
