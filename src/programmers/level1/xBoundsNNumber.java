package programmers.level1;
//x만큼 간격이 있는 n개의 숫자
public class xBoundsNNumber {

	public static void main(String[] args) {
		int x = 2; 
		int y = 5; 
		long[] result = solution(x, y);
		System.out.print("결과 : ");
		for(int i = 0; i<y; i++) {
			System.out.print(result[i] + ", ");
		}
	}
	
	public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long temp = x;
        for(int i = 0; i<n; i++){
            answer[i] = temp;
            temp+=x;
        }
        return answer;
    }
}
