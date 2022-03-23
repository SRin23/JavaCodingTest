package baekjoon.silver.silver5;
//K번째 수
//시간초과 주의 -> Scanner대신, BufferedReader사용

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class KthNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        //System.out.println(n);
        //System.out.println(m);

        str = br.readLine();
        String[] arr = str.split(" ");
        ArrayList<Integer> num = new ArrayList<>();

        for(int i = 0; i<arr.length; i++){
            num.add(Integer.parseInt(arr[i]));
        }
        Collections.sort(num);

        System.out.println(num.get(m-1));
    }
}