class Solution {
    public int[] solution(long n) {
        
        String str = String.valueOf(n);
        
        int[] answer = new int[str.length()];
        
        for(int i = 0; i < str.length(); i++) {
            answer[str.length()-(i+1)] = Character.getNumericValue(str.charAt(i));
            //answer의 뒤부터 str의 앞에 있는 거 넣을 것
            //str.charAt()은 char 타입이니까 int 타입으로 변환해서 넣어줘야 함
        }
        return answer;
    }
}
