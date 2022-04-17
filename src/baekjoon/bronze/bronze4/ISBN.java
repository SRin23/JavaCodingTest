package baekjoon.bronze.bronze4;
//ISBN
import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int isbn = 91;
        while(i<3){
            if(i%2==0) isbn +=sc.nextInt();
            else isbn += sc.nextInt()*3;
            i++;
        }
        System.out.println("The 1-3-sum is " + isbn);
    }
}
