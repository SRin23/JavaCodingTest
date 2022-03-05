package programmers.level2;
//피보나치 수

//설명 : n번째의 피보나치수를 1234567로 나눈 나머지를 구하시오
//참고 : 2<=n<=100,000

import java.util.ArrayList;

class FibonacciSequence {
	//피보나치 수를 담을 arraylist fiboArr 선언
  //ArrayList는 배열과 유사하지만, 크기가 변할 수 있다는 특징이 있음
	static ArrayList<Integer> fiboArr = new ArrayList<>();

	public static void main(String args[]) {
		int n = 1234;
		int rs = solution(n);
		System.out.println(n + "의 결과 : " + rs);
	}

	public static int solution(int n) {
		int answer = 0;
      //n은 2부터 시작하므로 fiboArr에 0과 1의 초기값을 설정
		fiboArr.add(0, 0);
		fiboArr.add(1, 1);
      
      //answer에 fibo(n)의 값 저장
		answer = fibo(n);
		return answer;
	}

	//피보나치 수를 구하는 메서드 fibo
	public static int fibo(int n) {
  	//n이 ArrayList의 사이즈보다 작으면, ArrayList에 n번째 피보나치 수가 저장되어 있다는 뜻
      //재귀 호출을 사용하지 않고 바로 ArrayList에 담겨 있는 값을 가져옴
		if(n<fiboArr.size()) {
			return fiboArr.get(n);
		}
      //n이 ArrayList의 사이즈보다 크면, 아직 ArrayList에 n번째 피보나치 수를 계산하지 않은 것이므로
      //재귀호출을 통해 피보나치 수 계산
      else {
      	//n이 1보다 작으면, n 반환
			if (n <= 1) {
				return n;
			} else {
          	//재귀호출을 이용하여 피보나치 수 구한 후, 
              //int의 크기를 벗어날 수 있으므로(n의 최대값 : 100,000) 
              //1234567로 나눈 값을 ArrayList에 저장
				int result = (fibo(n - 1) + fibo(n - 2)) % 1234567;
				fiboArr.add(n, result);
				return result;
			}
		}
		

	}
}