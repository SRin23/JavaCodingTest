package programmers.level2;
import java.util.Stack;
//¦���� �����ϱ�
public class PairsRemove {

	public static void main(String[] args) {
		String s = "baabaa";
		int result = solution(s);
		System.out.println("���1 : " + result);
		
		String s2 = "cdcd";
		int result2 = solution(s2);
		System.out.println("���2 : "+ result2);
	}
	public static int solution(String s)
    {
        int answer = 0;
        
        //Character�� ���� Stack��ü ����
        Stack<Character> stack = new Stack<>();
        
        //stack�� s�� ù��° �� �߰�
        stack.add(s.charAt(0));
        
        //1~s.length()���� �ݺ��� ����
        for(int i = 1; i<s.length(); i++){
        	//����, stack�� ũ�Ⱑ 0�̶��
            if(stack.size()==0){
            	//���� ����(s.charAt(i))�� stack�� ����
                stack.push(s.charAt(i));
            }else{
            	//����, stack�� ������ ���� ���� ��(s.charAt(i))�� ���ٸ�
                if(stack.peek()==s.charAt(i)){
                	//���� ���ĺ��� 2�� �پ��ִ� ���̹Ƿ� ¦���� �����ϱ� ����
                    //pop�޼��� ���
                    stack.pop();    
                }else{
                	//���� �ٸ��ٸ� stack�� ���� ��(s.charAt(i)) �߰�
                    stack.push(s.charAt(i));
                }
            }
        }
        
        //�ݺ����� ����� ��, stack�� ũ�Ⱑ 0���� ũ�ٸ�
        if(stack.size()!=0){
        	//��� ¦���������� �ƴϹǷ� answer�� 0���� ����
            answer = 0;
        }else{
        	//��� ¦������ stack�� ũ�Ⱑ 0�̶�� answer�� 1�� ����
            answer = 1;
        }
        
        return answer;
    }
}
/*
import java.util.ArrayList;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        ArrayList<Character> chs = new ArrayList<>();
        
        for(int i = 0; i<s.length(); i++){
            chs.add(s.charAt(i));
        }
        
        //for(int i = 0; i<chs.size(); i++){
        //    System.out.println(chs.get(i));
        //}
        
        boolean check = false;
        while(true){
            check = false;
            for(int i = 1; i<s.length();){
                if(chs.get(i)==chs.get(i-1)){
                    System.out.println(chs.get(i));
                    System.out.println(chs.get(i-1));
                    
                    chs.remove(i);
                    chs.remove(i-1);
                    check = true;
                    if(chs.size()==0){
                        return 1;
                    }
                    break;
                }
                //System.out.println(check);
            }
            if(!check){
                answer = 0;
                break;
            }
        }

        return answer;
    }
}
*/