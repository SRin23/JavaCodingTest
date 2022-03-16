package baekjoon.bronze.bronze5;
//Affischutskicket
import java.util.Scanner;

public class Affischutskicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] size = {0.148392, 0.24948, 0.06237};
        double weight = 0;

        for(int i = 0 ; i<3; i++){
            int input = sc.nextInt();
            weight+=input*size[i];
        }
        System.out.printf("%.06f", weight);
    }
}
