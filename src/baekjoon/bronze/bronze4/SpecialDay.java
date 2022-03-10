package baekjoon.bronze.bronze4;
//특별한 날
import java.util.Scanner;

public class SpecialDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int date = sc.nextInt();

        if(month < 2){
            System.out.println("Before");
        }else if(month > 2){
            System.out.println("After");
        }else{
            if(date < 18) System.out.println("Before");
            else if(date > 18) System.out.println("After");
            else System.out.println("Special");
        }
    }
}
