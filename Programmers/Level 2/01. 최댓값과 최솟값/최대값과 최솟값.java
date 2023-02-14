import java.util.Arrays; //이거 꼭 해주기
class Solution {
    public String solution(String s) {
        // s -> 공백으로 구분된 숫자들
        
        // 문자열을 공백으로 잘라서 배열에 넣고
        // 그 배열을 int 배열로 만들어서
        // 오름차순 하고
        // 맨 앞 요소랑 맨 뒤 요소 추출해서
        // 중간에 띄어쓰기 하나 넣고 반환
        
        String[] sArr = s.split(" ");		
		
	int[] sArrInt = new int[sArr.length];
        
	for(int i = 0; i < sArr.length; i++) {
            sArrInt[i] = Integer.parseInt(sArr[i]);
        }
        
        Arrays.sort(sArrInt);
        
        int min = sArrInt[0];
        int max = sArrInt[sArrInt.length -1];
		
	return min + " " + max;
    }
}
