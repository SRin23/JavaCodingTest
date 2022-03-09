//소수 찾기
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 2;i<=n; i++){
            boolean cnt = true;
            cnt = true;
            for(int j = 2; j<i; j++){
                if(i%j==0){
                    cnt = false;
                    break;
                }
            }
            if(cnt){
                answer++;
            }
            
        }
        return answer;
    }
}
/*
import java.util.ArrayList;

class Solution{
	
	public int solution(int n) {
		ArrayList<Integer> sosu = new ArrayList<Integer>();//소수를 담을 List

		if(n == 2) {//만약 n이 2로 들어올 경우 소수는 1개이기 때문에 1 반환
			return 1;
		}
		
		//2와 3을 미리 넣어 5부터 탐색
		sosu.add(2);
		sosu.add(3);
		
		//만약 n이 5보다 작으면 2와 3만 소수
		//짝수는 소수가 아니기 때문에 5에서부터 2씩 늘린다.
		for(int i = 5; i <= n; i+=2) {
			int x = 1;
			if(sosu.get(x) * sosu.get(x) > i) {//9 이하의 소수는 여기서 추가된다.
				sosu.add(i);
			}else {
				for(int j = 1; i >= sosu.get(j) * sosu.get(j); j++) {
					if(i % sosu.get(j) == 0) {//소수로 나눠지면 소수가 아니기 때문에 for문을 빠져나온다
						break;
					}else if(i >= Math.pow(sosu.get(j), 2) && i < Math.pow(sosu.get(j+1), 2)){
						//최대로 나눌 수 있는 값을 나눴는데도 나눠지지 않으면 소수로 판단, 리스트에 추가
						sosu.add(i);
					}//in - if
				}//in - for
			}//out - if
		}//out - for

		return sosu.size();
	}
}
*/