package baekjoon.bronze.bronze3;
//정수의 개수
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] num = str.split(",");
        System.out.println(num.length);
    }
}
