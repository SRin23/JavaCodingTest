package baekjoon.bronze.bronze4;
//감정이입
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Empathy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        BigInteger b1 = new BigInteger(str, 2);
        str = br.readLine();
        BigInteger b2 = new BigInteger(str, 2);

        String result = b1.multiply(b2).toString(2);
        System.out.println(result);
    }
}
