package week05;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {

	Map<String, ItemSlot> itemLocation;

	VendingMachine() {
		this.itemLocation = new HashMap<>();
	}

	public Map<String, ItemSlot> getItemLocation() {
		return itemLocation;
	}

	public void setItemLocation(String itemName, ItemSlot itemSlot) {
		this.itemLocation.put(itemName, itemSlot);
	}

	/*
	 * Vending Machine:
	 *
	 * Create the following four classes: VendingMachine, ItemSlot, Item, and Return
	 *
	 * a. VendingMachine: will contain a Map<String, ItemSlot> where the String will
	 * represent the location in the vending machine (i.e. "A4")
	 *
	 * b. ItemSlot: will contain an item, the item's price, and the quantity of that
	 * item in that slot
	 *
	 * c. Item: will contain a description
	 *
	 * d. Return: will have a field for an Item and a double for any change. The
	 * Return is what will be returned to each user using the vending machine.
	 *
	 * VendingMachine should have two methods:
	 *
	 * a. a method that takes a double (money) and a location (i.e. "A4") and
	 * returns a Return containing any change and the item. If the supplied money
	 * was insufficient to purchase the item, the Return should contain just the
	 * money (item should be null).
	 *
	 * b. a method that takes an Item, int (quantity), price and string (location)
	 * and will create an ItemSlot based on the input.
	 *
	 */

	public Return choice(double money, String location) {
		// look for item in vending machine
		ItemSlot itemSlot = itemLocation.get(location);
		Return newReturn = new Return();

		// check to see if items are there and enough money on hand
		if ((itemSlot.quantity > 0) && (money - itemSlot.price > 0)) {
			newReturn.change = money - itemSlot.price;
			newReturn.item = itemLocation.remove(location).getItem();
		} else {
			newReturn.change = money;
		}
		return newReturn;
	}
	
	public void addItem(Item item, int quantity, String location, double price) {
		ItemSlot itemSlot = new ItemSlot(item, price, quantity);
		itemLocation.put(location,  itemSlot);
	}

}
