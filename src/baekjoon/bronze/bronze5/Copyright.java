package baekjoon.bronze.bronze5;
//���۱�
import java.util.Scanner;

public class Copyright {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int songNum = sc.nextInt();
		int average = sc.nextInt();
		sc.close();
		System.out.println(songNum*(average-1)+1);
		//�ø��̹Ƿ�, 0���� 0.1�̶� ũ�� 1�� ��ȯ���� ����!!
		//�ּ��� ��ε𰳼��� ���ؾ��ϹǷ� �� 0.1�� �߿��ϴٴ� ���
		//�ٹ� �뷡�� ���� * �� ������ ���۱Ǻ� ��տ��� 
		//1�� �� ��, ��ü ������ ���� 1�� ���ϸ� ���� �ø� �Ǳ� ��
		//���� �ּ��� ���� ���� �� �ְ� �ȴ�.
	}

}
