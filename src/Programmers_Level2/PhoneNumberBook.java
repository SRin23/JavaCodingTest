package Programmers_Level2;
import java.util.Arrays;
public class PhoneNumberBook {

	public static void main(String[] args) {
		String phone_book[] = {"119", "123456789", "11929343", "58311932"};
		boolean result = solution(phone_book);
		System.out.println("��� : " + result);
	}
	
	public static boolean solution(String[] phone_book) {
        boolean answer = true;
        
        //�迭�� ������������ ����
        Arrays.sort(phone_book);
        
        //���� Ȯ���� ���� ���
        // for(int i = 0; i<phone_book.length; i++){
        //     System.out.println(phone_book[i]);
        // }
        
        //�������� ���簪�� ���ϹǷ� 1���� �ݺ��� ����
        //�迭�� �����Ͽ����� ���� ��� ����� ���� �ʿ� ����
        for(int i = 1; i<phone_book.length; i++){
            //���ڿ��� �߰��� ���ԵǾ����� �� �����Ƿ� contains�� ����� �� ����. -> ���ξ Ȯ���ؾ��ϹǷ�
        	//���ξ ���� ���� ���ԵǾ� �ִ��� Ȯ���ϱ� ���� startsWith()�޼��带 ���
            if(phone_book[i].startsWith(phone_book[i-1])){
            	//���ԵǾ� ���� ��� answer�� false�� �ٲ�
                answer = false;
                //ȿ���� ����� ���� break�� ���
                break;
            }
        }
        
        return answer;
    }
}
