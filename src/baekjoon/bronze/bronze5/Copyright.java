package baekjoon.bronze.bronze5;
//저작권
import java.util.Scanner;

public class Copyright {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int songNum = sc.nextInt();
		int average = sc.nextInt();
		sc.close();
		System.out.println(songNum*(average-1)+1);
		//올림이므로, 0에서 0.1이라도 크면 1로 반환됨을 유의!!
		//최소의 멜로디개수를 구해야하므로 저 0.1도 중요하다는 사실
		//앨범 노래의 개수 * 각 음원의 저작권비 평균에서 
		//1을 뺀 후, 전체 곱해진 값에 1을 더하면 가장 올림 되기 전
		//가장 최소의 값이 나올 수 있게 된다.
	}

}
