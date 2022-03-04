package Baekjoon_Bronze2;

//단어 개수
import java.util.Scanner;

public class WordNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine() + " ";
		sc.close();

		int result = 0;
		if(str.length()==0||str==" ") {
			System.out.println(0);
		}else {
			int tmp = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ') {
					if(tmp!=0) {
						result++;
						tmp = 0;
					}
				}else {
					tmp++;
				}
			}
		}
		System.out.println(result);
	}

}
