package programmers.level2;
//������ ǥ��
public class ContinuousNumbers {

	public static void main(String[] args) {
		int n = 15;
		int result = solution(n);
		System.out.println("15�� ��Ÿ���� �������� ������ ���� ������ " + result + "�� �Դϴ�.");
	}
	public static int solution(int n) {
        int answer = 0;
        //1~n���� �ݺ��� ����
        for(int i = 1; i<=n; i++){
            //�������� ���� ���� ����
            int sum = 0;
            //���ӵ� ������ �������� ���� �ݺ���
            for(int j = i; j<=n; j++){
                //������ ���ϱ�
                sum+=j;
                //����, ������ ���� n�� ������ answer +1
                //���� sum�� �����Ǵ� ������ n���� ũ�⶧���� üũ�� �ʿ䰡 �����Ƿ� 
                //break���� ����Ͽ� �ݺ� �������ν� ȿ���� ���
                if(sum==n){
                    answer++;
                    break;
                }
                //�������� �������� ��������� �ʴ� ���鿡 ���ؼ���
                //������ ���� n���� ũ�� break�� ����Ͽ� ȿ���� ���
                else if(sum > n){
                    break;
                }
            }
        }
        return answer;
    }
}
