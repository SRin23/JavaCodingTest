package programmers.level2;
//땅따먹기
public class EatLandGame {

	public static void main(String[] args) {
		int land[][] = {{1, 2, 3, 5}, {5, 6, 7, 100}, {4, 3, 2, 1}};
		int result = solution(land);
		System.out.println("결과 : " + result);
		
		int land2[][] = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};
		result = solution(land2);
		System.out.println("결과 : " + result);
	}
	//중복처리!!
    //무조건 각 행의 큰값만 찾는다고 해서 풀 수 있는 문제는 아님
    //각 행의 큰수(위와 같은 인덱스 제외) vs 가장 큰 수를 포함한 최댓값 비교?
    
    public static int solution(int[][] land) {
        int answer = 0;
        
        int test1 = 0;
        int test2 = 0;
        //각행의 큰수 더하기
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
        
        
        //가장 큰 수를 포함한 최댓값
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
        
        //중복 행 
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
        
        System.out.print("test2의결과 : ");
        for(int i = 1; i<maxIdx2.length; i++){
        	System.out.print(land[i-1][maxIdx2[i]] + " ");
        	
            test2+=land[i-1][maxIdx2[i]];
        }
        
        System.out.println(test2);
        return answer;
    }
}
