package lld_questions.snake_ladder_game;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[] board;
    private int size;

    Board() {
        size = 100;
        board = new Cell[size];
        for(int i=0; i<size; i++) board[i] = new Cell(null);
        Set<Integer> startSet = new HashSet<>();
        Set<Integer> endSet = new HashSet<>();
        addSnakes(5, startSet, endSet);
        addLadders(5, startSet, endSet);
    }

    public Cell getCell(int playerPosition) {
        return board[playerPosition];
    }

    private void addSnakes(int snakesCount, Set<Integer> startSet, Set<Integer> endSet) {
        while(snakesCount > 0) {
            // for snakes start > end
            int snakeHead = ThreadLocalRandom.current().nextInt(size);
            int snakeTail = ThreadLocalRandom.current().nextInt(size);
            if(snakeHead <= snakeTail || startSet.contains(snakeHead) || endSet.contains(snakeTail)) continue;
            snakesCount--;
            Jump jump = new Jump(snakeHead, snakeTail);
            board[snakeHead].jump = jump;
        }
    }

    private void addLadders(int ladderCount, Set<Integer> startSet, Set<Integer> endSet) {
        while(ladderCount > 0) {
            // for ladders start < end
            int ladderStart = ThreadLocalRandom.current().nextInt(size);
            int ladderEnd = ThreadLocalRandom.current().nextInt(size);
            if(ladderStart >= ladderEnd || startSet.contains(ladderStart) || endSet.contains(ladderEnd)) continue;
            ladderCount--;
            Jump jump = new Jump(ladderStart, ladderEnd);
            board[ladderStart].jump = jump;
        }
    }
}
