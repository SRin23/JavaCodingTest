package baekjoon.bronze.bronze3;
//¾Þ±×¸® Ã¢¿µ
import java.util.Scanner;

public class AngryChangyoung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        double max = Math.sqrt(Math.pow(w, 2)+Math.pow(h, 2));
        //System.out.println(max);
        for(int i = 0; i<n; i++){
            if(sc.nextInt() <= max){
                System.out.println("DA");
            }else{
                System.out.println("NE");
            }
        }
    }
}
