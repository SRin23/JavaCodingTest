package Programmers_Level2;
//������
import java.util.LinkedList;
import java.util.Queue;
import java.util.Collections;

public class Printer {

	public static void main(String[] args) {
		int[] priorities = {2, 1, 3, 2};
		int location = 2;
		int result = solution(priorities, location);
		System.out.println("��� : " + result);
	
		int[] priorities2 = {1, 1, 9, 1, 1, 1};
		location = 0;
		result = solution(priorities2, location);
		System.out.println("���2 : " + result);
	}
	public static int solution(int[] priorities, int location) {
        int answer = 0;
        
        //�켱������ ������ ������ ������ Queue��ü ����
        //Queue �˰����� Queue��ü�� �̿��Ͽ� �ۼ��� �� ������, LinkedList�� Ȱ���Ѵ�.
        Queue<Integer> priorityDocument = new LinkedList<>();
        
        //�ڽ��� ��û�� ������ ��ġ�� �˷��ִ� Queue��ü ����
        Queue<Boolean> order = new LinkedList<>();
        
        //�� Queue�� �� �Ҵ�
        //priorityDocument���� priorities�迭 ���� ���� ����
        //order���� �ڽ��� ���ϰ����ϴ� ��ġ�� ���� true�� ����, �� ���� ������ false�� ����
        for(int i = 0; i<priorities.length; i++){
        	priorityDocument.add(priorities[i]);
            if(location==i){
                order.add(true);
            }else{
                order.add(false);
            }
        }

        //��û�� ������ ���°�� �μ�Ǵ��� ���� answer���� ���
        answer = 1;
        while(true){
        	//Collections.max()�� �̿��Ͽ� priorityDocument���� ���� ū ���� ã��
            int max = Collections.max(priorityDocument);
            
            //priorityDocument�� ���� ù��° ���� max�� �ٸ��ٸ�
            if(priorityDocument.peek()!=max){
            	//priorityDocument�� order�� ���� ù��° ���� �� �ڷ� ����
            	priorityDocument.add(priorityDocument.remove());
                order.add(order.remove());
            }else{
            	//���� ù��° ���� max�� ���� ���ٸ�
            	//order�� ù��° ���� true���� Ȯ��
                if(order.peek()==true){
                	//true�̸� break�� �Ͽ� �޼��带 ��������
                    break;
                }else{
                	//false��� �ڽ��� ��û�� location�� �۾��� �ƴϹǷ� 
                	//�켱������ ó���ؾ��� ������ �μ��ߴٴ� �ǹ��ؼ� ���� priorityDocument�� order�� ���� ���� �� 
                	priorityDocument.remove();
                    order.remove();
                    //�μ��۾��� �Ͽ����Ƿ� answer 1 ����
                    answer++;
                }
            }
            
        }
        return answer;
    }
}
