package Programmers_Level2;
//올바른 괄호
public class CollectBucket {

	public static void main(String[] args) {
		boolean result = solution("()()()");
		System.out.println("결과 : " + result);
	}
	public static boolean solution(String s) {
        boolean answer = true;

        int bracket = 0;
                   
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='(') bracket++;
            else if(s.charAt(i)==')') bracket--;
            if(bracket<0){
                answer = false;
            }
        }
        //System.out.println(bracket);
        if(bracket>0){
            answer = false;
        }
        return answer;
    }
}
