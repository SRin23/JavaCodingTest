package Programmers_Level2;
import java.util.Arrays;
public class PhoneNumberBook {

	public static void main(String[] args) {
		String phone_book[] = {"119", "123456789", "11929343", "58311932"};
		boolean result = solution(phone_book);
		System.out.println("결과 : " + result);
	}
	
	public static boolean solution(String[] phone_book) {
        boolean answer = true;
        
        //배열을 오름차순으로 정렬
        Arrays.sort(phone_book);
        
        //정렬 확인을 위한 출력
        // for(int i = 0; i<phone_book.length; i++){
        //     System.out.println(phone_book[i]);
        // }
        
        //이전값과 현재값을 비교하므로 1부터 반복문 시작
        //배열을 정렬하였으믈 굳이 모든 값들과 비교할 필요 없음
        for(int i = 1; i<phone_book.length; i++){
            //문자열이 중간에 포함되어있을 수 있으므로 contains를 사용할 수 없다. -> 접두어만 확인해야하므로
        	//접두어에 이전 값이 포함되어 있는지 확인하기 위해 startsWith()메서드를 사용
            if(phone_book[i].startsWith(phone_book[i-1])){
            	//포함되어 있을 경우 answer을 false로 바꿈
                answer = false;
                //효율성 향상을 위해 break문 사용
                break;
            }
        }
        
        return answer;
    }
}
