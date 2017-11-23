//https://leetcode.com/problems/valid-sudoku/discuss/ 
// o(n*m)
import java.util.*;
public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		for (int i=0;i<9;i++)
		{
			HashSet<Character> row = new HashSet<>();
			HashSet<Character> col = new HashSet<>();
			HashSet<Character> cube = new HashSet<>();
			
			for (int q=0;q<9;q++)
			{
				if (board[i][q] != '.' && row.contains(board[i][q]))
					return false;
				row.add(board[i][q]);
				if (board[q][i] != '.' && col.contains(board[q][i]))
					return false;
				col.add(board[q][i]);
				int rowIndex = 3 * (i/3);
				int colIndex = 3 * (i%3);
				if (board[rowIndex + q/3][colIndex + q%3] != '.' && cube.contains(board[rowIndex + q/3][colIndex + q%3]))
					return false;
				cube.add(board[rowIndex + q/3][colIndex + q%3]);
			}
		}
		return true;
	}
}
