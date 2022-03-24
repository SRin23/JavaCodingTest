package baekjoon.bronze.bronze2;
//¥ı«œ±‚
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, ",");
        int sum = 0;
        while(st.hasMoreTokens()){
            sum+=Integer.parseInt(st.nextToken());
        }
        System.out.println(sum);
    }
}
