package Programmers_Level2;

//이진변환반복하기
public class RepeatChangeBinary {

	public static void main(String[] args) {
		int[] result = solution("110010101001");
		System.out.println("{ " + result[0] + ", " + result[1] + " }");

	}

	public static int[] solution(String s) {
		// return값은 반복횟수, 0의 누적 개수를 배열로 만든 값이므로
		// 총 2개의 인덱스를 가지는 배열을 선언한다.
		int[] answer = new int[2];

		// s가 1이 아니면 아래 코드 실행
		while (!s.equals("1")) {
			// 1의 개수를 셀 cnt변수 생성
			int cnt = 0;

			// s의 길이만큼 반복
			for (int i = 0; i < s.length(); i++) {
				// 만약, s의 요소가 1이라면 cnt 1증가
				if (s.charAt(i) == '1') {
					cnt++;
				}
			}
			// answer의 1번 인덱스에사는 0의 개수 누적합을 구하므로
			// s의 전체 길이에서 1의 개수를 뺸수, 즉 0의 개수를 answer[1]에 저장한다.
			answer[1] += (s.length()) - cnt;
			// answer[0]은 반복 횟수를 세므로, while문이 끝날때마다 1증가한다.
			answer[0]++;
			// s의 값을 cnt를 2진수로 변환한 문자열로 변경한다.
			s = Integer.toBinaryString(cnt);
		}

		return answer;
	}

}
