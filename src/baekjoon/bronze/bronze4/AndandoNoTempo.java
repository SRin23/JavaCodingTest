package baekjoon.bronze.bronze4;
//Andando no tempo
import java.util.Arrays;
import java.util.Scanner;

public class AndandoNoTempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] time = new int[3];
        int sum = 0;
        for(int i = 0; i<3; i++){
            time[i] = sc.nextInt();
            sum+=time[i];
        }
        Arrays.sort(time);
        if(time[0]==time[1]||time[1]==time[2]||time[2]==time[0]){
            System.out.println("S");
        }else if(time[2]==time[0]+time[1]){
            System.out.println("S");
        }else{
            System.out.println("N");
        }
    }
    
}
