package lld_questions.atm.ATMStates;

import lld_questions.atm.ATM;
import lld_questions.atm.Card;

public class IdleState extends ATMState {
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setAtmState(new HasCardState());
    }
}
