package programmers.level2;
//124������ ����
public class Country124Number {
	//��� ������ ���� Ŭ��������
	static int cnt = 1;
	public static void main(String[] args) {
		//10���� 1~15�� 124������ ���ڷ� ��ȯ 
		for(int i = 1; i<=15; i++) {
			print(i);
		}
	}
	
	//����ϱ� ���� �Լ�
	public static void print(int n) {
		String result = solution(n);
		System.out.println("��� " + cnt++ + " : " + result );
	}
	
	public static String solution(int n) {
        String answer = "";
        
        //n�� 3���� ���� ���� ������ ����
        int value = n;
        
        while(true){
        	//n�� 3���� ���� �������� ������ ����
            int remainder = value%3;
            
            //value�� 3���� ������ value�� ����
            value/=3;
            
            //����, �������� 0���� ũ�ٸ�
            if(remainder>0){
            	//�� ������ ���� answer ���ڿ� �տ� �ٿ� answer�� ����
                answer = Integer.toString(remainder) + answer;
            }
            //����, �������� 0�̶��(3�� �������� 0, 1, 2���̴�)
            else{
            	//answer ���ڿ� �տ� 4�� �ٿ� answer�� ���� ��
                answer = Integer.toString(4) + answer;
                //value�� ���� 1 ���ҽ�Ų��.
                value--;
            }
            
            //�� �ڵ带 value�� 0�� �ɶ����� �ݺ��Ѵ�.
            if(value==0){
                break;
            }
            
        }
        
        return answer;
	}

}
