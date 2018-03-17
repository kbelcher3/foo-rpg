package main;

public class Sword extends Weapon {
	
	public Sword(String name, int itemLevel, int physicalMin, int physicalMax,
			      int elementalMin, int elementalMax) {
		super(name, itemLevel, physicalMin, physicalMax,
			       elementalMin, elementalMax);	
	}
	
	public Sword(String name, int itemLevel, int physicalMin, int physicalMax,
    int elementalMin, int elementalMax, boolean legendary) {
		super(name, itemLevel, physicalMin, physicalMax,
			      elementalMin, elementalMax, legendary);
	}
}
