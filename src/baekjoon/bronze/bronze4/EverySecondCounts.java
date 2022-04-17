package baekjoon.bronze.bronze4;
//Every Second Counts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EverySecondCounts {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String start = br.readLine();
        StringTokenizer st1 = new StringTokenizer(start, " : ");
        String end = br.readLine();
        StringTokenizer st2 = new StringTokenizer(end, " : ");
        int t1 = (Integer.valueOf(st1.nextToken())*3600) + (Integer.valueOf(st1.nextToken())*60) + Integer.valueOf(st1.nextToken());
        int t2 = (Integer.valueOf(st2.nextToken())*3600) + (Integer.valueOf(st2.nextToken())*60) + Integer.valueOf(st2.nextToken());

        if(t1>t2) System.out.println(t2-t1 + 3600*24);
        else System.out.println(t2-t1);
    }
}
