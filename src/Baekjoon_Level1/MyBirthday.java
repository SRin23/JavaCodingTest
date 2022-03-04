package Baekjoon_Level1;
//1998년생인 내가 태국에서는 2541년생?!
import java.util.Scanner;
public class MyBirthday {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int thailandYear = sc.nextInt();
		sc.close();
		
		//서기연도와 불기연도의 차이값 
		int diff = 543;
		System.out.println(thailandYear-diff);
	}

}
