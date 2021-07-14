//정수 제곱근 판별
class Solution {
    public long solution(long n) {
        long answer = -1;
        int m = (int)Math.sqrt(n);
        
        if(Math.pow(m, 2)==n){
            answer = (long)Math.pow(m+1, 2);
        }
        return answer;
    }
}