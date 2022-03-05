package baekjoon.bronze.bronze1;
//단어 공부
import java.util.Scanner;

public class StudyWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str.toUpperCase();
		int[] alphaNum = new int[26];
		for(int i = 0; i<str.length(); i++) {
			alphaNum[str.charAt(i)-'A']++;
		}
		
		int MaxAlaph = 0;
		int max = alphaNum[0];
		for(int i = 0; i<alphaNum.length; i++) {
			if(alphaNum[i] > max) {
				MaxAlaph = i;
				max = alphaNum[i];
			}
		}
		
		boolean flag = true;
		for(int i = 0; i<alphaNum.length; i++) {
			if(MaxAlaph!=i&&alphaNum[i] == max) {
				System.out.println("?");
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println((char)(MaxAlaph+'A'));
		}
	}

}
