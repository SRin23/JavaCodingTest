package Programmers_Level2;

//������ȯ�ݺ��ϱ�
public class RepeatChangeBinary {

	public static void main(String[] args) {
		int[] result = solution("110010101001");
		System.out.println("{ " + result[0] + ", " + result[1] + " }");

	}

	public static int[] solution(String s) {
		// return���� �ݺ�Ƚ��, 0�� ���� ������ �迭�� ���� ���̹Ƿ�
		// �� 2���� �ε����� ������ �迭�� �����Ѵ�.
		int[] answer = new int[2];

		// s�� 1�� �ƴϸ� �Ʒ� �ڵ� ����
		while (!s.equals("1")) {
			// 1�� ������ �� cnt���� ����
			int cnt = 0;

			// s�� ���̸�ŭ �ݺ�
			for (int i = 0; i < s.length(); i++) {
				// ����, s�� ��Ұ� 1�̶�� cnt 1����
				if (s.charAt(i) == '1') {
					cnt++;
				}
			}
			// answer�� 1�� �ε�������� 0�� ���� �������� ���ϹǷ�
			// s�� ��ü ���̿��� 1�� ������ �A��, �� 0�� ������ answer[1]�� �����Ѵ�.
			answer[1] += (s.length()) - cnt;
			// answer[0]�� �ݺ� Ƚ���� ���Ƿ�, while���� ���������� 1�����Ѵ�.
			answer[0]++;
			// s�� ���� cnt�� 2������ ��ȯ�� ���ڿ��� �����Ѵ�.
			s = Integer.toBinaryString(cnt);
		}

		return answer;
	}

}
