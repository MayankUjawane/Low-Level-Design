package lld_questions.atm.AmountWithdrawal;

import lld_questions.atm.ATM;

public class FiveHundredWithdrawProcessor extends CashWithdrawProcessor {
    public FiveHundredWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        super(nextCashWithdrawProcessor);
    }

    @Override
    public void withdraw(ATM atm, int withdrawalAmountRequest) {
        int numberOfFiveHundredNotesAvailable = atm.getNumberOfFiveHundredNotes();
        int requiredNotes = withdrawalAmountRequest/500;

        int withdrawNotes = Math.min(numberOfFiveHundredNotesAvailable, requiredNotes);
        withdrawalAmountRequest -= (withdrawNotes*500);
        atm.deductFiveHundredNotes(withdrawNotes);

        if(withdrawalAmountRequest != 0) super.withdraw(atm, withdrawalAmountRequest);
    }
}
