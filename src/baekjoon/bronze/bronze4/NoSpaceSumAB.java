package baekjoon.bronze.bronze4;
//공백 없는 A+B
import java.util.Scanner;

public class NoSpaceSumAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str =sc.next().split("");
        int result = 0;
        if(str.length>2){
            if(str.length==4) result = 20;
            else if(Integer.valueOf(str[1])==0) result = 10+Integer.valueOf(str[2]);
            else result = 10+Integer.valueOf(str[0]);
        }else{
            result = Integer.valueOf(str[0]) + Integer.valueOf(str[1]);
        }
        System.out.println(result);
    }
}
