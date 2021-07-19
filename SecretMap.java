//비밀지도(2018 카카오 신입 공채)
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int binary1[][] = new int[n][n];
        int binary2[][] = new int[n][n];
        binary1 = binary(n, arr1);
        binary2 = binary(n, arr2);
        
        for(int i = 0; i<n; i++){
            answer[i] = "";
        }
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(binary1[i][j]==1||binary2[i][j]==1){
                    answer[i]+='#';
                }else{
                    answer[i]+=' ';
                }
            }
        }
        return answer;
    }
    
    
    public int[][] binary(int n, int[] arr){
        int[][] tmp = new int[n][n];
        
        //10진수 -> 2진수로 변환 
        for(int i = 0; i<n; i++){
            for(int j = n-1; j>=0; j--){
                tmp[i][j] = arr[i]%2;
                arr[i]/=2;
            }//end of for[i]
        }//end of for[j]
        
        return tmp;
    }
}