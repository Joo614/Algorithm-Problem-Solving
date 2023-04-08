class Solution {
    public int[] solution(String s) {
        char[] ca = s.toCharArray();
        int len = ca.length;
        int[] answer = new int[len];
        for(int i = 0; i < len; i++){
            answer[i] = -1;
            for(int j = 1; j <= i ; j++){
                if(ca[i-j] == ca[i]){
                    answer[i] = j;
                    break;
                }
            }
        }
        return answer;
    }
}

/////// 다른 풀이 ///////

import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            answer[i] = i-map.getOrDefault(ch,i+1);
            map.put(ch,i);
        }
        return answer;
    }
}
