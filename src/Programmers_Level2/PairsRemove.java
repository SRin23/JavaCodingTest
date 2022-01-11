package Programmers_Level2;
import java.util.Stack;
//짝지어 제거하기
public class PairsRemove {

	public static void main(String[] args) {
		String s = "baabaa";
		int result = solution(s);
		System.out.println("결과1 : " + result);
		
		String s2 = "cdcd";
		int result2 = solution(s2);
		System.out.println("결과2 : "+ result2);
	}
	public static int solution(String s)
    {
        int answer = 0;
        
        //Character를 담을 Stack객체 생성
        Stack<Character> stack = new Stack<>();
        
        //stack에 s의 첫번째 값 추가
        stack.add(s.charAt(0));
        
        //1~s.length()까지 반복문 실행
        for(int i = 1; i<s.length(); i++){
        	//만약, stack의 크기가 0이라면
            if(stack.size()==0){
            	//현재 문자(s.charAt(i))를 stack에 저장
                stack.push(s.charAt(i));
            }else{
            	//만약, stack의 마지막 값과 현재 값(s.charAt(i))이 같다면
                if(stack.peek()==s.charAt(i)){
                	//같은 알파벳이 2개 붙어있는 것이므로 짝지어 제거하기 위해
                    //pop메서드 사용
                    stack.pop();    
                }else{
                	//값이 다르다면 stack에 현재 값(s.charAt(i)) 추가
                    stack.push(s.charAt(i));
                }
            }
        }
        
        //반복문이 종료된 후, stack의 크기가 0보다 크다면
        if(stack.size()!=0){
        	//모두 짝지어진것이 아니므로 answer을 0으로 저장
            answer = 0;
        }else{
        	//모두 짝지어져 stack의 크기가 0이라면 answer을 1로 저장
            answer = 1;
        }
        
        return answer;
    }
}
