package programmers.level2;
//최대값과 최솟값
public class MaxAndMin {

	public static void main(String[] args) {
		String s = "1 2 3 4";
		String result = solution(s);
		System.out.println("최대값과 최솟값 : " + result);
		
		s = "-1 -2 -3 -4";
		result = solution(s);
		System.out.println("최대값과 최솟값 : " + result);

		s = "-1 -1";
		result = solution(s);
		System.out.println("최대값과 최솟값 : " + result);
	}

	public static String solution(String s) {
		String answer = "";

		// s문자열을 띄워쓰기를 기준으로 잘라서 str배열에 저장
		String[] str = s.split(" ");

		// 문자열이 str배열의 각 요소로 잘 저장되었는지 확인(출력)
		// for(int i = 0; i<nArr.length; i++){
		// System.out.println(nArr[i]);
		// }

		// str의 문자배열을 int형으로 저장할 int형 배열 선언
		int nArr[] = new int[str.length];

		// str배열의 문자형 요소를 int형으로 변환하여 nArr배열에 저장
		for (int i = 0; i < str.length; i++) {
			nArr[i] = Integer.parseInt(str[i]);
		}

		// int형으로 값이 잘 저장되었는지 확인(출력)
		// for(int i = 0; i<nArr.length; i++){
		// System.out.println(nArr[i]);
		// }

		// 최대값과 최소값을 저장할 int형 변수 max, min 선언
		int max = nArr[0], min = nArr[0];

		// nArr배열 중 최대값과 최솟값 구하기
		for (int i = 0; i < nArr.length; i++) {
			if (nArr[i] > max) {
				max = nArr[i];
			}
			if (nArr[i] < min) {
				min = nArr[i];
			}
		}

		// 최대값과 최솟값 확인을 위한 출력
		// System.out.println(max);
		// System.out.println(min);

		// answer에 "최솟값 최대값"으로 값 저장
		answer = min + " " + max;
		return answer;
	}
}
