package programmers.level2;
//����Ʈ
import java.util.Arrays;
import java.util.Collections;

public class Lifeboat {

	public static void main(String[] args) {
		int people[] = {70, 50, 80, 50};
		int limit = 100;
		int result = solution(people, limit);
		System.out.println("��� : " + result);
	}
	public static int solution(int[] people, int limit) {
        int answer = 0;
        //�迭 �����ϱ�(�迭 �ε����� �̿��Ͽ� ���� ���ϴ� ������ �ƴϱ⿡)
        //�迭�� �����Ͽ��� �ƹ��� ������ ������ �ʴ´�.
        //Arrays.sort(�迭) ����, �⺻������ ������������ ����
        Arrays.sort(people);
        
        
        //���ĵ� �� ��� Ȯ��
        //for(int i = 0; i<people.length; i++){
        //    System.out.println(people[i]);
        //}
        
        //people�迭�� ������ �ݺ�
        for(int i = 0; i<people.length; i++){
            //people�� [i]���� limit���� ������ �Ʒ� ���� ����
            if(people[i]<=limit){
                //������ �߱� ������ ū�� - �������� ¦������ ��Ʈ�� Ż �� ����
                for(int j = people.length-1; j>=i+1; j--){
                    if(people[i] + people[j]<=limit){
                        //System.out.println(people[i] + " " + people[j]);
                        people[j] = limit+1;
                        break;  //ȿ������ ���̱� ���� ã�� �� break�� ����
                    }
                }
                //System.out.println(people[i]);
                answer++;
            }
            //System.out.println("�ݺ�");
        }
        
        return answer;
    }
}
