package design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example.VendingStates;

import design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example.Item;
import design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example.VendingMachine;
import design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example.enums.Coin;

import java.util.List;

public interface State {
    // Idle State Functionality
    void clickOnInsertCoinButton(VendingMachine machine) throws Exception;
    // Has Money State Functionality
    void insertCoin(VendingMachine machine, Coin coin) throws Exception;
    // Has Money State Functionality
    void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception;
    // Selection State Functionality
    void chooseProduct(VendingMachine machine, int codeNumber) throws Exception;
    // Selection State Functionality
    int getChange(int returnChangeMoney) throws Exception;
    // Either in HasMoneyState or Selection State
    List<Coin> refundFullMoney(VendingMachine machine) throws Exception;
    // Dispense State
    Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception;
    // Idle State Functionality
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception;
}
