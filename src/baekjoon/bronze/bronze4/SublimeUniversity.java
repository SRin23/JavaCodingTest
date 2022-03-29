package baekjoon.bronze.bronze4;
//와글와글 숭고한
import java.util.Scanner;

public class SublimeUniversity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ssu = sc.nextInt();
        int ku = sc.nextInt();
        int hyu = sc.nextInt();

        if(ssu+ku+hyu>=100){
            System.out.println("OK");
        }else{
            int min = Math.min(Math.min(ssu, ku), hyu);
            //세 대학의 참여도는 모두 다르다.
            if(min==ssu){
                System.out.println("Soongsil");
            }else if(min==ku){
                System.out.println("Korea");
            }else{
                System.out.println("Hanyang");
            }
        }
    }
}
