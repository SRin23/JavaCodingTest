package baekjoon.bronze.bronze4;
//���������� �ﰢ��
import java.util.Scanner;

public class RegularHexagon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        //Math.sin()�� �Ű������δ� ������ ���� �־��־���Ѵ�.
        //���� = (����) * PI / 180
        double result = Math.pow(x, 2)* 0.5 * Math.sin(60.0*Math.PI/180);
        System.out.println(result);
    }
}
