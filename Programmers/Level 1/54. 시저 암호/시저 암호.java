class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int N = 0;
        
        for (int i = 0; i < s.length(); i++){
            N = s.charAt(i) + n;
            
            if (s.charAt(i) == ' ') { // 공백일 경우 공백 저장
                answer += s.charAt(i);
                
            } else if (s.charAt(i) < 91 && N > 90 || N > 122) { // 해당 문자가 대문자일 때 연산 후 Z 나 z를 넘어갈 경우 -> - 26
                N -= 26;
                answer += (char) N;
                
            } else {
                answer += (char) N;
            }
        }
        return answer;
    }
}
