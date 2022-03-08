package baekjoon.bronze.bronze4;
//Darius님 한타 안 함?
import java.util.Scanner;

public class Darius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split("/");
        int K = Integer.parseInt(line[0]);
        int D = Integer.parseInt(line[1]);
        int A = Integer.parseInt(line[2]);

        if(D==0||K+A<D){
            System.out.println("hasu");
        }else{
            System.out.println("gosu");
        }
    }
}
