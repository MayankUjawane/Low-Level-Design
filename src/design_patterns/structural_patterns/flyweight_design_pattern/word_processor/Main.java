package design_patterns.structural_patterns.flyweight_design_pattern.word_processor;

public class Main {
    public static void main(String[] args) {
        Letter letterT = LetterFactory.createLetter('t');
        letterT.display(0,0);

        Letter letterT2 = LetterFactory.createLetter('t');
        letterT.display(0, 1);
    }
}
