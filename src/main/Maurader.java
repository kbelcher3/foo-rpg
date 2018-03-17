package main;

public class Maurader extends Character {

	public static final int BASE_HEALTH = 200;
	public static final int BASE_MANA = 50;
	public static final int BASE_STAMINA = 100;
	public static final int BASE_STRENGTH = 30;
	public static final int BASE_DEXTERITY = 20;
	public static final int BASE_INTELLIGENCE = 10;
	public static final double BASE_ATTACK_SPEED = 1.0;
	public static final double BASE_CAST_SPEED = 0.5;
	public static final double BASE_CRIT_CHANCE = 0.1;
	public static final double BASE_CRIT_MULT = 1.5;
	
	public Maurader(String characterName) {
		super(characterName, Maurader.BASE_HEALTH, Maurader.BASE_MANA, Maurader.BASE_STAMINA, 
				Maurader.BASE_STRENGTH, Maurader.BASE_DEXTERITY, Maurader.BASE_INTELLIGENCE,
				Maurader.BASE_ATTACK_SPEED, Maurader.BASE_CAST_SPEED, Maurader.BASE_CRIT_CHANCE,
				Maurader.BASE_CRIT_MULT);
		
		this.characterClass = "Maurader";
		//skills.add(new Bash());
	}

		

	
	
}
