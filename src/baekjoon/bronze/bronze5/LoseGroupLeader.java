package baekjoon.bronze.bronze5;

import java.util.Scanner;

//조별과제를 하려는데 조장이 사라졌다
public class LoseGroupLeader {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int distance = sc.nextInt();
		sc.close();
		if(distance%5==0) {
			System.out.println(distance/5);
		}else {
			System.out.println(distance/5 + 1);
		}
	}

}
