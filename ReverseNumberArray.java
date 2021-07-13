class Solution {
    public long[] solution(long n) {
        long cpn = n;
        int cnt = 0;
        
        while(cpn!=0){
            cpn/=10;
            cnt++;
        }
        
        long[] answer = new long[cnt];
        int i = 0;
        
        while(n!=0){
            answer[i] = n%10;
            n/=10;
            i++;
        }
        return answer;
    }
}