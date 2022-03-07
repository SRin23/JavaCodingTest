package baekjoon.bronze.bronze4;
//Speed fines are not fine!
import java.util.Scanner;

public class SpeedFinesAreNotFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int speed = sc.nextInt();

        int check = speed-limit;

        if(check > 1){
            System.out.print("You are speeding and your fine is $");
            if(check<=20){
                System.out.print(100);
            }else if(check <= 30){
                System.out.print(270);
            }else {
                System.out.print(500);
            }
            System.out.println(".");
        }else{
            System.out.println("Congratulations, you are within the speed limit!");
        }
    }
}
