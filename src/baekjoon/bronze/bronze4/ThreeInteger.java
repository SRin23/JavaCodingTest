package baekjoon.bronze.bronze4;
//3 ªÄªÎïÚ? (Three Integers)
import java.util.Scanner;

public class ThreeInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[2];
        for(int i = 0; i<3; i++){
            if(sc.nextInt()==1){
                num[0]++;
            }else{
                num[1]++;
            }
        }
        System.out.println(Math.max(num[0], num[1])==num[0]?1:2);
    }
}
