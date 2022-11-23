import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        
        String answer = "";
        
        char[] sArr = s.toCharArray();
        
        Arrays.sort(sArr);
        
        // 오름차순으로 정렬되어있으므로 역순으로 answer에 넣어주기
        for (int i = sArr.length - 1; i >= 0; i--) {
            answer += str[i];
        }
        
        return answer;
    }
}
