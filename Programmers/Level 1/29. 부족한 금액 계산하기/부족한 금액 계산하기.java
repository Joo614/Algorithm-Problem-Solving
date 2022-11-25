class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long myMoney = money; //money를 long 타입으로 바꿔주고

        for (int i = 1; i <= count; i++) {
            myMoney -= (price * i); //내 돈에 가격을 계속 빼
        }

        answer = myMoney >= 0 ? 0 : -myMoney;
        //myMoney가 딱 떨어지거나 남으면 0 반환 / myMoney가 부족해서 - 가 됐을 경우에 그 수를 +로 만들어서 반환
        
        return answer;
    }
}

///////다른 풀이///////

class Solution {
    public long solution(int price, int money, int count) {
        // 등차수열의 합을 이용한 풀이법
        
        long result = price * ((long)count * (1 + count) / 2);
        
        if(result <= money) {
            return 0;
        }
        else 
        {
            return result - (long)money;    
        }
    }
}

[참고 링크] https://chashtag.tistory.com/85
