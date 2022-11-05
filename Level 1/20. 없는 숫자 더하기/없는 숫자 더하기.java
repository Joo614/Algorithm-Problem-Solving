class Solution {
    public int solution(int[] numbers) {
        int answer = 45; //0-9 까지의 합
        
        for(int num : numbers) {
            answer -= num;
        }
        
        return answer;
    }
}

///////다른 풀이///////

class Solution {
    public int solution(int[] numbers){
        
        return 45 - Arrays.stream(numbers).sum();
    }
}
