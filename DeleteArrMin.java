//제일 작은 수 제거하기
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        answer = new int[arr.length-1];
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        
        int r = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=min){
                answer[r] = arr[i];
                r++;
            }
        }
        return answer;
    }
}