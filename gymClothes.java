//체육복
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int cnt = 0;
        outer:for(int i = 0; i<lost.length; i++){
            for(int j = 0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    reserve[j] = -1;
                    lost[i] = -1;
                    continue outer;
                }
            }
        }
        
        
        for(int i = 0; i<lost.length; i++){
            cnt = 0;
            for(int j = 0; j<reserve.length; j++){
                if(lost[i]==-1||reserve[j]==-1){
                    continue;
                }
                if(lost[i] == (reserve[j]+1) || lost[i] == (reserve[j]-1)){
                    reserve[j] = -1; 
                    cnt++;
                    break;
                }
            }

            if(cnt==0&&lost[i]!=-1){
                System.out.println(lost[i] + " : " + cnt);
                answer--;
            }
        }
        return answer;
    }
}