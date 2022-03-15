package baekjoon.bronze.bronze2;
//A+B-6
import java.util.Scanner;

public class SumABMinus6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //sc.next();

        for(int i = 0; i<n; i++){
            String[] arr = sc.next().split(",");
            int sum = 0;

            for(int j = 0; j<arr.length; j++){
                sum += Integer.parseInt(arr[j]);
            }
            System.out.println(sum);

        }
    }
}
