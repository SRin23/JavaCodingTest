package baekjoon.bronze.bronze3;
//¥ı«œ±‚
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                sum += Integer.parseInt(st.nextToken());
            }
            System.out.println(sum);
        }
    }
}
