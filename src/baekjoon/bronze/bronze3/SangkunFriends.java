package baekjoon.bronze.bronze3;
//상근이의 친구들
import java.util.Scanner;

public class SangkunFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int m = sc.nextInt();
            int f = sc.nextInt();
            if(m+f==0) break;
            else System.out.println(m+f);
        }
    }
}
