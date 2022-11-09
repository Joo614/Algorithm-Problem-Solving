class Solution {
    public boolean solution(String s) {
        
        if(s.length() != 4 && s.length() != 6) return false;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') return false;
        }        
        return true;  
    }
}

//////다른 풀이//////

class Solution {
    public boolean solution(String s) {
        
        return (s.length() != 4 && s.length() != 6) || (s.split("[0-9]").length > 0) ? false:true; //삼항연산자로 풀기
    }
}
