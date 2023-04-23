public class Solution {
	
	// 햄버거 만들기
	// 빵(1), 야채(2), 고기(3), 빵(1)일 경우 햄버거 완성
	
	public static int solution(int[] ingredient) {
		int answer = 0;
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < ingredient.length; i++) {
			sb.append(ingredient[i]);
			
			if (sb.length() > 3 && sb.subSequence(sb.length() - 4, sb.length()).equals("1231")) {
				sb.delete(sb.length() - 4, sb.length());
				answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
		
		System.out.println(solution(ingredient));
	}
}
