package lld_questions.atm.ATMStates;

import lld_questions.atm.ATM;
import lld_questions.atm.Card;

public class HasCardState extends ATMState {

    public HasCardState() {
        System.out.println("Enter your card pin");
    }

    @Override
    public void authenticatePin(ATM atm, Card card, int pin) {
        boolean isCorrectPinEntered = card.isCorrectPinEntered(pin);
        if(isCorrectPinEntered) {
            atm.setAtmState(new SelectOperationState());
        } else {
            System.out.println("Invalid PIN Number");
            exit(atm);
        }
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
