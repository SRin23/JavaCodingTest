package baekjoon.bronze.bronze5;
//¼¼±Ý
import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tax = sc.nextInt();
		sc.close();
		
		System.out.println((int)(tax - (tax*0.22)));
		System.out.println((int)(tax - ((tax*0.2)*0.22)));
	}

}
