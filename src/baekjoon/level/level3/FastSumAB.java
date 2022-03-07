package baekjoon.level.level3;
//빠른 A+B
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FastSumAB {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(bf.readLine());
			for(int i = 0; i<n; i++) {
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				int a = Integer.parseInt(bf.readLine());
				int b = Integer.parseInt(bf.readLine());
				bw.write(a+b);
				bw.flush();
				bw.close();
			}
			bf.close();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Int
		
	}
}
