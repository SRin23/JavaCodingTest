package baekjoon.bronze.bronze4;
//17น่
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Seventeen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String binary = br.readLine();
        BigInteger binaryToDecimal = new BigInteger(binary, 2).multiply(BigInteger.valueOf(17));
        String result = binaryToDecimal.toString(2);
        System.out.println(result);
    }
}
