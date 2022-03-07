package baekjoon.bronze.bronze2;
//알파벳 찾기
import java.util.Arrays;
import java.util.Scanner;

public class FindAlphabat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		int[] alphaNum = new int[26];
		Arrays.fill(alphaNum, -1);
		
		for(int i = 0; i<s.length(); i++) {
			if(alphaNum[s.charAt(i) - 'a']==-1) {
				alphaNum[s.charAt(i) - 'a'] = i;
			}
		}
		
		for(int i = 0; i<alphaNum.length; i++) {
			System.out.print(alphaNum[i] + " ");
		}
	}

}
