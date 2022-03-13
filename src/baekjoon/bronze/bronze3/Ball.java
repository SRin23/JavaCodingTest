package baekjoon.bronze.bronze3;
//공
import java.util.Scanner;

public class Ball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ball = new int[]{1, 2, 3};
        for(int i = 0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            boolean[] flag = new boolean[]{false, false};
            int[] idx = new int[2];
            for(int j = 0; j<3; j++){
                if(ball[j]==x){
                    flag[0] = true;
                    idx[0] = j;
                }
                if(ball[j]==y){
                    flag[1] = true;
                    idx[1] = j;
                }
                if(flag[0]==true&&flag[1]==true){
                    break;
                }
            }
            int temp = ball[idx[0]];
            ball[idx[0]] = ball[idx[1]];
            ball[idx[1]] = temp;
        }

        System.out.println(ball[0]);
    }
}
