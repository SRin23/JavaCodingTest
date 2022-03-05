package programmers.level2;
import java.util.Arrays;
//���� �����ձ�
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
        
        //�����ձⰡ ���� �ʴ� �κ��� �ִ��� check�ϱ� ���� ��������
        boolean flag = false;
        
        //0~words.length-1����  �ݺ�
        for(int i = 0; i<words.length-1; i++){
        	//1. �ռ� ���Դ� �ܾ ����Ҷ�,
        	
        	//words�迭�� i+1~words.length������ �ε��� �� words[i]�� ���� ���� ������ �ε�����ȣ ��ȯ�Ͽ� idx�� ����
            idx = Arrays.asList(Arrays.copyOfRange(words, i+1, words.length)).indexOf(words[i]);    
            
            //idx�� -1�� �ƴϸ�(words[i]�� ���� ���� ������)
            if(idx!=-1){
                //System.out.println(words[i] + " " + i + " " + (idx+i+1) + " " + words[idx+i+1]);
            	
            	//i+1~words.length���� �ݺ�
                for(int j = i+1; j<words.length; j++){
                	//idx2������ �̿��Ͽ� words[j]�� ���� ���� �ִ��� Ȯ��
                    int idx2 = Arrays.asList(Arrays.copyOfRange(words, j+1, words.length)).indexOf(words[j]);
                    //System.out.println(words[j] + " " + j + " " + (idx2+j+1) + " " + words[idx2 +j+ 1]);
                    
                    //idx2�� -1�� �ƴϰ�(words[j]�� ���� ���� �ְ�), idx2�� idx���� �۴ٸ�
                    //�ߺ��� ���� 2�� �̻��϶� ���ܸ� ó���ϴ� ����
                    if(idx2!=-1&&idx2<idx){
                        //System.out.println(idx2);
                    	//idx�� idx2+j�� ��ȯ
                        idx = idx2+j;
                        break;
                    }
                }
                //���� ���� ��Ȳ�� �ƴ϶�� ��� ã�� �ռ� ���Դ� �ܾ �ߺ��Ͽ� ����� �ε����� idx�� ����
                idx = idx+i+1;
                //Ż���Ҹ��� ��Ҹ� ã�����Ƿ� flag�� true�� ��ȯ �� break
                flag = true;
                break;
            }
            
            //2. �մܾ��� ���� �޴ܾ��� �� ���ڰ� ���� ���� ���
            if(words[i].charAt(words[i].length()-1)!=(words[i+1].charAt(0))){
                //System.out.println(words[i] + " " + i + " " + words[i+1]);
            	//���� idx�� �ٷ� �� �ε����� ��ȯ(mom-dad�� , 2��° ����� �߸��� ���̹Ƿ�)
            	//���⼭ i+1�� ����ϱ� ���� for�ݺ����� words.length-1��ŭ ���ư��°��̴�.
                idx = i+1;
                //Ż���Ҹ��� ��Ҹ� ã�����Ƿ� flag�� true�� ��ȯ �� break
                flag = true;
                break;
            }
            
            //3. words[i]�� ���̰� 1�� ���
            if(words[i].length()==1){
            	//���� ��ġ�� idx�� ����
                idx = i;
                //Ż���Ҹ��� ��Ҹ� ã�����Ƿ� flag�� true�� ��ȯ �� break;
                flag = true;
                break;
            }
        }
        
        //flag�� true���(Ż���� ���� ��Ұ� �־��ٸ�) �Ʒ� ���� ����
        if(flag){
            answer[0] = (idx%n)+1;	
            answer[1] = (idx/n)+1;
        }
        
        return answer;
    }
}
