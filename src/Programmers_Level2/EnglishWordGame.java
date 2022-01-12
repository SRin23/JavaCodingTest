package Programmers_Level2;
import java.util.Arrays;
//영어 끝말잇기
public class EnglishWordGame {

	public static void main(String[] args) {
		//int n = 3;
		//String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		
		int n = 2;
		String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
		int[] result = solution(n, words);
		for(int i = 0; i<result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	
	public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int idx = 0;
        boolean flag = false;
        for(int i = 0; i<words.length-1; i++){
            idx = Arrays.asList(Arrays.copyOfRange(words, i+1, words.length)).indexOf(words[i]);            
            if(idx!=-1){
                //System.out.println(words[i] + " " + i + " " + (idx+i+1) + " " + words[idx+i+1]);
                for(int j = i+1; j<words.length; j++){
                    int idx2 = Arrays.asList(Arrays.copyOfRange(words, j+1, words.length)).indexOf(words[j]);
                    //System.out.println(words[j] + " " + j + " " + (idx2+j+1) + " " + words[idx2 +j+ 1]);
                    if(idx2!=-1&&idx2<idx){
                        //System.out.println(idx2);
                        idx = idx2+j;
                        break;
                    }
                }
                idx = idx+i+1;
                flag = true;
                break;
            }
            
            if(words[i].charAt(words[i].length()-1)!=(words[i+1].charAt(0))){
                //System.out.println(words[i] + " " + i + " " + words[i+1]);
                idx = i+1;
                flag = true;
                break;
            }
            
            if(words[i].length()==1){
                idx = i;
                flag = true;
                break;
            }
        }
        
        if(flag){
            answer[0] = (idx%n)+1;
            answer[1] = (idx/n)+1;
        }
        
        return answer;
    }
}
