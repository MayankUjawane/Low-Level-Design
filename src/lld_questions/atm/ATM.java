package lld_questions.atm;

import lld_questions.atm.ATMStates.ATMState;
import lld_questions.atm.ATMStates.IdleState;

public class ATM {
    // Singleton: eager initialization
    private static ATM atmObject = new ATM();
    private ATMState atmState;
    private int atmBalance;
    private int numberOfTwoThousandNotes;
    private int numberOfFiveHundredNotes;
    private int numberOfOneHundredNotes;

    private ATM() {}

    public static ATM getAtmObject() {
        atmObject.setAtmState(new IdleState());
        return atmObject;
    }

    public ATMState getCurrentAtmState() {
        return atmState;
    }

    public void setAtmState(ATMState atmState) {
        this.atmState = atmState;
    }

    public int getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(int atmBalance, int numberOfTwoThousandNotes, int numberOfFiveHundredNotes, int numberOfOneHundredNotes) {
        this.atmBalance = atmBalance;
        this.numberOfTwoThousandNotes = numberOfTwoThousandNotes;
        this.numberOfFiveHundredNotes = numberOfFiveHundredNotes;
        this.numberOfOneHundredNotes = numberOfOneHundredNotes;
    }

    public int getNumberOfTwoThousandNotes() {
        return numberOfTwoThousandNotes;
    }

    public int getNumberOfFiveHundredNotes() {
        return numberOfFiveHundredNotes;
    }

    public int getNumberOfOneHundredNotes() {
        return numberOfOneHundredNotes;
    }

    public void deductAtmBalance(int amount) {
        this.atmBalance -= amount;
    }

    public void deductTwoThousandNotes(int number) {
        this.numberOfTwoThousandNotes -= number;
    }

    public void deductFiveHundredNotes(int number) {
        this.numberOfFiveHundredNotes -= number;
    }

    public void deductOneHundredNotes(int number) {
        this.numberOfOneHundredNotes -= number;
    }

    public void printCurrentATMStatus() {
        System.out.println("Balance: " + atmBalance);
        System.out.println("Count of 2K Notes: " + this.numberOfTwoThousandNotes);
        System.out.println("Count of 500 Notes: " + this.numberOfFiveHundredNotes);
        System.out.println("Count of 100 Notes: " + this.numberOfOneHundredNotes);
    }
}
