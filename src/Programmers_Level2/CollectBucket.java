package Programmers_Level2;
//�ùٸ� ��ȣ
public class CollectBucket {

	public static void main(String[] args) {
		boolean result = solution("()()()");
		System.out.println("��� : " + result);
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
