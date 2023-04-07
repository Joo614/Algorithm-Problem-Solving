class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int count = 1;
            while(count <= index){
                ++c;
                if(c > 'z')
                    c -= 26;
                if(skip.contains(c+""))
                    continue;
                else
                    count++;
            }
            answer += c;
        }
        return answer;
    }
}

/////// 다른 풀이 ///////

import java.util.ArrayList;

public class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        ArrayList<Character> alpha = new ArrayList<>();
        
        for(int i=97; i<123;i++){
            alpha.add((char)i);
        }
        
        for (int i=0;i<skip.length();i++){
            alpha.remove(Character.valueOf(skip.charAt(i)));
        }
        
        for (int i=0; i<s.length();i++){
            int idx = alpha.indexOf(s.charAt(i))+index;
            
            if(idx>=(26-skip.length())){
                idx%=(26-skip.length());
            }
            char cha = alpha.get(idx);
            answer+=cha;
        }
        return answer;
    }
}
