package programmers.level2;
//카펫
public class Carpet {

	public static void main(String[] args) {
		int brown = 10;
		int yellow = 2;
		int[] rs = solution(brown, yellow);
		System.out.print("결과 : ");
		for(int i = 0; i<rs.length; i++) {
			System.out.print(rs[i] + " ");
		}
	}
	public static int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
        int carpetSize = brown + yellow;
        
        //height는 카펫의 세로크기로 가로보다 커서는 안된다
        //세로크기의 최솟값은 3이므로 3부터 시작한다(중앙에는 노란색, 테두리 1줄)
        //이미지 참조
        for(int height = 3; height<carpetSize; height++){
        	//carpetSize의 약수를 확인한다.
            if(carpetSize%height==0){
            	
                //카펫의 전체 크기와 세로길이를 이용하여 가로를 찾는다.
                int width = carpetSize/height;
                
                //width가 height보다 클때
                //아래 if문을 사용하지 않아도 통과한다
                //for문은 3부터 시작하여 점점 커지므로 width값보다 작은 height의 값이 먼저들어와
                //계산되어 break문을 실행시키기 때문이다.
                if(width>=height){
                	//(height-2)*(width-2)가 yellow와 같다면 아래문장 실행
                    //노란색의 크기는 상하좌우의 갈색 카펫 하나씩을 뺀 크기와 같다
                	if((height-2)*(width-2)==yellow){
                    	//answer[0]에는 가로의 크기를, 
                        //answer[1]에는 세로의 크기를 저장 후 break
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
