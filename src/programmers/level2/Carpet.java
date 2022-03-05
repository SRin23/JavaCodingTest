package programmers.level2;
//ī��
public class Carpet {

	public static void main(String[] args) {
		int brown = 10;
		int yellow = 2;
		int[] rs = solution(brown, yellow);
		System.out.print("��� : ");
		for(int i = 0; i<rs.length; i++) {
			System.out.print(rs[i] + " ");
		}
	}
	public static int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
        int carpetSize = brown + yellow;
        
        //height�� ī���� ����ũ��� ���κ��� Ŀ���� �ȵȴ�
        //����ũ���� �ּڰ��� 3�̹Ƿ� 3���� �����Ѵ�(�߾ӿ��� �����, �׵θ� 1��)
        //�̹��� ����
        for(int height = 3; height<carpetSize; height++){
        	//carpetSize�� ����� Ȯ���Ѵ�.
            if(carpetSize%height==0){
            	
                //ī���� ��ü ũ��� ���α��̸� �̿��Ͽ� ���θ� ã�´�.
                int width = carpetSize/height;
                
                //width�� height���� Ŭ��
                //�Ʒ� if���� ������� �ʾƵ� ����Ѵ�
                //for���� 3���� �����Ͽ� ���� Ŀ���Ƿ� width������ ���� height�� ���� ��������
                //���Ǿ� break���� �����Ű�� �����̴�.
                if(width>=height){
                	//(height-2)*(width-2)�� yellow�� ���ٸ� �Ʒ����� ����
                    //������� ũ��� �����¿��� ���� ī�� �ϳ����� �� ũ��� ����
                	if((height-2)*(width-2)==yellow){
                    	//answer[0]���� ������ ũ�⸦, 
                        //answer[1]���� ������ ũ�⸦ ���� �� break
                        answer[0] = width;
                        answer[1] = height;
                        break;
                    }   
                }
            }
        }
        return answer;
    }
}
