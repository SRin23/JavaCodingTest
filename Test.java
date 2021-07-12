class Solution { 
    final int[] m1 = {1, 2, 3, 4, 5}; 
    final int[] m2 = {2, 1, 2, 3, 2, 4, 2, 5}; 
    final int[] m3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; 
     
    public int[] solution(int[] answers) { 

        int score[] = new int[3]; 
         
        for(int i = 0; i<answers.length; i++){ 
            if(answers[i]==m1[i%(m1.length)]){ 
                score[0]++; 
            } 
            if(answers[i] == m2[i%(m2.length)]){ 
                score[1]++; 
            } 
            if(answers[i] == m3[i%(m3.length)]){ 
                score[2]++; 
            } 
        } 
         
        int max = -1; 
        for(int i = 0; i<3; i++){ 
            if(max < score[i]){ 
                max = score[i]; 
            } 
        } 
        
        int r = 0; 
        for(int i = 0; i<3; i++){ 
            if(score[i]==max){ 
                r++; 
            } 
        } 
         
        int[] answer = new int[r]; 
        int len = 0; 
        for(int i = 0; i<score.length; i++){ 
            if(score[i]==max){ 
                answer[len] = i+1; 
                len++; 
            } 
        } 
     
        return answer; 
    } 
}