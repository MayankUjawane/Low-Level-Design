package lld_questions.snake_ladder_game;

public class Jump {
    private int start;
    private int end;

    Jump(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getEnd() {
        return end;
    }

    public int getStart() {
        return start;
    }
}
