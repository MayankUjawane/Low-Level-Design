package lld_questions.atm;

public class Main {
    static ATM atm;
    static User user;

    public static void main(String[] args) {
        initialize();

        atm.printCurrentATMStatus();
        atm.getCurrentAtmState().insertCard(atm, user.getCard());
        atm.getCurrentAtmState().authenticatePin(atm, user.getCard(), 123123);
        atm.getCurrentAtmState().selectOperation(atm, user.getCard(), TransactionType.CASH_WITHDRAWAL);
        atm.getCurrentAtmState().cashWithdrawal(atm, user.getCard(), 2700);
        atm.printCurrentATMStatus();
    }

    private static void initialize() {
        atm = ATM.getAtmObject();
        atm.setAtmBalance(3500, 1, 2, 5);

        user = new User();
        user.setCard(createCard());
    }

    private static Card createCard() {
        UserBankAccount userBankAccount = new UserBankAccount();
        userBankAccount.balance = 3000;

        Card card = new Card();
        card.setBankAccount(userBankAccount);
        return card;
    }

}
