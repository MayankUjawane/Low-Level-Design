package lld_questions.atm.AmountWithdrawal;

import lld_questions.atm.ATM;

public class CashWithdrawProcessor {
    CashWithdrawProcessor nextCashWithdrawProcessor;
    public CashWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        this.nextCashWithdrawProcessor = nextCashWithdrawProcessor;
    }
    public void withdraw(ATM atm, int withdrawalAmountRequest) {
        if(nextCashWithdrawProcessor != null) {
            nextCashWithdrawProcessor.withdraw(atm, withdrawalAmountRequest);
        } else {
            System.out.println("Unable to fulfill the amount");
        }
    }
}
