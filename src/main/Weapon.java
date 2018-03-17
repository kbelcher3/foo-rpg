package main;

public class Weapon extends Equipment {
	private int physicalMin;
	private int physicalMax;
	private int elementalMin;
	private int elementalMax;
	
	public Weapon(String name, int itemLevel, int physicalMin, int physicalMax,
			      int elementalMin, int elementalMax) {
		super(name, itemLevel);
		physicalMin = physicalMin;
		physicalMax = physicalMin;
		elementalMin = elementalMin;
		elementalMax = elementalMax;
	}
	
	public Weapon(String name, int itemLevel, int physicalMin, int physicalMax,
		      int elementalMin, int elementalMax, boolean legendary) {
	super(name, itemLevel, legendary);
	physicalMin = physicalMin;
	physicalMax = physicalMin;
	elementalMin = elementalMin;
	elementalMax = elementalMax;
}

	/**
	 * @return the physicalMin
	 */
	public int getPhysicalMin() {
		return physicalMin;
	}

	/**
	 * @return the physicalMax
	 */
	public int getPhysicalMax() {
		return physicalMax;
	}

	/**
	 * @return the elementalMin
	 */
	public int getElementalMin() {
		return elementalMin;
	}

	/**
	 * @return the elementalMax
	 */
	public int getElementalMax() {
		return elementalMax;
	}
	
}
