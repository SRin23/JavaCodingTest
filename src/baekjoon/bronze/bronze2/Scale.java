package baekjoon.bronze.bronze2;
//À½°è
import java.util.Scanner;

public class Scale {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scale = new int[8];
		for(int i = 0; i<scale.length; i++) {
			scale[i] = sc.nextInt();
		}
		sc.close();
		boolean flag = true;
		if(scale[0]==1) {
			for(int i = 0; i<scale.length-1; i++) {
				if(scale[i]>scale[i+1]) {
					System.out.println("mixed");
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println("ascending");
			}
		}else if(scale[0]==8) {
			for(int i = 0; i<scale.length-1; i++) {
				if(scale[i]<scale[i+1]) {
					System.out.println("mixed");
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println("descending");
			}
		}else {
			System.out.println("mixed");
		}
	}

}
