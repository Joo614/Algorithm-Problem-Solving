class Solution {
    public String solution(String s) {
        String answer = "";
        //문자열을 끊어서 배열에 담고
        //배열을 쭉 검사 해서
        //배열의 i번째의 1번째만 가져와서 대문자 만들고 answer에 넣고
        //나머지는 소문자로 해서 넣고
        //뒤에 공백 추가하고
    
        String[] sArr = s.split(" "); //공백 기준으로 잘라서 배열에 넣고
        
        for(int i = 0; i < sArr.length; i++) { //쭉 돌다가
            if(sArr[i].length() == 0) {
                answer += " "; // 단어가 공백일 경우 반환값에 공백 더하기
            }else{
                answer += sArr[i].substring(0, 1).toUpperCase(); //단어 첫번째 대문자로 변환하여 더하기
                answer += sArr[i].substring(1, sArr[i].length()).toLowerCase();
                //첫글자를 제외하고 소문자로 변환하여 더하기
                
                answer += " "; // 위에가 한 요소 만든 거니까 그 뒤에 띄어쓰기
            }
        }
        //원래 문자열 마지막이 공백일 경우 그대로 answer 반환
        if(s.substring(s.length() -1, s.length()).equals(" ")) {
            return answer;
        }
        
        //마지막에 공백을 무조건 추가하기 때문에, 반환할 때는 빼고 반환
        return answer.substring(0, answer.length() - 1);
    }
}
