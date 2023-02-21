import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        // n = 몇명이서 하는지 / words = 사람들이 계속 말한 단어
        // 2<=n<=10 / n<=words<=100
        // int[] answer = [가장 먼저 탈락하는 사람의 번호, 그 사람이 몇번째에 탈락하는지]
        // 모든 단어는 알파벳 소문자
        // 탈락자 안생기면 (겹치는 단어 없으면) -> return [0,0]
        // 탈락자인 경우 -> 겹치는 단어 말 한 경우 / 앞에서 끝난 단어가 아닌 다른 단어로 시작했을 경우
        
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            // 이전에 등장한 단어인 경우
            if (list.contains(words[i])) {
                answer[0] = (i%n) + 1; // 사람 번호
                answer[1] = (i/n) + 1; // 몇번째 턴
                return answer;
            }

            list.add(words[i]);

            // 이전 끝 단어와 현재 첫 단어가 다른 경우
            if(i > 0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)) {
                answer[0] = (i%n) + 1; // 사람 번호
                answer[1] = (i/n) + 1; // 몇번째 턴
                return answer;
            }
        }
        return new int[]{0, 0};
    }
}
