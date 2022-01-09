package Programmers_Level2;
//프린터
import java.util.LinkedList;
import java.util.Queue;
import java.util.Collections;

public class Printer {

	public static void main(String[] args) {
		int[] priorities = {2, 1, 3, 2};
		int location = 2;
		int result = solution(priorities, location);
		System.out.println("결과 : " + result);
	
		int[] priorities2 = {1, 1, 9, 1, 1, 1};
		location = 0;
		result = solution(priorities2, location);
		System.out.println("결과2 : " + result);
	}
	public static int solution(int[] priorities, int location) {
        int answer = 0;
        
        //우선적으로 저리할 문서를 구현할 Queue객체 생성
        //Queue 알고리즘은 Queue객체를 이용하여 작성할 수 있으며, LinkedList를 활용한다.
        Queue<Integer> priorityDocument = new LinkedList<>();
        
        //자신이 요청한 문서의 위치를 알려주는 Queue객체 생성
        Queue<Boolean> order = new LinkedList<>();
        
        //각 Queue에 값 할당
        //priorityDocument에는 priorities배열 안의 값을 저장
        //order에는 자신이 구하고자하는 위치의 값을 true로 저장, 그 외의 문서는 false로 저장
        for(int i = 0; i<priorities.length; i++){
        	priorityDocument.add(priorities[i]);
            if(location==i){
                order.add(true);
            }else{
                order.add(false);
            }
        }

        //요청한 문서가 몇번째로 인쇄되는지 구할 answer변수 사용
        answer = 1;
        while(true){
        	//Collections.max()를 이용하여 priorityDocument에서 가장 큰 값을 찾음
            int max = Collections.max(priorityDocument);
            
            //priorityDocument의 가장 첫번째 값이 max와 다르다면
            if(priorityDocument.peek()!=max){
            	//priorityDocument와 order의 가장 첫번째 값을 맨 뒤로 보냄
            	priorityDocument.add(priorityDocument.remove());
                order.add(order.remove());
            }else{
            	//가장 첫번째 값과 max의 값이 같다면
            	//order의 첫번째 값이 true인지 확인
                if(order.peek()==true){
                	//true이면 break를 하여 메서드를 빠져나옴
                    break;
                }else{
                	//false라면 자신이 요청한 location의 작업이 아니므로 
                	//우선적으로 처리해야할 문서를 인쇄했다는 의미해서 현재 priorityDocument와 order의 값을 삭제 후 
                	priorityDocument.remove();
                    order.remove();
                    //인쇄작업을 하였으므로 answer 1 증가
                    answer++;
                }
            }
            
        }
        return answer;
    }
}
