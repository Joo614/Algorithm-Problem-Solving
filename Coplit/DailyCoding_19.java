import java.util.*;

public class Solution { 
	public String decryptCaesarCipher(String str, int secret) {
    String alpha = "abcdefghijklmnopqrstuvwxyz";

    String result = "";

    for(int i = 0; i < str.length(); i++) {
      if(str.charAt(i) == ' ') {
        result = result + str.charAt(i);
      } else {
        int asis = alpha.indexOf(str.charAt(i));
        int tobe = (asis - secret + alpha.length()) % alpha.length();
        result = result + alpha.charAt(tobe);
      }
    }
    return result;
  }
}
