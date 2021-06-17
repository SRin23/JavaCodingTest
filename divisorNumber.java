class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int array[] = new int[arr.length];
        int r = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                array[r] = arr[i];
                r++;
            }
        }
        if(r==0){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }else{
             answer = new int[r];
        }
       
        
       for(int i = 0; i<r; i++){
           answer[i] = array[i];
       }
       answer = sort(answer);
       return answer;
    }
    
    public int[] sort(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
}