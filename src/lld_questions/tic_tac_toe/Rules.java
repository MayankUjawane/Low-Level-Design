package lld_questions.tic_tac_toe;

import lld_questions.tic_tac_toe.enums.Player;

public class Rules {
    public static boolean isWinning(Player[][] board, Player player, Move move) {
        int currRow = move.row, currCol = move.col;
        boolean isWinner = true;
        // checking row
        for(int col=0; col<3; col++) {
            if(board[currRow][col] != player) {
                isWinner = false;
                break;
            }
        }
        if(isWinner) return true;

        // checking col
        isWinner = true;
        for(int row=0; row<3; row++) {
            if(board[row][currCol] != player) {
                isWinner = false;
                break;
            }
        }
        if (isWinner) return true;

        // checking diagonal
        if(currRow==currCol) {
            isWinner = true;
            for(int row=0, col=0; row<3 && col<3; row++, col++) {
                if(board[row][col] != player) {
                    isWinner = false;
                    break;
                }
            }
            if (isWinner) return true;
        }

        // checking reverse diagonal
        if(currRow == (2-currCol)) {
            isWinner = true;
            for(int row=0, col=2; row<3 && col>=0; row++, col--) {
                if(board[row][col] != player) {
                    isWinner = false;
                    break;
                }
            }
            if (isWinner) return true;
        }

        return false;
    }
}
