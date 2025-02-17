package design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example.VendingStates.impl;

import design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example.Item;
import design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example.VendingMachine;
import design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example.VendingStates.State;
import design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example.enums.Coin;

import java.util.List;

public class HasMoneyState implements State {

    public HasMoneyState() {
        System.out.println("Currently Vending Machine is in HasMoneyState");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        // no need to do anything because already vending machine is in has money state
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        System.out.println("Accepted the coin");
        machine.getCoinList().add(coin);
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("You need to click on start product selection button first");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("You need to click on start product selection button first");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount back in the coin dispense tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("First you need to choose product");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("You can update inventory only in idle state");
    }
}
