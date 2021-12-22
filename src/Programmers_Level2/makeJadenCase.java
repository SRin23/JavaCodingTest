package Programmers_Level2;
//JadenCase 문자열 만들기
public class makeJadenCase {

	public static void main(String[] args) {
		String result = solution("3people unFollowed me");
		System.out.println("결과 : " + result);
		
		result = solution("for the last week");
		System.out.println("결과 : " + result);
	}
	
	public static String solution(String s) {
        String answer;
        
        //문자열 s를 char배열로 받을 temp배열 s.length만큼 선언 
        char temp[] = new char[s.length()];
        
        for(int i = 0; i<s.length(); i++){
            //s의 각 문자를 temp배열에 저장
            //대문자라면 소문자로 바꿔서 temp 배열에 저장
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                temp[i] = (char)(s.charAt(i)+32);
            }else{
                temp[i] = s.charAt(i);
            }
            
            //temp배열 속 문자 확인
            //System.out.println(temp[i]);
        }
        
        //띄워쓰기를 체크하는 변수 선언
        int index = 0;
        for(int i = 0; i<temp.length; i++){
            //띄워쓰기시, index는 -1
            if(temp[i]==' '){
                index = -1;
            }
            //띄워쓰기된 바로 뒤 글자는 단어의 첫문자
            if(index==0){
                //단어의 첫 문자가 조건에 맞게 잘 들어왔는지 확인
                //System.out.println(temp.charAt(i));
                
                //temp배열에 담을 때 모두 소문자로 변환했으므로 소문자만 조건체크
                //단어의 첫번째 문자가 영문일때
                if(temp[i]>='a'&&temp[i]<='z'){
                    //소문자를 대문자로 변환(소문자아스키코드 - 32 = 대문자아스키코드)
                    temp[i]-=32;
                    //잘 변환되었는지 확인
                    //System.out.println(temp[i]);
                }
            }
            //한 글자마다 index + 1
            index++;
        }
        //answer의 생성자를 이용하여 temp를 String으로 변환
        answer = new String(temp);
        return answer;
    }

}
/*
String answer = s;
answer.toLowerCase();
int index = 0;
for(int i = 0; i<answer.length(); i++){
    if(answer.charAt(i)==' '){
        index = -1;
    }
    if(index==0){
        //stem.out.println(answer.charAt(i));
        if(answer.charAt(i)>='a'&&answer.charAt(i)<='z'){
            System.out.println(answer.charAt(i));
            answer.charAt(i) = answer.charAt(i)-35;
        }
    }
    index++;
}
*/