package programmers.level1;//K번째 수

class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
     int[] answer = new int[commands.length];
        
        for(int i = 0; i<commands.length; i++){
            int between[] = new int[commands[i][1] - commands[i][0] +1];
            int r = 0;
            for(int j = commands[i][0]-1; j<commands[i][1]; j++){
                between[r] = array[j];
                r++;
            }
            sort(between);
            answer[i] = between[commands[i][2]-1];
        }
        return answer;
    }
	    
	static int[] sort(int[] array){
	    for(int i = 0; i<array.length-1; i++){
	        for(int j = i + 1; j<array.length; j++){
	            if(array[i]>array[j]){
	                int tmp = array[i];
	                array[i] = array[j];
	                array[j] = tmp;
	            }
	        }
	    }
	    return array;
	}
}