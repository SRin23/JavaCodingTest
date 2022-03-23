package baekjoon.bronze.bronze2;

import java.util.Arrays;
import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] card = new int[n];

        for(int i = 0; i<n; i++){
            card[i] = sc.nextInt();
        }

        Arrays.sort(card);
        int sum = 0;

        for(int i = 0; i<n-2; i++){
            for(int j = i+1; j<n-1; j++){
                for(int k = j+1; k<n; k++){
                    int tmp = card[i]+card[j]+card[k];
                    if(m-tmp==0){
                        System.out.println(tmp);
                        return;
                    }else if(m-tmp > 0){
                        if(sum < tmp){
                            sum = tmp;
                        }
                    }else{
                        break;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}