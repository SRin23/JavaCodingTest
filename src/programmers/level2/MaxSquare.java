package programmers.level2;
//가장 큰 사각형
public class MaxSquare {
	static int row;
	static int col;

	public static void main(String[] args) {
		int board[][] = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
		int result = solution(board);
		System.out.println("결과 : " + result);
	}

	public static int solution(int[][] board) {
		int answer = 0;
		int newBoard[][] = new int[board.length+2][board[0].length+2];

		for(int i = 1; i<newBoard.length-1; i++) {
			for(int j= 1; j<newBoard[0].length-1; j++) {
				newBoard[i][j] = board[i-1][j-1];
			}
		}
		
//		for(int i = 0; i<newBoard.length; i++) {
//			for(int j= 0; j<newBoard[0].length; j++) {
//				System.out.print(newBoard[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		for (int i = 1; i < newBoard.length-1; i++) {
			for (int j = 1; j < newBoard[0].length-1; j++) {
				if (newBoard[i][j] == 1) {
					row = 1;
					col = 1;
					newBoard[i][j] = 2;
					check(newBoard, i, j);
				}
			}
		}
		
		return answer;
	}

	public static void check(int[][] newBoard, int i, int j) {
		System.out.println("-------------");
		
		if (newBoard[i][j + 1] == 1) {
			row++;
			newBoard[i][j + 1] = 2;
			check(newBoard, i, j + 1);
		}else if(newBoard[i][j - 1] == 1){
			row++;
			newBoard[i][j - 1] = 2;
			check(newBoard, i, j - 1);
		}else {
			System.out.println(row);
		}
		if (newBoard[i + 1][j] == 1) {
			col++;
			newBoard[i + 1][j] = 2;
			check(newBoard, i + 1, j);
		}else {
			System.out.println(col);
		}
	}
}
