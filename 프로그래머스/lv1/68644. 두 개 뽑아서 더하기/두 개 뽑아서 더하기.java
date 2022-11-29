import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        
//         ArrayList<Integer> list = new ArrayList<>();
 
//         int temp = 0;
        
//         for(int i=0; i < numbers.length-1; i++){
//             for(int j = i+1; j < numbers.length; j++){
//                 temp = numbers[i] + numbers[j];
//                 if (!list.contains(temp)) {
//                     list.add(temp);
//                 }
//             }
//         }
 
//         int answer[] = new int[list.size()];
        
//         for(int i = 0;i < answer.length; i++) {
//             answer[i] = list.get(i);
//         }
            
//         Arrays.sort(answer);
//         return answer;
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}