package lld_questions.atm.AmountWithdrawal;

import lld_questions.atm.ATM;

public class OneHundredWithdrawProcessor extends CashWithdrawProcessor {

    public OneHundredWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        super(nextCashWithdrawProcessor);
    }

    @Override
    public void withdraw(ATM atm, int withdrawalAmountRequest) {
        int numberOfOneHundredNotesAvailable = atm.getNumberOfOneHundredNotes();
        int requiredNotes = withdrawalAmountRequest/100;

        int withdrawNotes = Math.min(numberOfOneHundredNotesAvailable, requiredNotes);
        withdrawalAmountRequest -= (withdrawNotes*100);
        atm.deductOneHundredNotes(withdrawNotes);

        if(withdrawalAmountRequest != 0) super.withdraw(atm, withdrawalAmountRequest);
    }
}
