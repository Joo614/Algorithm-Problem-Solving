import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> answerList = new ArrayList<Integer>(); //배열 크기 알 수 없으니까 ArrayList 생성
        
        int value = -1; // 이전 값 초기화 하려고 (-1이 안나올 테니까 그냥 임의의 음수로 집어넣음)
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != value) { // 일단 첫번째 요소의 값 넣게 할려고
                answerList.add(arr[i]);
                value = arr[i]; // 그리고 value를 해당 요소로 지정하고 다시 for문이 돌아서 이 값이랑 같으면 List에 넣지 않고 넘어갈 수 있도록
            }
        }
        return answerList.stream().mapToInt(i->i).toArray(); //stream으로 int값을 가진 Array를 생성 (stream 기본이 Integer니까 int로 바꿔줘야함)
    }
}
