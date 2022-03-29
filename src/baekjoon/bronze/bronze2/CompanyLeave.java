package baekjoon.bronze.bronze2;
//회사에 있는 사람
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class CompanyLeave {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int log = Integer.parseInt(br.readLine());
        HashMap<String, String> map = new HashMap<>();
        ArrayList<String> company = new ArrayList<>();
        for(int i = 0; i<log; i++){
            String[] temp = br.readLine().split("");
            String name = temp[0];
            if(temp[1].equals("enter")){
                company.add(name);
            }else{
                if(company.contains(name)) company.remove(name);
            }
        }
        Collections.sort(company, Collections.reverseOrder());

        for(int i = 0; i<company.size(); i++){
            System.out.println(company.get(i));
        }

    }
}
