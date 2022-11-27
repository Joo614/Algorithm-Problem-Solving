class Solution {
    public int solution(String s) {
        String[] num = {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};
     
        for(int i = 0; i < 10; i++) {
            s = s.replace(num[i], Integer.toString(i));
            // i를 String 으로 바꿔줘야함
        }
        
        int answer = Integer.parseInt(s); // s가 String이니까 int로 바꿈
        
        return answer;
    }
}
