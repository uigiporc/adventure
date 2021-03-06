package items;

import engine.Inventory;
import gui.UIHandler;

import java.util.ResourceBundle;

public class OldBook extends Item {
    @Override
    public void use() {
        UIHandler.printInFrame(ResourceBundle.getBundle("bundles.itemsUsage").getString("oldBook"));
        Inventory.getInventory().removeFromBag(this.getItemName());
    }
}
