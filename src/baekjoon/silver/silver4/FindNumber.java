package baekjoon.silver.silver4;
//수찾기
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> num = new ArrayList<>();
        for(int i = 0; i<n; i++){
            num.add(sc.nextInt());
        }
        //정렬
        Collections.sort(num);
        //num.contains(sc.nextInt()) //List에 특정 값이 있는지 확인
        
        int m = sc.nextInt();
        for(int i = 0; i<m; i++){
            System.out.println(binarySearch(num, sc.nextInt()));

        }
    }

    //이진검색을 이용하여 시간 단축
    public static int binarySearch(ArrayList<Integer> num, int a){
        int start = 0;
        int end = num.size()-1;
        while(start <= end){
            int mid = (start+end)/2;

            if(num.get(mid)==a){
                return 1;
            }else if(num.get(mid)>a){
                end = mid-1;
            }else if(num.get(mid)<a){
                start = mid+1;
            }
        }
        return 0;
    }
}
