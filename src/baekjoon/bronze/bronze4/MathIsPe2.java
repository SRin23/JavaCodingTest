package baekjoon.bronze.bronze4;
//수학은 체육과목입니다2
import java.util.Scanner;

public class MathIsPe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()%8;
        switch(n){
            case 1:
                System.out.println(1); break;
            case 2:
            case 0:
                System.out.println(2);
                break;
            case 3:
            case 7:
                System.out.println(3);
                break;
            case 4:
            case 6:
                System.out.println(4);
                break;
            default:
                System.out.println(5);
                break;
        }
    }
}
