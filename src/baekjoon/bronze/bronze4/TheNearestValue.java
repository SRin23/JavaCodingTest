package baekjoon.bronze.bronze4;
//X ªËõÌªâÐÎª¤ö· (The Nearest Value)
import java.util.Scanner;

public class TheNearestValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int i;
        if(x<l) i = l;
        else if(x>r) i = r;
        else{
            for(i = l; i<=r; i++){
                if(x==i) break;
            }
        }

        System.out.println(i);
    }
}
