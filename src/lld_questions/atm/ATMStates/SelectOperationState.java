package lld_questions.atm.ATMStates;

import lld_questions.atm.ATM;
import lld_questions.atm.Card;
import lld_questions.atm.TransactionType;

public class SelectOperationState extends ATMState {

    public SelectOperationState() {
        showOperations();
    }

    private void showOperations() {
        System.out.println("Please select the operation");
        TransactionType.showAllTransactionTypes();
    }

    @Override
    public void selectOperation(ATM atm, Card card, TransactionType transactionType) {
        switch (transactionType) {
            case CASH_WITHDRAWAL:
                atm.setAtmState(new CashWithdrawalState());
                break;
            case BALANCE_CHECK:
                atm.setAtmState(new CheckBalanceState());
                break;
            default:
                System.out.println("Invalid Option");
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
