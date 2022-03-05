package programmers.level1;
//�ִ������� �ּҰ����
public class GCDnLCM {

	public static void main(String[] args) {
		int n = 3;
		int m = 12;
		int[] result = solution(n, m);
		System.out.print("��� : ");
		for(int i = 0; i<result.length; i++) {
			System.out.print(result[i] + "\t");
		}
	}
	public static int[] solution(int n, int m) {
        int[] answer = new int [2];
        
        int tn = n;
        int tm = m;
        //�ִ� �����
        while(tm != 0) {
		    int temp = tn % tm;
		    tn = tm;
		    tm = temp;
	    }
        answer[0] = tn;
        
        //�ּ� �����
        answer[1] = m * n / tn;
        
        return answer;
    }
}
