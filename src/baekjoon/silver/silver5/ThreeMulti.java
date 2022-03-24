package baekjoon.silver.silver5;
//3ÀÇ ¹è¼ö
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class ThreeMulti {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        int j = 0;
        while(x.length()>1){
            j++;
            String[] str = x.replaceAll("0", "").split("");
            BigInteger tmp = new BigInteger("0");
            for(int i = 0; i<str.length; i++){
                tmp = tmp.add(BigInteger.valueOf(Integer.parseInt(str[i])));
            }
            x = String.valueOf(tmp);
        }
        System.out.println(j);
        if(Integer.parseInt(x)%3==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
