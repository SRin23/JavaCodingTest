class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        int cnt;
        for(int i = 0; i<participant.length; i++){
            cnt = 0;
            for(int j = 0; j<completion.length; j++){
                if(participant[i].equals(completion[j])){
                    cnt++;
                    completion[j] = "/n";
                    break;
                }
            }
            if(cnt==0){
                answer = participant[i];
            }
        }
      
        return answer;
    }
}