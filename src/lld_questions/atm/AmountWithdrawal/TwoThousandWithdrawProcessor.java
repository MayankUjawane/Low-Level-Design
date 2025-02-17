package lld_questions.atm.AmountWithdrawal;

import lld_questions.atm.ATM;

public class TwoThousandWithdrawProcessor extends CashWithdrawProcessor {
    public TwoThousandWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        super(nextCashWithdrawProcessor);
    }

    @Override
    public void withdraw(ATM atm, int withdrawalAmountRequest) {
        int numberOfTwoThousandNotesAvailable = atm.getNumberOfTwoThousandNotes();
        int requiredNotes = withdrawalAmountRequest/2000;

        int withdrawNotes = Math.min(numberOfTwoThousandNotesAvailable, requiredNotes);
        withdrawalAmountRequest -= (withdrawNotes*2000);
        atm.deductTwoThousandNotes(withdrawNotes);

        if(withdrawalAmountRequest != 0) super.withdraw(atm, withdrawalAmountRequest);
    }
}
