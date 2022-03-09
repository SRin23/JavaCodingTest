package programmers.level1;

public class Ternary {
    public int solution(int n) {
        int answer = 0;
        int cpn = n;

        while(cpn != 0){
            int three = cpn % 3;
            answer *= 3;
            answer += three;
            cpn /= 3;
        }
        return answer;
    }
}
