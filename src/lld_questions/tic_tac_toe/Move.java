package lld_questions.tic_tac_toe;

import lld_questions.tic_tac_toe.enums.Player;

public class Move {
    int row, col;
    Move(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public boolean isValidMove(int m, int n, Player[][] board) {
        if(this.row<0 || this.col<0 || this.row>=m || this.col>=n || board[this.row][this.col] != null) return false;
        return true;
    }
}
