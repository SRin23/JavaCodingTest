package baekjoon.bronze.bronze2;
//¾Æ!
import java.util.Scanner;

public class Ah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String customer = sc.next();
        String doctor = sc.next();
        if(customer.length() >= doctor.length()){
            System.out.println("go");
        }else{
            System.out.println("no");
        }
    }
}