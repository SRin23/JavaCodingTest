package Programmers_Level2;

//다음 큰 숫자
public class NextBigNumber {

	public static void main(String[] args) {
		int n = 78;
		int result = solution(n);
		System.out.println(n + "의 다음 큰 숫자 : " + result);
	}

	public static int solution(int n) {
		int answer = 0;

		// n을 2진수로 변환 후, 1의 개수 구하기
		int cnt = 0;
		String binaryString = Integer.toBinaryString(n);
		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) == '1') {
				cnt++;
			}
		}

		// n보다 큰 수 중 2진수로 변환한 값의 1개수가 n과 같은 값 구하기
		while (true) {
			int chCnt = 0;
			String binaryString2 = Integer.toBinaryString(++n);
			for (int i = 0; i < binaryString2.length(); i++) {
				if (binaryString2.charAt(i) == '1') {
					chCnt++;
				}
			}
			if (cnt == chCnt) {
				answer = n;
				break;
			}
		}

		return answer;
	}
}
