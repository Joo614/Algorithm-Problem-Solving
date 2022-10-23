class Solution {
    public boolean solution(int x) {
        //먼저 x를 string s로 바꿔서 각 자리의 문자를 int로 바꾼 후에 더해
        //원래 x를 sum으로 나눠서 나머지가 0이면 true
        //아니면 false
        
        String s = Integer.toString(x);
        
        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
            sum = sum + Character.getNumericValue(s.charAt(i));
        }
        
        if(x%sum == 0) return true;
        else return false;
        
    }
}
