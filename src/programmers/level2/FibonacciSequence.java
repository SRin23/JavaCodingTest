package programmers.level2;
//�Ǻ���ġ ��

//���� : n��°�� �Ǻ���ġ���� 1234567�� ���� �������� ���Ͻÿ�
//���� : 2<=n<=100,000

import java.util.ArrayList;

class FibonacciSequence {
	//�Ǻ���ġ ���� ���� arraylist fiboArr ����
  //ArrayList�� �迭�� ����������, ũ�Ⱑ ���� �� �ִٴ� Ư¡�� ����
	static ArrayList<Integer> fiboArr = new ArrayList<>();

	public static void main(String args[]) {
		int n = 1234;
		int rs = solution(n);
		System.out.println(n + "�� ��� : " + rs);
	}

	public static int solution(int n) {
		int answer = 0;
      //n�� 2���� �����ϹǷ� fiboArr�� 0�� 1�� �ʱⰪ�� ����
		fiboArr.add(0, 0);
		fiboArr.add(1, 1);
      
      //answer�� fibo(n)�� �� ����
		answer = fibo(n);
		return answer;
	}

	//�Ǻ���ġ ���� ���ϴ� �޼��� fibo
	public static int fibo(int n) {
  	//n�� ArrayList�� ������� ������, ArrayList�� n��° �Ǻ���ġ ���� ����Ǿ� �ִٴ� ��
      //��� ȣ���� ������� �ʰ� �ٷ� ArrayList�� ��� �ִ� ���� ������
		if(n<fiboArr.size()) {
			return fiboArr.get(n);
		}
      //n�� ArrayList�� ������� ũ��, ���� ArrayList�� n��° �Ǻ���ġ ���� ������� ���� ���̹Ƿ�
      //���ȣ���� ���� �Ǻ���ġ �� ���
      else {
      	//n�� 1���� ������, n ��ȯ
			if (n <= 1) {
				return n;
			} else {
          	//���ȣ���� �̿��Ͽ� �Ǻ���ġ �� ���� ��, 
              //int�� ũ�⸦ ��� �� �����Ƿ�(n�� �ִ밪 : 100,000) 
              //1234567�� ���� ���� ArrayList�� ����
				int result = (fibo(n - 1) + fibo(n - 2)) % 1234567;
				fiboArr.add(n, result);
				return result;
			}
		}
		

	}
}