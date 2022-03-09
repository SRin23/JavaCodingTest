//같은 숫자는 싫어
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int cnt = 1;
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1]){
                cnt++;
            }
        }
        
        int answer[] = new int[cnt];
        int j = 1;
        answer[0] = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                answer[j] = arr[i];
                j++;
            }
        }
        return answer;
    }
}