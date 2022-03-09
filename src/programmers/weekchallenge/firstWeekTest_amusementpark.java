package programmers.weekchallenge;

//위클리 챌린지_1주차
class firstWeekTest_amusementpark {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for(int i = 1; i<=count; i++){
            answer += price*i;
        }
        
        if((money-answer)<0){
            answer = answer-money;
        }else{
            answer = 0;
        }
        return answer;
    }
}