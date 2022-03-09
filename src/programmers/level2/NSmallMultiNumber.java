package programmers.level2;
//N개의 최소 공배수
class NSmallMultiNumber {
    public int solution(int[] arr) {
        int answer = 1;
        int temp[] = new int[100];
        
        //배열내 모든 값을 다 더함
        for(int i = 0; i<arr.length; i++){
            answer*=arr[i];
        }
        
        //각 배열 요소별 약수를 temp방의 인덱스로 하여 temp의 약수번째 인덱스 +1
        for(int i = 0; i<arr.length; i++){
            for(int j = 1; j<=arr[i]; j++){
                //약수구하기
                if(arr[i]%j==0){
                    temp[j]++;
                }
            }
        }
        
        //answer를 나눌 comm 선언
        int comm = 1;
        
        
        /*for(int i = 0; i<temp.length; i++){
            System.out.println(i + " : " + temp[i]);
        }
        */
        
        
        //temp전체를 순차 검색하며 temp가 1보다 큰 수를 가지면
        for(int i = 0; i<temp.length; i++){
            
            if(temp[i]>1){
                //temp의 수만큼 반복문을 돌려
                for(int j = 1; j<temp[i]; j++){
                    //System.out.println(i);
                    //comm에 곱함
                    comm *= i;
                }
            }
        }
        answer/=comm;
        return answer;
    }
}