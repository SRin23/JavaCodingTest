package baekjoon.bronze.bronze5;
//Next in line
import java.util.Scanner;

public class NextInLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int yougest = sc.nextInt();
		int second = sc.nextInt();
		sc.close();
		
		System.out.println(second + (second-yougest));
	}

}
