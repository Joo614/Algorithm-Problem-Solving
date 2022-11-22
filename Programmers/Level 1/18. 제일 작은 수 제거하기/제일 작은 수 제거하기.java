import java.util.*;
class Solution { //속도가 느리지만 가독성이 좋은 코드
    public int[] solution(int[] arr) {
        
         if(arr.length == 1) return new int[] {-1};
        
         int min = Arrays.stream(arr).min().getAsInt(); //최솟값 가져와서 min에 할당
        
         return Arrays.stream(arr).filter(a -> a != min).toArray(); //arr 돌면서 min이 아닌 애들만 넣어서 배열로 만들어서 리턴


    }
}

///////다른 코드///////

import java.util.*;
class Solution { //속도는 빠르지만 가독성이 좋지 않은 코드
    public int[] solution(int[] arr) {

        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[arr.length-1];
        
        int min = arr[0]; //하나의 값을 기준으로 잡음

        for(int i=1; i<arr.length; i++){
            min = Math.min(min, arr[i]); //순환하면서 가장 작은 값을 min에 넣고 그 뒤 요소와 비교
        }
        
        int index = 0; //반복문 index 용
        
        for(int i=0; i<arr.length; i++){ //가장 작은 수를 제외한 배열 만들기
            if(arr[i] == min){ //배열의 값이 가장 작은 수라면
                continue; //continue를 이용해 배열에 넣지 않고 넘어감
            }
            answer[index++] = arr[i];
        }
        
        return answer;
    }
}
