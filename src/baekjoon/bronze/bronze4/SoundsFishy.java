package baekjoon.bronze.bronze4;
//Sounds Fishy!
import java.util.Scanner;

public class SoundsFishy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] depth = new int[4];
        for(int i = 0; i<4; i++){
            depth[i] = sc.nextInt();
            if(depth[i]<0){
                System.out.println("No Fish");
                return;
            }
        }
        boolean flag = true;

        //감소
        if(depth[0] > depth[1]){
            for(int i = 1; i<4; i++){
                if(depth[i-1] <= depth[i]){
                    System.out.println("No Fish");
                    flag = false;
                    break;
                }
            }if(flag) {
                System.out.println("Fish Diving");
            }

        }
        else if(depth[0] < depth[1]){
            for(int i = 1; i<4; i++){
                if(depth[i-1] >= depth[i]){
                    System.out.println("No Fish");
                    flag = false;
                    break;
                }
            }if(flag) {
                System.out.println("Fish Rising");
            }
        }
        else{
            for(int i = 1; i<4; i++){
                if(depth[i-1] != depth[i]){
                    System.out.println("No Fish");
                    flag = false;
                    break;
                }
            }if(flag) {
                System.out.println("Fish At Constant Depth");
            }
        }
    }
}
