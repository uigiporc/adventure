package obstacles;

import gui.UIHandler;
import items.Item;

import java.util.ResourceBundle;

public class ClosedDoor extends Obstacle {

	private static final long serialVersionUID = 2394726890544852907L;
	private final Item unlockItem;

	@Override
	public boolean isPassed() {
		return passed;
	}

	@Override
	public boolean unlock(Item usedItem) {
		if(unlockItem.isSameItem(usedItem)) {
			UIHandler.printInFrame(ResourceBundle.getBundle("bundles/ObstaclesOutput")
					.getString("unlockDoor"));
			passed = true;
		}
		return this.isPassed();
	}

	public ClosedDoor(Item unlock) {
		unlockItem = unlock;
	}

}
