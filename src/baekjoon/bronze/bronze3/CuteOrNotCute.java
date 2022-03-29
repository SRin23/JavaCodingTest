package baekjoon.bronze.bronze3;
//0 = not cute / 1 = cute
import java.util.Scanner;

public class CuteOrNotCute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]survey = new int[2];
        for(int i = 0; i<n; i++){
            if(sc.nextInt()==0){
                survey[0]++;
            }else{
                survey[1]++;
            }
        }
        if(survey[0] > survey[1]){
            System.out.println("Junhee is not cute!");
        }else{
            System.out.println("Junhee is cute!");
        }
    }
}
