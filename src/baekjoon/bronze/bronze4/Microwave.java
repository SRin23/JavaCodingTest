package baekjoon.bronze.bronze4;
//전자레인지
import java.util.Scanner;

public class Microwave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] micro = {300, 60, 10};
        int t = sc.nextInt();

        int[] abc = new int[3];
        for(int i = 0; i<micro.length; i++){
            if(t >= micro[i]){
                abc[i] = t/micro[i];
            }else{
                abc[i] = 0;
            }
            t -= micro[i]*abc[i];
        }

        if(t>0){
            System.out.println(-1);
        }else{
            for(int i = 0; i<micro.length; i++){
                System.out.print(abc[i] + " ");
            }
        }
    }
}
