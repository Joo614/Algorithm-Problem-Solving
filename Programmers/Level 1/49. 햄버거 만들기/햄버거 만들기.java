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

/////// 다른 풀이 ///////

class Solution {
    public int solution(int[] ingredient) {
        int[] stack = new int[ingredient.length];
        int sp = 0;
        int answer = 0;
        for (int i : ingredient) {
            stack[sp++] = i;
            if (sp >= 4 && stack[sp - 1] == 1
                && stack[sp - 2] == 3
                && stack[sp - 3] == 2
                && stack[sp - 4] == 1) {
                sp -= 4;
                answer++;
            }
        }
        return answer;
    }
}
