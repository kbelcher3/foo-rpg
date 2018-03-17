package main;

public class Ranger extends Character {

	public static final int BASE_HEALTH = 160;
	public static final int BASE_MANA = 80;
	public static final int BASE_STAMINA = 80;
	public static final int BASE_STRENGTH = 20;
	public static final int BASE_DEXTERITY = 30;
	public static final int BASE_INTELLIGENCE = 10;
	public static final double BASE_ATTACK_SPEED = 1.2;
	public static final double BASE_CAST_SPEED = 0.7;
	public static final double BASE_CRIT_CHANCE = 0.2;
	public static final double BASE_CRIT_MULT = 1.75;
	
	/*
	 * 
	 */
	public Ranger(String characterName) {
		super(characterName, Ranger.BASE_HEALTH, Ranger.BASE_MANA, Ranger.BASE_STAMINA, 
				Ranger.BASE_STRENGTH, Ranger.BASE_DEXTERITY, Ranger.BASE_INTELLIGENCE,
				Ranger.BASE_ATTACK_SPEED, Ranger.BASE_CAST_SPEED, Ranger.BASE_CRIT_CHANCE,
				Ranger.BASE_CRIT_MULT);
		
		this.characterClass = "Ranger";
		//skills.add(new MagicArrow());
	}
}