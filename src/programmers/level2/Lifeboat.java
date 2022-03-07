package programmers.level2;
//구명보트
import java.util.Arrays;
import java.util.Collections;

public class Lifeboat {

	public static void main(String[] args) {
		int people[] = {70, 50, 80, 50};
		int limit = 100;
		int result = solution(people, limit);
		System.out.println("결과 : " + result);
	}
	public static int solution(int[] people, int limit) {
        int answer = 0;
        //배열 정렬하기(배열 인덱스를 이용하여 값을 구하는 문제가 아니기에)
        //배열을 정렬하여도 아무런 문제가 생기지 않는다.
        //Arrays.sort(배열) 사용시, 기본적으로 오름차순으로 정렬
        Arrays.sort(people);
        
        
        //정렬된 값 출력 확인
        //for(int i = 0; i<people.length; i++){
        //    System.out.println(people[i]);
        //}
        
        //people배열의 끝까지 반복
        for(int i = 0; i<people.length; i++){
            //people의 [i]값이 limit보다 작을때 아래 문장 실행
            if(people[i]<=limit){
                //정렬을 했기 때문에 큰값 - 작은값이 짝지어져 보트를 탈 수 있음
                for(int j = people.length-1; j>=i+1; j--){
                    if(people[i] + people[j]<=limit){
                        //System.out.println(people[i] + " " + people[j]);
                        people[j] = limit+1;
                        break;  //효율성을 높이기 위해 찾은 후 break문 실행
                    }
                }
                //System.out.println(people[i]);
                answer++;
            }
            //System.out.println("반복");
        }
        
        return answer;
    }
}
