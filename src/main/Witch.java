package main;

public class Witch extends Character {

	public static final int BASE_HEALTH = 120;
	public static final int BASE_MANA = 200;
	public static final int BASE_STAMINA = 20;
	public static final int BASE_STRENGTH = 10;
	public static final int BASE_DEXTERITY = 20;
	public static final int BASE_INTELLIGENCE = 30;
	public static final double BASE_ATTACK_SPEED = 0.8;
	public static final double BASE_CAST_SPEED = 1.0;
	public static final double BASE_CRIT_CHANCE = 0.1;
	public static final double BASE_CRIT_MULT = 1.5;
	
	public Witch(String characterName) {
		super(characterName, Witch.BASE_HEALTH, Witch.BASE_MANA, Witch.BASE_STAMINA, 
				Witch.BASE_STRENGTH, Witch.BASE_DEXTERITY, Witch.BASE_INTELLIGENCE,
				Witch.BASE_ATTACK_SPEED, Witch.BASE_CAST_SPEED, Witch.BASE_CRIT_CHANCE,
				Witch.BASE_CRIT_MULT);
		
		this.characterClass = "Witch";
		//skills.add(new MagicMissile());
	}

}
