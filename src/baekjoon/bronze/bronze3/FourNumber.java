package baekjoon.bronze.bronze3;
//³×¼ö
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FourNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        String ab = str[0] + str[1];
        String cd = str[2] + str[3];

        System.out.println(Long.parseLong(ab) + Long.parseLong(cd));
    }
}
