package baekjoon.bronze.bronze4;

import java.util.Scanner;

public class TournamentSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int win = 0;
        for(int i = 0; i<6; i++){
            if(sc.next().equals("W")) win++;
        }
        switch(win){
            case 1 :
            case 2 :
                System.out.println(3); break;
            case 3 :
            case 4 :
                System.out.println(2); break;
            case 5 :
            case 6 :
                System.out.println(1); break;
            default :
                System.out.println(-1); break;
        }

    }
}
