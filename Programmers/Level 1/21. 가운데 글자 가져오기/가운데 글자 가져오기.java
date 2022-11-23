class Solution {
    public String solution(String s) {
        // s의 길이를 2로 나눈 나머지가 0이면 (s 길이가 짝수면) --> (s의 길이/2)-1번째 문자부터 (s의 길이/2)번째 문자까지 answer에 저장
        // 짝수가 아닐 경우 --> 그냥 (s 길이/2)만 저장
        
        String answer = "";
        int lenght = s.length();
        
        if(lenght%2==0) {
            answer = s.substring((lenght/2)-1, (lenght/2)+1);
        }
        else {
            answer = s.substring(lenght/2,(lenght/2)+1);
        }
        return answer;
    }
}
