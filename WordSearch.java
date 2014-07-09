package leetcode;

public class WordSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = new char[][] {
				{'C','A','A'},
				{'A','A','A'},
				{'B','C','D'}
		};
		System.out.print(exist(board, "AAB"));
	}

	public static boolean exist(char[][] board, String word) {
        if (board.length == 0 || word.equals("")) return false;
        int m = board.length;
        int n = board[0].length;
        boolean x = false;
        int[][] check = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (board[i][j] == word.charAt(0))
                    x |= doExist(board, check, word, i, j);
        return x;
    }
    
    public static boolean doExist(char[][] board, int[][] check, String word, int row, int col) {
        if (board.length == 0 || word.equals("")) return false;
        int m = board.length;
        int n = board[0].length;
        if (word.length() == 1) {
            return true;
        } else {
            word = word.substring(1);
            check[row][col] = 1;
            boolean x = false;
            if (row != 0 && word.charAt(0) == board[row-1][col] && check[row-1][col] == 0)
                x |= doExist(board, check, word, row-1, col);
            if (col != 0 && word.charAt(0) == board[row][col-1] && check[row][col-1] == 0)
                x |= doExist(board, check, word, row, col-1);
            if (row != m-1 && word.charAt(0) == board[row+1][col] && check[row+1][col] == 0)
                x |= doExist(board, check, word, row+1, col);
            if (col != n-1 && word.charAt(0) == board[row][col+1] && check[row][col+1] == 0)
                x |= doExist(board, check, word, row, col+1);
            return x;
        }
    }
}
