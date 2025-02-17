package lld_questions.atm.ATMStates;

import lld_questions.atm.ATM;
import lld_questions.atm.Card;
import lld_questions.atm.TransactionType;

public abstract class ATMState {
    public void insertCard(ATM atm, Card card) {
        System.out.println("OOPS! Something went wrong");
    }

    public void authenticatePin(ATM atm, Card card, int pin) {
        System.out.println("OOPS! Something went wrong");
    }

    public void selectOperation(ATM atm, Card card, TransactionType transactionType) {
        System.out.println("OOPS! Something went wrong");
    }

    public void cashWithdrawal(ATM atm, Card card, int amount) {
        System.out.println("OOPS! Something went wrong");
    }

    public void displayBalance(ATM atm, Card card) {
        System.out.println("OOPS! Something went wrong");
    }

    public void returnCard() {
        System.out.println("OOPS! Something went wrong");
    }

    public void exit(ATM atm) {
        System.out.println("OOPS! Something went wrong");
    }
}
