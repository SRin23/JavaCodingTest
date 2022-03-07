package baekjoon.bronze.bronze4;
//방학숙제
import java.util.Scanner;

public class VacationHomework {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		int resultA = 0;
		if(A%C!=0){
			resultA = A/C + 1;
		}else{
			resultA = A/C;
		}

		int resultB = 0;
		if(B%D!=0){
			resultB = B/D + 1;
		}else{
			resultB = B/D;
		}

		if(resultA > resultB){
			System.out.println(L - resultA);
		}else {
			System.out.println(L - resultB);
		}


		sc.close();
		
		
		
	}

}
