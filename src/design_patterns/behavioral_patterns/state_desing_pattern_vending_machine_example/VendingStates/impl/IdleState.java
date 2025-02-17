package design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example.VendingStates.impl;

import design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example.Item;
import design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example.VendingMachine;
import design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example.VendingStates.State;
import design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example.enums.Coin;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {
    public IdleState() {
        System.out.println("Currently Vending Machine is in Idle State");
    }

    public IdleState(VendingMachine machine) {
        System.out.println("Currently Vending Machine is in Idle State");
        machine.setCoinList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("You can not insert coin in idle state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("First you need to click on insert coin button");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("You can not choose product in idle state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("You can not get change in idle state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("You can not get refund in idle state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Product can not be dispense in idle state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        machine.getInventory().addItem(item, codeNumber);
    }
}
