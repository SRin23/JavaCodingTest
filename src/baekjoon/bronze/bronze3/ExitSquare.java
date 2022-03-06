package baekjoon.bronze.bronze3;
//���簢������ Ż��
import java.util.Scanner;

public class ExitSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		sc.close();
		
		int width = Distance(x, w);	//���� ��ġ�� �����࿡���� �ּҰŸ�
		int height = Distance(y, h);//���� ��ġ�� �����࿡���� �ּҰŸ�
		
		//���ο� ���� �� �� ª�� �ּ� �Ÿ� ���ϱ�
		if(height < width) System.out.println(height);
		else System.out.println(width);
	}
	
	//���簢�� ���� ���� ��ġ ������ �ּ� �Ÿ� ���ϱ�
	//m�� ���� ��ġ, len�� ���簢���� ����(����/����)
	public static int Distance(int m, int len) {
		int result = 0;
		if(m > len/2) {
			result = len-m;
		}else {
			result = m;
		}
		return result;
	}
}
