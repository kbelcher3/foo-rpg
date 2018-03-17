package main;

public class Axe extends Weapon {
	
	public Axe(String name, int itemLevel, int physicalMin, int physicalMax,
			      int elementalMin, int elementalMax) {
		super(name, itemLevel, physicalMin, physicalMax,
			       elementalMin, elementalMax);	
	}
	
	public Axe(String name, int itemLevel, int physicalMin, int physicalMax,
    int elementalMin, int elementalMax, boolean legendary) {
		super(name, itemLevel, physicalMin, physicalMax,
			      elementalMin, elementalMax, legendary);
	}
}
