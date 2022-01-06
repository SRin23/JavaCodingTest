package Programmers_Level2;
//더 맵게

import java.util.PriorityQueue;
//import java.util.Iterator;

//import java.util.ArrayList;
//import java.util.Collections;

public class MoreSpicy {

	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		int result = solution(scoville, K);
		System.out.println("결과 : " + result);
	}
	public static int solution(int[] scoville, int K) {
        int answer = 0;
        
        //PriorityQueue 변수 생성
        PriorityQueue<Integer> scovilleQueue = new PriorityQueue<>();
        //PriorityQueue에 scoville의 값 저장
        for(int i = 0; i<scoville.length; i++){
            scovilleQueue.add(scoville[i]);
        }
        
        /*
        //PriorityQueue의 모든 요소에 접근하여 출력하는 방법(iterator사용)
        Iterator iter = scovilleQueue.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        */
        while(scovilleQueue.peek()<K){
            //PriorityQueue 값이 하나밖에 없다면 더이상 값을 K이상으로
            //변환시킬 수 없으므로 answer에 -1저장 후 break
            if(scovilleQueue.size()==1){
                answer = -1;
                break;
            }

            //더 매운 것을 만들어 저장
            //poll메서드를 이용하여 첫번째 값 반환 후 제거
            scovilleQueue.add(scovilleQueue.poll() + (scovilleQueue.poll()*2));
            answer++;
        }
        
        return answer;
    }
	/*
	 //ArrayList사용시 시간이 오래 걸림
	 public static int solution(int[] scoville, int K) {
        int answer = 0;
        
        //scoville배열을 ArrayList로 저장
        ArrayList<Integer> scovilleList = new ArrayList<>();
        //ArrayList에 scoville배열의 값 저장
        for(int i = 0; i<scoville.length; i++){
            scovilleList.add(scoville[i]);
        }
        
        //scovilleList 리스트 내의 첫번째값(정렬된 첫번째값)이 K보다 작으면 실행
        while(scovilleList.get(0)<K){
            //ArrayList내 값이 하나밖에 없다면 더이상 값을 K이상으로
            //변환시킬 수 없으므로 answer에 -1저장 후 break
            if(scovilleList.size()==1){
                answer = -1;
                break;
            }
            //ArrayList를 정렬
            Collections.sort(scovilleList);
            
            //더 매운 것을 만들어 저장
            scovilleList.add(scovilleList.get(0) + (scovilleList.get(1)*2));
            //매운걸 만든 재료 삭제
            scovilleList.remove(1);
            scovilleList.remove(0);
            answer++;
        }
        return answer;
    }
	*/
}
