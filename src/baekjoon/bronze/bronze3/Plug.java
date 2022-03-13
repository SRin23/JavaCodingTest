package baekjoon.bronze.bronze3;
//플러그
import java.util.Scanner;

public class Plug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for(int i = 0; i<n; i++){
            if(i==n-1){
                result+=sc.nextInt();
            }else{
                result+=sc.nextInt()-1;
            }
        }
        System.out.println(result);
    }
}
