package Programmers_Level2;

//���� ū ����
public class NextBigNumber {

	public static void main(String[] args) {
		int n = 78;
		int result = solution(n);
		System.out.println(n + "�� ���� ū ���� : " + result);
	}

	public static int solution(int n) {
		int answer = 0;

		// n�� 2������ ��ȯ ��, 1�� ���� ���ϱ�
		int cnt = 0;
		String binaryString = Integer.toBinaryString(n);
		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) == '1') {
				cnt++;
			}
		}

		// n���� ū �� �� 2������ ��ȯ�� ���� 1������ n�� ���� �� ���ϱ�
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
