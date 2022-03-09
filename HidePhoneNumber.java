//핸드폰 번호 가리기
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        //answer = phone_number;
        for(int i = 0; i<phone_number.length()-4; i++){
            answer += "*";
        }
        for(int i=phone_number.length() - 4; i<phone_number.length(); i++) {
            answer += Character.toString(phone_number.charAt(i));
        }
        return answer;
    }
}