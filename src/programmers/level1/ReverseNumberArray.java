package programmers.level1;

//자연수 뒤집어 배열로 만들기
class ReverseNumberArray {
    public int[] solution(long n) {
        String[] str = Long.toString(n).split("");
        int[] answer = new int[str.length];
        int j = 0;
        for(int i = str.length-1; i>=0; i--){
            answer[j++] = Integer.parseInt(str[i]);
        }
        return answer;
    }
}
/*
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
 */