package baekjoon.bronze.bronze3;
//홀수
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        ArrayList<Integer> odd = new ArrayList<>();

        for(int i =0; i<7; i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2==1){
                odd.add(arr[i]);
            }
        }

        int sum = odd.stream().mapToInt(Integer::intValue).sum();   //arraylist내 모든 값 더하기

        if(sum==0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(Collections.min(odd));
        }


    }
}
