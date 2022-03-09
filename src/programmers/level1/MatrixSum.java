package programmers.level1;
//행렬의 덧셈
public class MatrixSum {

	public static void main(String[] args) {
		int[][] arr1 = {{1, 2}, {2, 3}};
		int[][] arr2 = {{3, 4}, {5, 6}};
		int[][] result = solution(arr1, arr2);
		
		System.out.print("��� : ");
		for(int i = 0; i<arr1.length; i++) {
			System.out.print("{");
			for(int j = 0; j<arr1[0].length; j++) {
				System.out.print(result[i][j] + ", ");
			}
			System.out.print("}");
		}
	}

	public static int[][] solution(int[][] arr1, int[][] arr2) {
        int col = arr1.length;
        int row = arr1[0].length;
        
        int[][] answer = new int[col][row];
        
        for(int i = 0; i<col; i++){
            for(int j = 0; j<row; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        return answer;
    }
}
