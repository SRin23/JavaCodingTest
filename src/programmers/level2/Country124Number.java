package programmers.level2;
//124나라의 숫자
public class Country124Number {
	//출력 개수를 세는 클래스변수
	static int cnt = 1;
	public static void main(String[] args) {
		//10진수 1~15를 124나라의 숫자로 변환 
		for(int i = 1; i<=15; i++) {
			print(i);
		}
	}
	
	//출력하기 위한 함수
	public static void print(int n) {
		String result = solution(n);
		System.out.println("결과 " + cnt++ + " : " + result );
	}
	
	public static String solution(int n) {
        String answer = "";
        
        //n을 3으로 나눈 값을 저장할 변수
        int value = n;
        
        while(true){
        	//n을 3으로 나눈 나머지를 저장할 변수
            int remainder = value%3;
            
            //value를 3으로 나누어 value에 저장
            value/=3;
            
            //만약, 나머지가 0보다 크다면
            if(remainder>0){
            	//그 나머지 값을 answer 문자열 앞에 붙여 answer에 저장
                answer = Integer.toString(remainder) + answer;
            }
            //만약, 나머지가 0이라면(3의 나머지는 0, 1, 2뿐이다)
            else{
            	//answer 문자열 앞에 4를 붙여 answer에 저장 후
                answer = Integer.toString(4) + answer;
                //value의 값을 1 감소시킨다.
                value--;
            }
            
            //위 코드를 value가 0이 될때까지 반복한다.
            if(value==0){
                break;
            }
            
        }
        
        return answer;
	}

}
