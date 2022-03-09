package programmers.level1;

//서울에서 김서방 찾기
class findKimSubang {
    public String solution(String[] seoul) {
        String answer = "";
        int position = 0;
        for(int i = 0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                position = i;
                break;
            }
        }
        answer = "김서방은 " + position + "에 있다";
        return answer;
    }
}