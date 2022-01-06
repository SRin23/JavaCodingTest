package Programmers_Level2;
//�� �ʰ�

import java.util.PriorityQueue;
//import java.util.Iterator;

//import java.util.ArrayList;
//import java.util.Collections;

public class MoreSpicy {

	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		int result = solution(scoville, K);
		System.out.println("��� : " + result);
	}
	public static int solution(int[] scoville, int K) {
        int answer = 0;
        
        //PriorityQueue ���� ����
        PriorityQueue<Integer> scovilleQueue = new PriorityQueue<>();
        //PriorityQueue�� scoville�� �� ����
        for(int i = 0; i<scoville.length; i++){
            scovilleQueue.add(scoville[i]);
        }
        
        /*
        //PriorityQueue�� ��� ��ҿ� �����Ͽ� ����ϴ� ���(iterator���)
        Iterator iter = scovilleQueue.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        */
        while(scovilleQueue.peek()<K){
            //PriorityQueue ���� �ϳ��ۿ� ���ٸ� ���̻� ���� K�̻�����
            //��ȯ��ų �� �����Ƿ� answer�� -1���� �� break
            if(scovilleQueue.size()==1){
                answer = -1;
                break;
            }

            //�� �ſ� ���� ����� ����
            //poll�޼��带 �̿��Ͽ� ù��° �� ��ȯ �� ����
            scovilleQueue.add(scovilleQueue.poll() + (scovilleQueue.poll()*2));
            answer++;
        }
        
        return answer;
    }
	/*
	 //ArrayList���� �ð��� ���� �ɸ�
	 public static int solution(int[] scoville, int K) {
        int answer = 0;
        
        //scoville�迭�� ArrayList�� ����
        ArrayList<Integer> scovilleList = new ArrayList<>();
        //ArrayList�� scoville�迭�� �� ����
        for(int i = 0; i<scoville.length; i++){
            scovilleList.add(scoville[i]);
        }
        
        //scovilleList ����Ʈ ���� ù��°��(���ĵ� ù��°��)�� K���� ������ ����
        while(scovilleList.get(0)<K){
            //ArrayList�� ���� �ϳ��ۿ� ���ٸ� ���̻� ���� K�̻�����
            //��ȯ��ų �� �����Ƿ� answer�� -1���� �� break
            if(scovilleList.size()==1){
                answer = -1;
                break;
            }
            //ArrayList�� ����
            Collections.sort(scovilleList);
            
            //�� �ſ� ���� ����� ����
            scovilleList.add(scovilleList.get(0) + (scovilleList.get(1)*2));
            //�ſ�� ���� ��� ����
            scovilleList.remove(1);
            scovilleList.remove(0);
            answer++;
        }
        return answer;
    }
	*/
}
