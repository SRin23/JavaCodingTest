class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        int cnt = 0;
        
        int count = 0;
        for(int i = 0; i<participant.length-1; i++){
            for(int j = i+1; j<participant.length; j++){
                if(participant[i].equals(participant[j])){
                    count++;
                    answer = participant[i];
                }
            }
        }
        
        if(count>=2){
            for(int i = 0; i<completion.length; i++){
                for(int j = 0; j<completion.length; j++){
                    if(completion[i].equals(completion[j])){
                        if(answer.equals(completion[i])){
                            count--;
                        }
                    }
                }
            }
            if(count!=0){
                return answer;
            }
        }
        
        for(int i = 0; i<participant.length; i++){
            cnt = 0;
            for(int j = 0; j<completion.length; j++){
                if(!(participant[i].equals(completion[j]))){
                    cnt++;
                }
            }
            
            if(cnt==completion.length){
                answer = participant[i];
            }
        }
        return answer;
    }
}