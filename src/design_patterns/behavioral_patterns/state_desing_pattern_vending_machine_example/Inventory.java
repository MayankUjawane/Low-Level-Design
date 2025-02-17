package design_patterns.behavioral_patterns.state_desing_pattern_vending_machine_example;

public class Inventory {
    ItemShelf[] inventory = null;

    Inventory(int itemCount) {
        inventory = new ItemShelf[itemCount];
        initialEmptyInventory();
    }
    private void initialEmptyInventory() {
        int startCode = 101;
        for(int i=0; i<inventory.length; i++) {
            ItemShelf space = new ItemShelf();
            space.setCode(startCode);
            space.setSoldOut(true);
            inventory[i] = space;
            startCode++;
        }
    }

    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }

    public void addItem(Item item, int codeNumber) throws Exception {
        for(ItemShelf itemShelf : inventory) {
            if(itemShelf.getCode()==codeNumber) {
                if(!itemShelf.isSoldOut()) throw new Exception("Already item is present, you can not add item here");
                itemShelf.setSoldOut(false);
                itemShelf.setItem(item);
            }
        }
    }

    public Item getItem(int codeNumber) throws Exception {
        for(ItemShelf itemShelf : inventory) {
            if(itemShelf.getCode()==codeNumber) {
                if(itemShelf.isSoldOut()) throw new Exception("Item already sold out");
                return itemShelf.getItem();
            }
        }
        throw new Exception("Invalid Code");
    }

    public void updateSoldOutItem(int codeNumber) {
        for(ItemShelf itemShelf : inventory) {
            if(itemShelf.getCode()==codeNumber) {
                itemShelf.setSoldOut(true);
            }
        }
    }
}
