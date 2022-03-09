package programmers.level1;

//짝수와 홀수
class EvenNOdd {
    public String solution(int num) {
        String answer = "";
        if(num%2==0){
            answer = "Even";
        }else{
            answer = "Odd";
        }
        return answer;
    }
}