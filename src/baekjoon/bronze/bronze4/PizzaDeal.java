package baekjoon.bronze.bronze4;
//PizzaDeal
import java.util.Scanner;

public class PizzaDeal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double p2 = sc.nextDouble();

        double slice = a/p;
        double all = Math.pow(r, 2)*Math.PI/p2;

        if(slice>all){
            System.out.println("Slice of pizza");
        }else{
            System.out.println("Whole pizza");
        }
    }
}
