package Programmers_Level2;

//Çà·ÄÀÇ °ö¼À
public class multiMatrix {

	public static void main(String[] args) {
		int arr1[][] = {{1, 4}, {3, 2}, {4, 1}};
		int arr2[][] = {{3, 3}, {3, 3}};
		int result[][] = solution(arr1, arr2);
		for(int i = 0; i<result.length; i++) {
			for(int j = 0; j<result[0].length; j++) {
				System.out.print(result[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
		int arr3[][] = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
		int arr4[][] = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
		int result2[][] = solution(arr3, arr4);
		for(int i = 0; i<result2.length; i++) {
			for(int j = 0; j<result2[0].length; j++) {
				System.out.print(result2[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr2[0].length];
		for (int i = 0; i < arr1.length; i++) {
			for (int l = 0; l < arr2[0].length; l++) {
				int temp = 0;
				for (int j = 0; j < arr1[0].length; j++) {
					// System.out.print("(" + arr1[i][j] + ", " + arr2[j][l] + ")");
					temp += arr1[i][j] * arr2[j][l];
				}
				// System.out.print("\t");
				answer[i][l] = temp;
			}
			// System.out.println();
		}

		return answer;

	}

}
