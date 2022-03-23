package baekjoon.bronze.bronze2;

//老蚌 抄里捞, 归汲傍林客 老蚌抄里捞
import java.util.Arrays;
import java.util.Scanner;

public class SevenDwarf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dwarf = new int[9];
        int sum = 0;

        for(int i = 0; i<9; i++){
            dwarf[i] = sc.nextInt();
            sum+=dwarf[i];
        }
        Arrays.sort(dwarf);
        for(int i = 0; i<8; i++){
            for(int j = i+1; j<9; j++){
                if(sum-dwarf[i]-dwarf[j]==100){
                    dwarf[i] = -1;
                    dwarf[j] = -1;
                    break;
                }
            }
            if(dwarf[i]==-1){
                break;
            }
        }

        for(int i = 0; i<9; i++){
            if(dwarf[i]>=0){
                System.out.println(dwarf[i]);
            }
        }

    }
}