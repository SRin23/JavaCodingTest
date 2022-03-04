package Baekjoon_Level3;
//±¸±¸´Ü
import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i = 1; i<10; i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
	}

}
