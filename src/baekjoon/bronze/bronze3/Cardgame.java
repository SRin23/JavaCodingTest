package baekjoon.bronze.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cardgame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] A = br.readLine().split(" ");
        String[] B = br.readLine().split(" ");

        int aScore = 0;
        int bScore = 0;

        for(int i = 0; i<10; i++){
            if(Integer.valueOf(A[i]) > Integer.valueOf(B[i])){
                aScore+=3;
            }else if(Integer.valueOf(A[i]) < Integer.valueOf(B[i])){
                bScore+=3;
            }else {
                aScore++;
                bScore++;
            }
        }
    }
}
