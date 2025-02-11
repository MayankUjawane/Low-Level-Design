package lld_questions.tic_tac_toe;

import lld_questions.tic_tac_toe.enums.Player;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Board {
    Player[][] board;
    Deque<Player> deque;
    int totalMovesOccurred;

    Board() {
        board = new Player[3][3];
        deque = new LinkedList<>();
        deque.add(Player.X);
        deque.add(Player.O);
        totalMovesOccurred = 0;
    }

    public void startGame() {
        printBoard();
        Scanner sc = new Scanner(System.in);
        while(totalMovesOccurred < 9) {
            int row = sc.nextInt(), col = sc.nextInt();
            Move move = new Move(row, col);
            if(!move.isValidMove(3, 3, board)) {
                System.out.println("Not a valid move, please retry!");
                continue;
            }
            totalMovesOccurred++;
            // remove the starting player and add it at the end
            Player player = deque.pop();
            deque.add(player);

            board[row][col] = player;
            if(Rules.isWinning(board, player, move)) {
                System.out.println("Player " + player + " is the winner!");
                printBoard();
                return;
            }
            printBoard();
        }
        System.out.println("Draw");
    }

    private void printBoard() {
        for(Player[] row : board) {
            System.out.print("| \t");
            for(Player player : row) {
                if(player != null) System.out.print(player+"\t | \t");
                else System.out.print("\t | \t");
            }
            System.out.println();
        }
    }
}
