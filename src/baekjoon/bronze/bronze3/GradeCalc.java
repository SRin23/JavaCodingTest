package baekjoon.bronze.bronze3;
//학점계산
import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cScore = sc.next();

        double score = 0;

        switch(cScore.charAt(0)){
            case 'A' : score = 4; break;
            case 'B' : score = 3; break;
            case 'C' : score = 2; break;
            case 'D' : score = 1; break;
            default: score = 0; break;
        }
        if(cScore.length()==2){
            switch(cScore.charAt(1)){
                case '+' : score+=0.3; break;
                case '-' : score-=0.3; break;
            }
        }


        System.out.println(score);
    }
}
