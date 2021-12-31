package Programmers_Level2;
//방문 길이
public class VisitLength {

	public static void main(String[] args) {
		String dirs = "ULURRDLLU";
		int result = solution(dirs);
		System.out.println("결과 : " + result);
		
		dirs = "LULLLLLLU";
		result = solution(dirs);
		System.out.println("결과 : " + result);
	}
	public static int solution(String dirs) {
        int answer = dirs.length();
        
        int currentx = 0;
        int currenty = 0;
        int nextx = 0;
        int nexty = 0;
        
        String xy[][] = new String[dirs.length()][2];
        
        for(int i = 0; i<dirs.length(); i++){
        	//값이 U이면 y++
            if(dirs.charAt(i)=='U'){
                ++nexty;
                //System.out.println("Up");
                //System.out.println("(" + currentx + ", " + currenty + ")(" + nextx + ", " + nexty + ")");
                if(nexty>5){
                    nexty = 5;
                }
            }
            //값이 D이면 y--
            else if(dirs.charAt(i)=='D'){
                --nexty;
                //System.out.println("Down");
                //System.out.println("(" + currentx + ", " + currenty + ")(" + nextx + ", " + nexty + ")");
                if(nexty<-5){
                    nexty = -5;
                }
            }
            //값이 R이면 x++
            else if(dirs.charAt(i)=='R'){
                ++nextx;
                //System.out.println("Right");
                //System.out.println("(" + currentx + ", " + currenty + ")(" + nextx + ", " + nexty + ")");
                if(nextx>5){
                    nextx = 5;
                }
            }
            //값이 L이면 x--
            else{
                --nextx;
                //System.out.println("Left");
                //System.out.println("(" + currentx + ", " + currenty + ")(" + nextx + ", " + nexty + ")");
                if(nextx<-5){
                    nextx = -5;
                }
            } 
            //current(시작좌표)는 배열의 0번방에 문자열로 저장
            xy[i][0] = Integer.toString(currentx) + Integer.toString(currenty);
            //next(다음좌표)는 배열의 1번방에 문자열로 저장
            xy[i][1] = Integer.toString(nextx) + Integer.toString(nexty);
            
            //시작좌표를 다음좌표로 설정
            currentx = nextx;
            currenty = nexty;
        }
        
        for(int i = 0; i<xy.length; i++){
            if(xy[i][0].equals(xy[i][1])){
                answer--;
                continue;
            }
            for(int j = i+1; j<xy.length; j++){
                //만약 시작과 끝좌표가 같은, 겹치는 부분이 있다면 anwer--
                if(xy[i][0].equals(xy[j][0])){
                    if(xy[i][1].equals(xy[j][1])){
                        answer--;
                        break;
                    }
                }
                //만약 시작과 끝좌표가 뒤집어진 겹치는 부분이 있다면 answer--
                else if(xy[i][0].equals(xy[j][1])){
                    if(xy[i][1].equals(xy[j][0])){
                        answer--;
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}
