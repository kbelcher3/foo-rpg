package main;

public class Equipment extends Item {
	private final int itemLevel;
	
	public Equipment(String name, int itemLevel) {
		super(name);
		this.itemLevel = itemLevel;
	}
	
	public Equipment(String name, int itemLevel, boolean legendary) {
		super(name, legendary);
		this.itemLevel = itemLevel;
	}

	/**
	 * @return the itemLevel
	 */
	public int getItemLevel() {
		return itemLevel;
	}
	
	
}
