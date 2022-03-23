package baekjoon.bronze.bronze2;
//!밀비 급일
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TopSecret {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String str = br.readLine();
            if(str.equals("END")) break;
            StringBuffer sb = new StringBuffer(str);

            System.out.println(sb.reverse().toString());
        }
    }
}