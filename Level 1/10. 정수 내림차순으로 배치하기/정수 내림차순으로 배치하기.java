import java.util.*; //이거 꼭 import 하기
class Solution {
    public long solution(long n) {
        String str = Long.toString(n); //n을 String 타입으로 만들고
        
        List<Character> list = new ArrayList<>(); //리스트를 하나 만들어서
        
        for (int i = 0; i < str.length(); i++) { //순환하면서 list에 하나씩 char로 넣어
            list.add(str.charAt(i));
        }
        
        list.sort(Comparator.reverseOrder()); //내림차순 정렬
        
        String listStr = ""; //list를 다시 String으로 만들기 위해 변수 선언
        
        for (int i = 0; i < list.size(); i++) { //리스트 돌면서 하나씩 넣어주기
            listStr += list.get(i);
        }
        
        return Long.parseLong(listStr); //그 listStr을 다시 long타입으로 바꿔 출력
    }
}
