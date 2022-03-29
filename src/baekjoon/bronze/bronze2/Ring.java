package baekjoon.bronze.bronze2;
//¹ÝÁö
import java.util.Scanner;

public class Ring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int t = sc.nextInt();
        int result = 0;
        for(int i = 0; i<t; i++){
            String temp = sc.next();
            temp = temp.concat(temp);
            if(temp.contains(word)){
                result++;
            }
        }
        System.out.println(result);
    }
}
