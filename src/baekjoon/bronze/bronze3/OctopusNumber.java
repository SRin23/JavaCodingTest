package baekjoon.bronze.bronze3;
//문어 숫자
import java.util.Scanner;

public class OctopusNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String octopus = sc.nextLine();
            if(octopus.equals("#")) break;
            int result = 0;
            for(int i = 0; i<octopus.length(); i++){
                char temp = octopus.charAt(i);
                int value = 0;
                switch (temp){
                    case '-' : value = 0; break;
                    case '\\' : value = 1; break;
                    case '(' : value = 2; break;
                    case '@' : value = 3; break;
                    case '?' : value = 4; break;
                    case '>' : value = 5; break;
                    case '&' : value = 6; break;
                    case '%' : value = 7; break;
                    case '/' : value = -1; break;
                }
                result+=(value*Math.pow(8, octopus.length()-1-i));
            }
            System.out.println(result);
        }
    }
}
