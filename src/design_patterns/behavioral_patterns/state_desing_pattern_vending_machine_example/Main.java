package design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example;

import design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example.VendingStates.State;
import design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example.enums.Coin;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        try {
            System.out.println("\n Filling Up The Inventory");
            fillUpInventory(vendingMachine);
            displayInventory(vendingMachine);

            System.out.println("\n Clicking on Insert Coin Button \n");
            State vendingMachineState = vendingMachine.getVendingMachineState();
            vendingMachineState.clickOnInsertCoinButton(vendingMachine);

            // state changed to hasMoneyState
            vendingMachineState = vendingMachine.getVendingMachineState();
            // add coins in vending machine
            vendingMachineState.insertCoin(vendingMachine, Coin.PENNY);
            vendingMachineState.insertCoin(vendingMachine, Coin.NICKEL);
            vendingMachineState.insertCoin(vendingMachine, Coin.QUARTER);

            System.out.println("\n Clicking on Product Selection Button \n");
            vendingMachineState.clickOnStartProductSelectionButton(vendingMachine);

            // state changed to selection state
            vendingMachineState = vendingMachine.getVendingMachineState();
            vendingMachineState.chooseProduct(vendingMachine, 102);
        } catch (Exception e) {

        } finally {
            displayInventory(vendingMachine);
        }
    }

    private static void fillUpInventory(VendingMachine vendingMachine) {
        ItemShelf[] slots = vendingMachine.getInventory().inventory;
        for(int i=0; i<slots.length; i++) {
            Item item = new Item();
            if(i<3) {
                item.setItemName("Coke");
                item.setPrice(20);
            } else if(i<5) {
                item.setItemName("Pepsi");
                item.setPrice(15);
            } else if(i<7) {
                item.setItemName("Juice");
                item.setPrice(10);
            } else {
                item.setItemName("Soda");
                item.setPrice(5);
            }
            slots[i].setItem(item);
            slots[i].setSoldOut(false);
        }
    }

    private static void displayInventory(VendingMachine vendingMachine) {
        System.out.println();
        ItemShelf[] slots = vendingMachine.getInventory().inventory;
        for(ItemShelf itemShelf : slots) {
            System.out.println("CodeNumber: " + itemShelf.getCode() +
                    ", Item: " + itemShelf.getItem().getItemName() +
                    ", Price: " + itemShelf.getItem().getPrice() +
                    ", isAvailable: " + !itemShelf.isSoldOut());
        }
    }
}
