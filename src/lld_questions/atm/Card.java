package lld_questions.atm;

public class Card {
    private int cardNumber;
    private static int PIN_NUMBER = 123123;
    private UserBankAccount bankAccount;

    public boolean isCorrectPinEntered(int pin) {
        return (pin == PIN_NUMBER);
    }

    public static int getPinNumber() {
        return PIN_NUMBER;
    }

    public int getBankBalance() {
        return bankAccount.balance;
    }

    public void deductBankBalance(int amount) {
        bankAccount.withdraw(amount);
    }

    public void setBankAccount(UserBankAccount userBankAccount) {
        this.bankAccount = userBankAccount;
    }
}
