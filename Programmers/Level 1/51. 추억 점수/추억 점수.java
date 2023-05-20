class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for(int i = 0; i < photo.length; i++) {
        	for(int j = 0; j < photo[i].length; j++) {
        		for(int k = 0; k < name.length; k++) {
        			if(photo[i][j].equals(name[k])) answer[i] += yearning[k];
        		}
        	}
        }
        return answer;
    }
}

/////// 다른 풀이 ////////
( 다른 사람 풀이로 stream 공부하기 )

import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = IntStream.range(0, name.length).mapToObj(operand -> Map.entry(name[operand], yearning[operand])).collect(Collectors.toSet()).stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return Arrays.stream(photo).mapToInt(strings -> Arrays.stream(strings).mapToInt(value -> map.getOrDefault(value, 0)).sum()).toArray();
    }
}
