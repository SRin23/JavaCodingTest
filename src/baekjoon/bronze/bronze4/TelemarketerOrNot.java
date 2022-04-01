package baekjoon.bronze.bronze4;
//Telemarketer Or Not?
import java.util.Scanner;

public class TelemarketerOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tel = new int[4];
        for(int i = 0; i<4; i++){
            tel[i] = sc.nextInt();
        }

        if((tel[0]==9||tel[0]==8)&&(tel[3]==9||tel[3]==8)){
            if(tel[1]==tel[2]) System.out.println("ignore");
            else System.out.println("answer");
        }else System.out.println("answer");
    }
}
