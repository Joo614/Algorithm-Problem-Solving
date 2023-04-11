class Solution {
    public int solution(String s) {
        // 앞에서 쭉 가면서 첫글자랑 같은 글자 횟수 세기
        // 만약 위 횟수 = 길이 - 저 횟수 랑 같으면 멈추기 --> 문자열 분리
        // 남은 걸로 똑같이 하기
        char first = s.charAt(0);
		int count = 0;
		int diff = 0;
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (count == diff) {
				result++;
				first = s.charAt(i);
			}
			if (s.charAt(i) == first) count++;
			else diff++;
		}
		return result;
    }
}
