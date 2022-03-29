package baekjoon.bronze.bronze3;
//첫글자를 대문자로

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstWordUpperCase {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++){
            String str = br.readLine();
            if(str.length()>0){
                System.out.println(str.substring(0, 1).toUpperCase() + str.substring(1));
            }

        }
    }
}