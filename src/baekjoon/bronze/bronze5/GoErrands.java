package baekjoon.bronze.bronze5;
//�ɺθ� ���±�
import java.util.Scanner;

public class GoErrands {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int homeToSchool = sc.nextInt();
		int schoolToPC = sc.nextInt();
		int pcToAca = sc.nextInt();
		int acaToHome = sc.nextInt();
		sc.close();
		
		int sum = homeToSchool + schoolToPC + pcToAca + acaToHome;
		System.out.println(sum/60);
		System.out.println(sum%60);
	}

}
