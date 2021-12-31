package Programmers_Level2;
//�湮 ����
public class VisitLength {

	public static void main(String[] args) {
		String dirs = "ULURRDLLU";
		int result = solution(dirs);
		System.out.println("��� : " + result);
		
		dirs = "LULLLLLLU";
		result = solution(dirs);
		System.out.println("��� : " + result);
	}
	public static int solution(String dirs) {
        int answer = dirs.length();
        
        int currentx = 0;
        int currenty = 0;
        int nextx = 0;
        int nexty = 0;
        
        String xy[][] = new String[dirs.length()][2];
        
        for(int i = 0; i<dirs.length(); i++){
        	//���� U�̸� y++
            if(dirs.charAt(i)=='U'){
                ++nexty;
                //System.out.println("Up");
                //System.out.println("(" + currentx + ", " + currenty + ")(" + nextx + ", " + nexty + ")");
                if(nexty>5){
                    nexty = 5;
                }
            }
            //���� D�̸� y--
            else if(dirs.charAt(i)=='D'){
                --nexty;
                //System.out.println("Down");
                //System.out.println("(" + currentx + ", " + currenty + ")(" + nextx + ", " + nexty + ")");
                if(nexty<-5){
                    nexty = -5;
                }
            }
            //���� R�̸� x++
            else if(dirs.charAt(i)=='R'){
                ++nextx;
                //System.out.println("Right");
                //System.out.println("(" + currentx + ", " + currenty + ")(" + nextx + ", " + nexty + ")");
                if(nextx>5){
                    nextx = 5;
                }
            }
            //���� L�̸� x--
            else{
                --nextx;
                //System.out.println("Left");
                //System.out.println("(" + currentx + ", " + currenty + ")(" + nextx + ", " + nexty + ")");
                if(nextx<-5){
                    nextx = -5;
                }
            } 
            //current(������ǥ)�� �迭�� 0���濡 ���ڿ��� ����
            xy[i][0] = Integer.toString(currentx) + Integer.toString(currenty);
            //next(������ǥ)�� �迭�� 1���濡 ���ڿ��� ����
            xy[i][1] = Integer.toString(nextx) + Integer.toString(nexty);
            
            //������ǥ�� ������ǥ�� ����
            currentx = nextx;
            currenty = nexty;
        }
        
        for(int i = 0; i<xy.length; i++){
            if(xy[i][0].equals(xy[i][1])){
                answer--;
                continue;
            }
            for(int j = i+1; j<xy.length; j++){
                //���� ���۰� ����ǥ�� ����, ��ġ�� �κ��� �ִٸ� anwer--
                if(xy[i][0].equals(xy[j][0])){
                    if(xy[i][1].equals(xy[j][1])){
                        answer--;
                        break;
                    }
                }
                //���� ���۰� ����ǥ�� �������� ��ġ�� �κ��� �ִٸ� answer--
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
