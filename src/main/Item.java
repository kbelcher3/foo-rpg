package main;

public class Item {
	private final String name;
	private final boolean legendary;
	
	public Item(String name) {
		this.name = name;
		this.legendary = false;
	}
	
	public Item(String name, boolean legendary) {
		this.name = name;
		this.legendary = legendary;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the legendary
	 */
	public boolean isLegendary() {
		return legendary;
	}
	
}
