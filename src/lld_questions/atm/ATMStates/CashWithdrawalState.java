package lld_questions.atm.ATMStates;

import lld_questions.atm.ATM;
import lld_questions.atm.AmountWithdrawal.CashWithdrawProcessor;
import lld_questions.atm.AmountWithdrawal.FiveHundredWithdrawProcessor;
import lld_questions.atm.AmountWithdrawal.OneHundredWithdrawProcessor;
import lld_questions.atm.AmountWithdrawal.TwoThousandWithdrawProcessor;
import lld_questions.atm.Card;

public class CashWithdrawalState extends ATMState {

    public CashWithdrawalState() {
        System.out.println("Please enter the withdrawal amount");
    }

    @Override
    public void cashWithdrawal(ATM atm, Card card, int withdrawalAmountRequest) {
        if(atm.getAtmBalance() < withdrawalAmountRequest) {
            System.out.println("Sorry! insufficient fund in the ATM Machine");
            exit(atm);
        } else if (card.getBankBalance() < withdrawalAmountRequest) {
            System.out.println("Insufficient balance in your bank account");
            exit(atm);
        } else {
            card.deductBankBalance(withdrawalAmountRequest);
            atm.deductAtmBalance(withdrawalAmountRequest);

            // using chain of responsibility principle for this logic
            CashWithdrawProcessor cashWithdrawProcessor =
                    new TwoThousandWithdrawProcessor(new FiveHundredWithdrawProcessor(new OneHundredWithdrawProcessor(null)));

            cashWithdrawProcessor.withdraw(atm, withdrawalAmountRequest);
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
