package design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example.VendingStates.impl;

import design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example.Item;
import design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example.VendingMachine;
import design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example.VendingStates.State;
import design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example.enums.Coin;

import java.util.List;

public class SelectionState implements State {

    public SelectionState() {
        System.out.println("Currently Vending Machine is in Selection State");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("You can only press this button in Idle State");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("You can only insert coins in HasMoneyState");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        // no need to do anything already vending machine is in Selection State
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        Item item = machine.getInventory().getItem(codeNumber);

        int totalMoneyProvidedByUser = 0;
        for(Coin coin: machine.getCoinList()) totalMoneyProvidedByUser += coin.value;

        // compare product price and amount paid by user
        if(totalMoneyProvidedByUser < item.getPrice()) {
            System.out.println("Insufficient Amount, Product you selected is of price: "+ item.getPrice() + " and you paid: "+ totalMoneyProvidedByUser);
            // refund full money will change the state to ideal state
            refundFullMoney(machine);
            throw new Exception("Insufficient Amount");
        }
        // return extra money
        int amountToBeReturn = totalMoneyProvidedByUser - item.getPrice();
        if(amountToBeReturn != 0) getChange(amountToBeReturn);
        // change state
        machine.setVendingMachineState(new DispenseState(machine, codeNumber));
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        System.out.println("Returned the change in the coin dispense tray: " + returnChangeMoney);
        return returnChangeMoney;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount back in the coin dispense tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Product can only be dispensed in dispense state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Inventory can only be updated in Idle State");
    }
}
