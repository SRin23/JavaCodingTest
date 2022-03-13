package baekjoon.bronze.bronze3;
//집 주소
import java.util.Scanner;

public class HomeAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String address = "-1";

        while(true){
            int result = 0;
            address = sc.next();

            //0입력시, 함수 종료
            if(Integer.parseInt(address)==0) break;

            //기본 각 숫자 사이 간격 1cm
            result+=address.length()-1;

            //1은 2cm, 0은 4cm, 나머지는 3cm
            for(int i = 0; i<address.length(); i++){
                if((address.charAt(i) - '0')==0){
                    result+=4;
                }else if((address.charAt(i) - '0')==1){
                    result+=2;
                }else{
                    result+=3;
                }
            }

            //호수판의 경계와 숫자 사이 여백
            result+=2;

            System.out.println(result);
        }
    }
}
