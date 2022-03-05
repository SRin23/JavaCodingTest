package programmers.level2;
//�ִ밪�� �ּڰ�
public class MaxAndMin {

	public static void main(String[] args) {
		String s = "1 2 3 4";
		String result = solution(s);
		System.out.println("�ִ밪�� �ּڰ� : " + result);
		
		s = "-1 -2 -3 -4";
		result = solution(s);
		System.out.println("�ִ밪�� �ּڰ� : " + result);

		s = "-1 -1";
		result = solution(s);
		System.out.println("�ִ밪�� �ּڰ� : " + result);
	}

	public static String solution(String s) {
		String answer = "";

		// s���ڿ��� ������⸦ �������� �߶� str�迭�� ����
		String[] str = s.split(" ");

		// ���ڿ��� str�迭�� �� ��ҷ� �� ����Ǿ����� Ȯ��(���)
		// for(int i = 0; i<nArr.length; i++){
		// System.out.println(nArr[i]);
		// }

		// str�� ���ڹ迭�� int������ ������ int�� �迭 ����
		int nArr[] = new int[str.length];

		// str�迭�� ������ ��Ҹ� int������ ��ȯ�Ͽ� nArr�迭�� ����
		for (int i = 0; i < str.length; i++) {
			nArr[i] = Integer.parseInt(str[i]);
		}

		// int������ ���� �� ����Ǿ����� Ȯ��(���)
		// for(int i = 0; i<nArr.length; i++){
		// System.out.println(nArr[i]);
		// }

		// �ִ밪�� �ּҰ��� ������ int�� ���� max, min ����
		int max = nArr[0], min = nArr[0];

		// nArr�迭 �� �ִ밪�� �ּڰ� ���ϱ�
		for (int i = 0; i < nArr.length; i++) {
			if (nArr[i] > max) {
				max = nArr[i];
			}
			if (nArr[i] < min) {
				min = nArr[i];
			}
		}

		// �ִ밪�� �ּڰ� Ȯ���� ���� ���
		// System.out.println(max);
		// System.out.println(min);

		// answer�� "�ּڰ� �ִ밪"���� �� ����
		answer = min + " " + max;
		return answer;
	}
}
