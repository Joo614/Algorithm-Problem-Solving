class Solution {
    public String solution(String[] seoul) {
        // seoul 배열의 요소들 중 Kim 의 인덱스 구하기
        
        int a = 0;
        
        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")){
                a = i;
            }
        }
        return "김서방은 " + a + "에 있다";
    }
}

/////////////////////다른 풀이/////////////////////
import java.util.Arrays;
class Solution {
    public String solution(String[] seoul) {
        
        int a = Arrays.asList(seoul).indexOf("Kim");
        
        return "김서방은 " + a + "에 있다";
    }
}
