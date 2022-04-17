package baekjoon.bronze.bronze4;
//Judging Moose
import java.util.Scanner;

public class JudgingMoose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        if(l==r&&r==0){
            System.out.println("Not a moose");
        }
        else if(l==r){
            System.out.println("Even " + (l+r));
        }else{
            System.out.println("Odd " + Math.max(l, r)*2);
        }
    }
}
