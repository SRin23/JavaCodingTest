package baekjoon.bronze.bronze4;
//과목 선택
import java.util.Arrays;
import java.util.Scanner;

public class ChoiceSubject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] science = new int[4];
        int[] social = new int[2];
        for(int i = 0; i<4; i++){
            science[i] = sc.nextInt();
        }
        Arrays.sort(science);
        for(int j = 0; j<2; j++){
            social[j] = sc.nextInt();
        }
        Arrays.sort(social);

        int sum = 0;
        for(int i = 1; i<4; i++){
            sum+=science[i];
        }
        sum+=social[1];
        System.out.println(sum);


    }
}
