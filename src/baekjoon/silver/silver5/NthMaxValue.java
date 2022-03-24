package baekjoon.silver.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

//N번째 큰 수
public class NthMaxValue {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++){
            String str = br.readLine();
            ArrayList<Integer> arr = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(str, " ");
            while(st.hasMoreTokens()){
                arr.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(arr);
            System.out.println(arr.get(7));
        }
    }
}
