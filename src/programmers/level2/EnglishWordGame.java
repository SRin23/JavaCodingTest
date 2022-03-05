package programmers.level2;
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
        
        //
        int idx = 0;
        
        //끝말잇기가 되지 않는 부분이 있는지 check하기 위한 변수선언
        boolean flag = false;
        
        //0~words.length-1까지  반복
        for(int i = 0; i<words.length-1; i++){
        	//1. 앞서 나왔던 단어를 사용할때,
        	
        	//words배열의 i+1~words.length까지의 인덱스 중 words[i]와 같은 값을 가지는 인덱스번호 반환하여 idx에 저장
            idx = Arrays.asList(Arrays.copyOfRange(words, i+1, words.length)).indexOf(words[i]);    
            
            //idx가 -1이 아니면(words[i]와 같은 값이 있으면)
            if(idx!=-1){
                //System.out.println(words[i] + " " + i + " " + (idx+i+1) + " " + words[idx+i+1]);
            	
            	//i+1~words.length까지 반복
                for(int j = i+1; j<words.length; j++){
                	//idx2변수를 이용하여 words[j]와 같은 값이 있는지 확인
                    int idx2 = Arrays.asList(Arrays.copyOfRange(words, j+1, words.length)).indexOf(words[j]);
                    //System.out.println(words[j] + " " + j + " " + (idx2+j+1) + " " + words[idx2 +j+ 1]);
                    
                    //idx2가 -1이 아니고(words[j]와 같은 값이 있고), idx2가 idx보다 작다면
                    //중복된 값이 2개 이상일때 예외를 처리하는 구문
                    if(idx2!=-1&&idx2<idx){
                        //System.out.println(idx2);
                    	//idx를 idx2+j로 변환
                        idx = idx2+j;
                        break;
                    }
                }
                //위와 같은 상황이 아니라면 방금 찾은 앞서 나왔던 단어를 중복하여 사용한 인덱스를 idx에 저장
                idx = idx+i+1;
                //탈락할만한 요소를 찾았으므로 flag를 true로 변환 후 break
                flag = true;
                break;
            }
            
            //2. 앞단어의 끝과 뒷단어의 앞 문자가 같지 않을 경우
            if(words[i].charAt(words[i].length()-1)!=(words[i+1].charAt(0))){
                //System.out.println(words[i] + " " + i + " " + words[i+1]);
            	//현재 idx의 바로 뒷 인덱스를 반환(mom-dad시 , 2번째 사람이 잘못한 것이므로)
            	//여기서 i+1을 사용하기 위해 for반복문이 words.length-1만큼 돌아가는것이다.
                idx = i+1;
                //탈락할만한 요소를 찾았으므로 flag를 true로 변환 후 break
                flag = true;
                break;
            }
            
            //3. words[i]의 길이가 1일 경우
            if(words[i].length()==1){
            	//현재 위치를 idx에 저장
                idx = i;
                //탈락할만한 요소를 찾았으므로 flag를 true로 변환 후 break;
                flag = true;
                break;
            }
        }
        
        //flag가 true라면(탈락할 만한 요소가 있었다면) 아래 문장 실행
        if(flag){
            answer[0] = (idx%n)+1;	
            answer[1] = (idx/n)+1;
        }
        
        return answer;
    }
}
