package main;

public class Weapon extends Equipment {
	private int physicalMin;
	private int physicalMax;
	private int magicMin;
	private int magicMax;
	
	public Weapon(String name, int itemLevel, int physicalMin, int physicalMax,
			      int magicMin, int magicMax) {
		super(name, itemLevel);
		physicalMin = physicalMin;
		physicalMax = physicalMin;
		magicMin = magicMin;
		magicMax = magicMax;
	}
	
	public Weapon(String name, int itemLevel, int physicalMin, int physicalMax,
		      int magicMin, int magicMax, boolean legendary) {
	super(name, itemLevel, legendary);
	physicalMin = physicalMin;
	physicalMax = physicalMin;
	magicMin = magicMin;
	magicMax = magicMax;
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
	 * @return the magicMin
	 */
	public int getElementalMin() {
		return magicMin;
	}

	/**
	 * @return the magicMax
	 */
	public int getElementalMax() {
		return magicMax;
	}
	
}
