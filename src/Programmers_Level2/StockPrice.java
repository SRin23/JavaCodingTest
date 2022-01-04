package Programmers_Level2;

public class StockPrice {

	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 2, 3};
		int[] result = solution(prices);
		for(int i = 0; i<prices.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	public static int[] solution(int[] prices) {
		//prices�� ���̸�ŭ �迭 ����
        int[] answer = new int[prices.length];
        //�ڽź��� ���� ���� ������ false, ������ true(������ ������ ������ �������� ���������� ����)
        boolean flag = false;
        
        //�� �������� ���� ���Ŀ� ������ ������������ Ȯ���ؾ��ϹǷ� prices�� ���̸�ŭ �ݺ��� �ݺ�
        for(int i = 0; i<prices.length-1; i++){
        	//�� �ʸ��� flag�� Ȯ���� ���̹Ƿ� flag �ʱ�ȭ
            flag = false;
            
            //���� �ε��� +1�� ���� prices�� ��ü ���̱��� �ݺ�
            for(int j = i+1; j<prices.length; j++){
                //���� �ε����� ������ ���� ���� ���� ù��° ����(�ε���)�� ã��(������ �������� ����)
            	if(prices[i]>prices[j]){
            		//answer[i]�� j-i(������ �������� ���� - ���� ���� = ������ �������� �Ⱓ)
                    answer[i] += (j-i);
                    //�߰��� ������ ���������Ƿ� flag�� true�� �ٲ�
                    flag = true;
                    //ȿ���� ���븦 ���� break�� �ۼ�(�������� ù ������ ã���� �Ǳ� ����)
                    break;
                }
            }
            //���� flag�� false���(�ڽ��� �������� ������ ������ �������� �ʴ´ٸ�)
            if(!flag){
            	//answer[i]�� (��ü ����) - (i+1)�� ����
            	//�迭�� �ε����� 0���� �����ϹǷ� i+1�� �Ͽ� ���ش�.
                answer[i] = (prices.length - (i+1));        
            }
        }
        
        //���� return
        return answer;
    }
}
