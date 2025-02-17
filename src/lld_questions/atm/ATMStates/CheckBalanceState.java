package lld_questions.atm.ATMStates;

import lld_questions.atm.ATM;
import lld_questions.atm.Card;

public class CheckBalanceState extends ATMState {
    @Override
    public void displayBalance(ATM atm, Card card) {
        System.out.println("Your Account Balance is " + card.getBankBalance());
        exit(atm);
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setAtmState(new IdleState());
        System.out.println("Ended");
    }
}
