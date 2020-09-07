import java.util.HashSet;

public class ValidSudoko {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		// input need to be initialized
		char[][] board = {};
		char c;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				// set.add() will return true if the value is not present in the
				// set
				// and return false if the value is present in the set
				c = board[i][j];
				if (c != '.') {
					if (!set.add(board[i][j] + "in the row" + i) || (!set.add(board[i][j] + " n the column" + j))
							|| (!set.add(board[i][j] + "in the grid" + i / 3 + j / 3))) {
						System.out.println("invalid");
					}
				}
			}
		}

	}
}
