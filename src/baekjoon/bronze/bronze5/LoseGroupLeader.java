package baekjoon.bronze.bronze5;

import java.util.Scanner;

//���������� �Ϸ��µ� ������ �������
public class LoseGroupLeader {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int distance = sc.nextInt();
		sc.close();
		if(distance%5==0) {
			System.out.println(distance/5);
		}else {
			System.out.println(distance/5 + 1);
		}
	}

}
