package Programmers_Level2;
//JadenCase ���ڿ� �����
public class makeJadenCase {

	public static void main(String[] args) {
		String result = solution("3people unFollowed me");
		System.out.println("��� : " + result);
		
		result = solution("for the last week");
		System.out.println("��� : " + result);
	}
	
	public static String solution(String s) {
        String answer;
        
        //���ڿ� s�� char�迭�� ���� temp�迭 s.length��ŭ ���� 
        char temp[] = new char[s.length()];
        
        for(int i = 0; i<s.length(); i++){
            //s�� �� ���ڸ� temp�迭�� ����
            //�빮�ڶ�� �ҹ��ڷ� �ٲ㼭 temp �迭�� ����
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                temp[i] = (char)(s.charAt(i)+32);
            }else{
                temp[i] = s.charAt(i);
            }
            
            //temp�迭 �� ���� Ȯ��
            //System.out.println(temp[i]);
        }
        
        //������⸦ üũ�ϴ� ���� ����
        int index = 0;
        for(int i = 0; i<temp.length; i++){
            //��������, index�� -1
            if(temp[i]==' '){
                index = -1;
            }
            //�������� �ٷ� �� ���ڴ� �ܾ��� ù����
            if(index==0){
                //�ܾ��� ù ���ڰ� ���ǿ� �°� �� ���Դ��� Ȯ��
                //System.out.println(temp.charAt(i));
                
                //temp�迭�� ���� �� ��� �ҹ��ڷ� ��ȯ�����Ƿ� �ҹ��ڸ� ����üũ
                //�ܾ��� ù��° ���ڰ� �����϶�
                if(temp[i]>='a'&&temp[i]<='z'){
                    //�ҹ��ڸ� �빮�ڷ� ��ȯ(�ҹ��ھƽ�Ű�ڵ� - 32 = �빮�ھƽ�Ű�ڵ�)
                    temp[i]-=32;
                    //�� ��ȯ�Ǿ����� Ȯ��
                    //System.out.println(temp[i]);
                }
            }
            //�� ���ڸ��� index + 1
            index++;
        }
        //answer�� �����ڸ� �̿��Ͽ� temp�� String���� ��ȯ
        answer = new String(temp);
        return answer;
    }

}
/*
String answer = s;
answer.toLowerCase();
int index = 0;
for(int i = 0; i<answer.length(); i++){
    if(answer.charAt(i)==' '){
        index = -1;
    }
    if(index==0){
        //stem.out.println(answer.charAt(i));
        if(answer.charAt(i)>='a'&&answer.charAt(i)<='z'){
            System.out.println(answer.charAt(i));
            answer.charAt(i) = answer.charAt(i)-35;
        }
    }
    index++;
}
*/