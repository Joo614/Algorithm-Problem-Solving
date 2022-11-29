import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        
        ArrayList<Integer> list = new ArrayList<>();
 
        int temp = 0;
        
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){
                temp = numbers[i] + numbers[j];
                if (!list.contains(temp)) { // list에 해당 수를 포함하고 있지 않다면 넣기
                    list.add(temp);
                }
            }
        }
 
        int answer[] = new int[list.size()]; // list만큼의 길이의 배열을 만들고
        
        for(int i = 0; i < answer.length; i++) { // list에서 가져와서 배열에 넣기
            answer[i] = list.get(i);
        }
            
        Arrays.sort(answer);
        
        return answer;
    }
}

/////// 다른 풀이 ///////

import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        // But, HashSet을 이용하니 가독성은 좋지만, 속도면에서 느림
        
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
