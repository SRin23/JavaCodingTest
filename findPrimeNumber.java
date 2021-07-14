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