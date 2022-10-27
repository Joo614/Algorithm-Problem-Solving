class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0;
        int countY = 0;
        
        s = s.toLowerCase();
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'p') {
                countP++; //의 개수 세기
            }else if(s.charAt(i) == 'y') {
                countY++; //y의 개수 세기
            }
        }
        
        if(countP == 0 && countY == 0) return true;
        
        answer = countP == countY ? true : false; //앞의 조건식이 맞으면 true / 틀리면 false 반환
        
        return answer;
    }
}
