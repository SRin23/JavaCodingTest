package baekjoon.bronze.bronze4;
//Hard Choice
import java.util.Scanner;

public class HardChoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] airplane = new int[3];
        int[] client = new int[3];

        for(int i = 0; i<3; i++){
            airplane[i] = sc.nextInt();
        }

        for(int i = 0; i<3; i++){
            client[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i= 0; i<3; i++){
            int tmp = client[i] - airplane[i];
            if(tmp>0) sum+=tmp;
        }
        System.out.println(sum);
    }
}
