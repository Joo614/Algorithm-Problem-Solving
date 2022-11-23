class Solution {
    public String solution(int n) {
        String answer = "";
        
        for(int i = 1; i <= n; i++) {
            if(i%2 == 1) {
                answer += "수";
            } else {
                answer += "박";
            }
        }
        //answer += i % 2 == 1 ? "수" : "박";
        return answer;
    }
}

///////다른 풀이///////

class Solution {
    public String solution(int n) {
        String answer = "";
        
        for(int i = 1; i <= n; i++) {
            answer += i % 2 == 1 ? "수" : "박";  //삼항 연산자로
        }
        
        return answer;
    }
}
