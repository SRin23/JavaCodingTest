package programmers.level1;

//문자열 내 마음대로 정렬하기
class StringSort {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        for(int i = 0; i<strings.length-1; i++){
            for(int j = i+1; j<strings.length; j++){
                if(strings[i].charAt(n)>strings[j].charAt(n)){
                    String tmp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = tmp;
                }
                else if(strings[i].charAt(n)==strings[j].charAt(n)){
		            if(strings[i].compareTo(strings[j])>0){
                        String tmp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = tmp;
                    }
                }
            }
        }
        
        for(int i = 0; i<strings.length; i++){
            answer[i] = strings[i];
        }

        return answer;
    }
}