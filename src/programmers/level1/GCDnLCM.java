package programmers.level1;
//최대공약수와 최소공배수
public class GCDnLCM {

	public static void main(String[] args) {
		int n = 3;
		int m = 12;
		int[] result = solution(n, m);
		System.out.print("결과 : ");
		for(int i = 0; i<result.length; i++) {
			System.out.print(result[i] + "\t");
		}
	}
	public static int[] solution(int n, int m) {
        int[] answer = new int [2];
        
        int tn = n;
        int tm = m;
        //최대 공약수
        while(tm != 0) {
		    int temp = tn % tm;
		    tn = tm;
		    tm = temp;
	    }
        answer[0] = tn;
        
        //최소 공배수
        answer[1] = m * n / tn;
        
        return answer;
    }
}
/*
public int[] solution(int n, int m) {
        int[] answer = new int[2];
        if(n>m){
            int tmp = n;
            n = m;
            m = tmp;
        }

        //최대공약수
        for(int i = 1; i<m; i++){
            if(n%i==0&&m%i==0){
                answer[0] = i;
            }
        }

        //최소공배수
        answer[1] = n*m/answer[0];
        return answer;
    }

 */