package programmers.level2;
//�����Ա�
public class EatLandGame {

	public static void main(String[] args) {
		int land[][] = {{1, 2, 3, 5}, {5, 6, 7, 100}, {4, 3, 2, 1}};
		int result = solution(land);
		System.out.println("��� : " + result);
		
		int land2[][] = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};
		result = solution(land2);
		System.out.println("��� : " + result);
	}
	//�ߺ�ó��!!
    //������ �� ���� ū���� ã�´ٰ� �ؼ� Ǯ �� �ִ� ������ �ƴ�
    //�� ���� ū��(���� ���� �ε��� ����) vs ���� ū ���� ������ �ִ� ��?
    
    public static int solution(int[][] land) {
        int answer = 0;
        
        int test1 = 0;
        int test2 = 0;
        //������ ū�� ���ϱ�
        int maxIdx[] = new int[land.length+1];
        for(int i = 0; i<land.length; i++){
            int max = 0;
            for(int j = 0; j<land[0].length; j++){
                if(j!=maxIdx[i]){
                    if(max<land[i][j]){
                        max = land[i][j];
                        maxIdx[i+1] = j;
                    }
                }
            }            
            test1+=max;
        }
        System.out.println(test1);
        
        
        //���� ū ���� ������ �ִ�
        int maxIdx2[] = new int[land.length+1];
        for(int i = 0; i<land.length; i++){
            int max = 0;
            for(int j = 0; j<land[0].length; j++){
                if(max<land[i][j]){
                    max = land[i][j];
                    maxIdx2[i+1] = j;
                }
            }
        }
        
        //�ߺ� �� 
        for(int i = 1; i<maxIdx2.length; i++){
            if(maxIdx2[i]==maxIdx2[i-1]){
                if(land[i][maxIdx2[i]]>land[i][maxIdx2[i-1]]){
                    int max = 0;
                    for(int j = 0; j<land[0].length; i++){
                        if(j!=maxIdx2[i]){
                            if(land[i-1][j] > max){
                                max = land[i-1][j];
                            }    
                        }
                    }
                    land[i][maxIdx2[i-1]] = max;
                }else{
                    int max = 0;
                    for(int j = 0; j<land[0].length; j++){
                        if(j!=maxIdx2[i-1]){
                            if(land[i][j] > max){
                                max = land[i][j];
                            }    
                        }
                    }
                    land[i][maxIdx2[i]] = max;
                }
            }
        }
        
        System.out.print("test2�ǰ�� : ");
        for(int i = 1; i<maxIdx2.length; i++){
        	System.out.print(land[i-1][maxIdx2[i]] + " ");
        	
            test2+=land[i-1][maxIdx2[i]];
        }
        
        System.out.println(test2);
        return answer;
    }
}
