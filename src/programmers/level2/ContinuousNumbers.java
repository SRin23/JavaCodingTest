package programmers.level2;
//숫자의 표현
public class ContinuousNumbers {

	public static void main(String[] args) {
		int n = 15;
		int result = solution(n);
		System.out.println("15를 나타내는 연속적인 숫자의 합의 개수는 " + result + "개 입니다.");
	}
	public static int solution(int n) {
        int answer = 0;
        //1~n까지 반복문 실행
        for(int i = 1; i<=n; i++){
            //누적합을 구할 변수 선언
            int sum = 0;
            //연속된 숫자의 누적합을 구할 반복문
            for(int j = i; j<=n; j++){
                //누접합 구하기
                sum+=j;
                //만약, 누적된 합이 n과 같으면 answer +1
                //이후 sum에 누적되는 값들은 n보다 크기때문에 체크할 필요가 없으므로 
                //break문을 사용하여 반복 멈춤으로써 효율성 향상
                if(sum==n){
                    answer++;
                    break;
                }
                //연속적인 누적합이 만들어지지 않는 수들에 관해서도
                //누적된 값이 n보다 크면 break문 사용하여 효율성 향상
                else if(sum > n){
                    break;
                }
            }
        }
        return answer;
    }
}
