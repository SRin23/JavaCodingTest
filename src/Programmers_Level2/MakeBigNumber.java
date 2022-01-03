package Programmers_Level2;
import java.util.ArrayList;
public class MakeBigNumber {

	public static void main(String[] args) {
		//
	}
	public static String solution(String number, int k) {
        String answer = "";
        
        ArrayList<Integer> nArr = new ArrayList<Integer>();

        for (int i = 0; i < number.length(); i++)
            nArr.add(Integer.parseInt(number.substring(i, i + 1)));
        
        for(int i = 0; i<nArr.size()-1; i++){
            if(nArr.get(i)<nArr.get(i+1)){
                nArr.remove(i);
            }
        }
        
        for(int i = 0; i<nArr.size(); i++){
            System.out.println(nArr.get(i));
            answer+=Integer.toString(nArr.get(i));
        }
        return answer;
    }
}
