package lld_questions.snake_ladder_game;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private int numberOfDice;

    Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public int rollDice() {
        int number = 0;
        for(int i=0; i<numberOfDice; i++) {
            number += ThreadLocalRandom.current().nextInt(6)+1;
        }
        return number;
    }
}
