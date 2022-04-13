package baekjoon.bronze.bronze4;
//Bicycle
import java.util.Scanner;

public class Bicycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = sc.nextInt();
        int b = sc.nextInt();
        int y = sc.nextInt();
        int t = sc.nextInt();

        int first = a;
        int second = b;

        if(t>30) first += ((t-30)*x)*21;

        if(t>45) second += ((t-45)*y)*21;

        System.out.println(first + " " + second);
    }
}
