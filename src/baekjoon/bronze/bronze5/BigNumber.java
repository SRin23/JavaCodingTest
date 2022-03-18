package baekjoon.bronze.bronze5;
//큰 수
import java.util.Scanner;

public class BigNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		long remain = 0;
		for(int i = 0; i<n.length(); i++){
			remain = (remain*10+(n.charAt(i)-'0'))%20000303;
		}
		System.out.println(remain);
	}

}
