package baekjoon.bronze.bronze1;
//단어 순서 뒤집기
import java.util.Scanner;

public class ReverseWordOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();
        String[][] wordsZip = new String[n][];
        for(int i = 0; i<n; i++){
            String[] words = sc.nextLine().split(" ");
            wordsZip[i] = words;
        }

        for(int i = 0; i<n; i++){
            System.out.print("Case #" + (i+1) + ": ");
            for(int j = wordsZip[i].length-1; j>=0; j--){
                System.out.print(wordsZip[i][j] + " ");
            }
            System.out.println();
        }

    }
}
