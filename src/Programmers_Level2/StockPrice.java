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
		//prices의 길이만큼 배열 생성
        int[] answer = new int[prices.length];
        //자신보다 작은 값이 없으면 false, 있으면 true(없으면 끝까지 가격이 떨어지지 않은것으로 간주)
        boolean flag = false;
        
        //각 시점마다 몇초 이후에 가격이 떨어지는지를 확인해야하므로 prices의 길이만큼 반복문 반복
        for(int i = 0; i<prices.length-1; i++){
        	//각 초마다 flag를 확인할 것이므로 flag 초기화
            flag = false;
            
            //현재 인덱스 +1번 부터 prices의 전체 길이까지 반복
            for(int j = i+1; j<prices.length; j++){
                //현재 인덱스의 값보다 작은 값이 오는 첫번째 시점(인덱스)을 찾음(가격이 떨어지는 시점)
            	if(prices[i]>prices[j]){
            		//answer[i]에 j-i(가격이 떨어지는 시점 - 현재 시점 = 가격이 떨어지는 기간)
                    answer[i] += (j-i);
                    //중간에 가격이 떨어졌으므로 flag를 true로 바꿈
                    flag = true;
                    //효율성 증대를 위한 break문 작성(떨어지는 첫 시점만 찾으면 되기 때문)
                    break;
                }
            }
            //만약 flag가 false라면(자신의 시점에서 끝까지 가격이 떨어지지 않는다면)
            if(!flag){
            	//answer[i]에 (전체 길이) - (i+1)을 저장
            	//배열의 인덱스는 0부터 시작하므로 i+1을 하여 빼준다.
                answer[i] = (prices.length - (i+1));        
            }
        }
        
        //값을 return
        return answer;
    }
}
