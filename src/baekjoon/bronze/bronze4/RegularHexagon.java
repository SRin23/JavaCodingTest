package baekjoon.bronze.bronze4;
//정육각형과 삼각형
import java.util.Scanner;

public class RegularHexagon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        //Math.sin()의 매개변수로는 라디언의 값을 넣어주어야한다.
        //라디언 = (각도) * PI / 180
        double result = Math.pow(x, 2)* 0.5 * Math.sin(60.0*Math.PI/180);
        System.out.println(result);
    }
}
