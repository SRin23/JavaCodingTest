package Baekjoon_Level1;
//1998����� ���� �±������� 2541���?!
import java.util.Scanner;
public class MyBirthday {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int thailandYear = sc.nextInt();
		sc.close();
		
		//���⿬���� �ұ⿬���� ���̰� 
		int diff = 543;
		System.out.println(thailandYear-diff);
	}

}
