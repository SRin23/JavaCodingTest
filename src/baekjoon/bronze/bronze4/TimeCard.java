package baekjoon.bronze.bronze4;
//타임카드
import java.util.Scanner;

public class TimeCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] work = new int[6][3];
        for(int i = 0; i<work.length; i++) {
            for(int j = 0; j<work[0].length; j++){
                work[i][j] = sc.nextInt();
            }
        }

        int working[][] = new int[3][3];
        int k = 0;

        for(int i = 0; i<6; i+=2){
            for(int j = 2; j>=0; j--){
                if(work[i][j] > work[i+1][j]){
                    if(j!=0){
                        work[i+1][j-1]--;
                        working[k][j]=work[i+1][j] + 60 - work[i][j];
                    }
                }else{
                    working[k][j] = work[i+1][j] - work[i][j];
                }
            }
            k++;
        }

        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(working[i][j] + " ");
            }
            System.out.println();
        }
    }
}
