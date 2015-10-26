package INVENTORY;

public class Item {

	private int location;

	private boolean isPresent;

	private String name;

	private String description;

	private int limit;

	private int quantitiy;

	public boolean isUsable() {
		return false;
	}

	public boolean isEquipable(Weapon weapon) {
		return false;
	}

	public boolean isEquipable(Armor armor) {
		return false;
	}

}
