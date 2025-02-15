package lld_questions.snake_ladder_game;

import java.util.LinkedList;
import java.util.Queue;

public class Game {
    Board board;
    Dice dice;
    Queue<Player> players;

    Game(int numberOfPlayers) {
        board = new Board();
        dice = new Dice(1);
        players = new LinkedList<>();
        for(int i=1; i<=numberOfPlayers; i++) players.add(new Player(0, i));
    }

    public void startGame() {
        System.out.println("Game Started");
        while(true) {
            Player player = players.poll();
            // add player back to the queue for the next term
            players.offer(player);
            int diceNumber = dice.rollDice();
            int nextPosition = player.position + diceNumber;
            if(nextPosition > 100) {
                System.out.println("Dice Rolled Number is " + diceNumber + " which is greater than required number to win " + (100-player.position));
                continue;
            }

            if(nextPosition == 100) {
                System.out.println("Player "+player.playerId + " is the winner!");
                break;
            }

            Cell cell = board.getCell(nextPosition);
            if(cell.jump != null) {
                if(cell.jump.getStart() < cell.jump.getEnd()) {
                    System.out.println("Player "+player.playerId +" Jumped Ladder");
                } else {
                    System.out.println("Snake bitten player "+player.playerId);
                }
                nextPosition = cell.jump.getEnd();
            }
            player.position = nextPosition;

            System.out.println("Player "+player.playerId +" next position is "+player.position);
        }
    }
}
