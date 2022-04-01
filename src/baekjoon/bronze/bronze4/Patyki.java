package baekjoon.bronze.bronze4;
//Patyki
import java.util.Arrays;
import java.util.Scanner;

public class Patyki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tri = new int[3];
        for(int i = 0; i<3; i++){
            tri[i] = sc.nextInt();
        }
        Arrays.sort(tri);
        if(tri[0]==tri[1]&&tri[1]==tri[2]) {System.out.println(2);}
        else if(Math.pow(tri[2], 2)==(Math.pow(tri[0], 2)+Math.pow(tri[1], 2))){System.out.println(1);}
        else {System.out.println(0);}
    }
}
