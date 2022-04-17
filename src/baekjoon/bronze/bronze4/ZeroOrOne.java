package baekjoon.bronze.bronze4;
//Zero Or One
import java.util.ArrayList;
import java.util.Scanner;

public class ZeroOrOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> play = new ArrayList<>();
        int[] checkFlag = new int[2];
        for(int i = 0; i<3; i++){
            play.add(sc.nextInt());
            if(play.get(i)==0) checkFlag[0]++;
            else checkFlag[1]++;
        }


        if(checkFlag[0]!=3&&checkFlag[1]!=3){
            int winner = -1;
            if(checkFlag[0] < checkFlag[1]){
                winner = play.indexOf(0);
            }else if(checkFlag[0] > checkFlag[1]){
                winner = play.indexOf(1);
            }

            switch (winner){
                case 0 :
                    System.out.println("A"); break;
                case 1 :
                    System.out.println("B"); break;
                case 2 :
                    System.out.println("C"); break;

            }
            System.out.println();
        }else{
            System.out.println("*");
        }
    }
}
