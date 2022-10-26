class Solution {
    public int solution(int num) {
        // 1이될 때까지 반복하다가 몇번 반복했는지 count 반환
        // 500번 반복할 때까지 1안되면 -1 반환
        
        long longNum = num; //num의 범위가 크기 때문에 오버플로우 방지를 위해 long으로 변환
        int count = 0;
        
        while(longNum != 1) {
            if(longNum % 2 == 0) {
                longNum /= 2;
            }else if(longNum % 2 == 1) {
                longNum = longNum * 3 + 1;
            }
            count++;
            
            if(count > 500) {
                return -1;
            }
        }
        return count;
    }
}
