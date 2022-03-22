package baekjoon.silver.silver4;
//제로

import java.util.Scanner;
import java.util.Stack;

public class Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        Stack<Integer> money = new Stack<>();   //stack클래스 사용
        for(int i = 0; i<k; i++){
            int temp = sc.nextInt();
            if(temp==0){
                money.pop();
            }else{
                money.push(temp);
            }
        }

        int result = 0;
        while(0<money.size()){
            int temp = money.pop();
            result+=temp;
        }
        System.out.println(result);
    }
}
