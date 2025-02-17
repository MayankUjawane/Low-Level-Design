package design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example.VendingStates.impl;

import design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example.Item;
import design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example.VendingMachine;
import design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example.VendingStates.State;
import design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example.enums.Coin;

import java.util.List;

public class DispenseState implements State {
    public DispenseState(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Currently Vending Machine is in Dispense State");
        dispenseProduct(machine, codeNumber);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("Only works in Idle State");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Only works in HasMoneyState");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("Only works in HasMoneyState");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Only works in Selection State");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("Only works in Selection State");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("it works either in HasMoneyState or SelectionState not in DispenseState");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Product has been dispensed");
        Item item = machine.getInventory().getItem(codeNumber);
        machine.getInventory().updateSoldOutItem(codeNumber);
        machine.setVendingMachineState(new IdleState(machine));
        return item;
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Only works in Idle State");
    }
}
