package main;

public class Character {
	private String characterClass;
	private final String name;
	private int health;
	private int mana;
	private int strength;
	private int dexterity;
	private int intelligence;
	private double attackSpeed;
	private double castSpeed;
	private double critChance;
	private double critMult;
	private int level;
	private int exp;
	
	/**
	 * @param health
	 * @param mana
	 * @param strength
	 * @param dexterity
	 * @param intelligence
	 * @param attackSpeed
	 * @param castSpeed
	 * @param critChance
	 * @param critMult
	 * @param level
	 * @param exp
	 */
	public Character(String characterClass, String name, int health, int mana, int strength, int dexterity, int intelligence, double attackSpeed,
			double castSpeed, double critChance, double critMult, int level, int exp) {
		this.characterClass = characterClass;
		this.name = name;
		this.health = health;
		this.mana = mana;
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
		this.attackSpeed = attackSpeed;
		this.castSpeed = castSpeed;
		this.critChance = critChance;
		this.critMult = critMult;
		this.level = level;
		this.exp = exp;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the characterClass
	 */
	public String getCharacterClass() {
		return characterClass;
	}

	/**
	 * @param characterClass the characterClass to set
	 */
	public void setCharacterClass(String characterClass) {
		this.characterClass = characterClass;
	}

	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	/**
	 * @return the mana
	 */
	public int getMana() {
		return mana;
	}

	/**
	 * @param mana the mana to set
	 */
	public void setMana(int mana) {
		this.mana = mana;
	}

	/**
	 * @return the strength
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * @param strength the strength to set
	 */
	public void setStrength(int strength) {
		this.strength = strength;
	}

	/**
	 * @return the dexterity
	 */
	public int getDexterity() {
		return dexterity;
	}

	/**
	 * @param dexterity the dexterity to set
	 */
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	/**
	 * @return the intelligence
	 */
	public int getIntelligence() {
		return intelligence;
	}

	/**
	 * @param intelligence the intelligence to set
	 */
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	/**
	 * @return the attackSpeed
	 */
	public double getAttackSpeed() {
		return attackSpeed;
	}

	/**
	 * @param attackSpeed the attackSpeed to set
	 */
	public void setAttackSpeed(double attackSpeed) {
		this.attackSpeed = attackSpeed;
	}

	/**
	 * @return the castSpeed
	 */
	public double getCastSpeed() {
		return castSpeed;
	}

	/**
	 * @param castSpeed the castSpeed to set
	 */
	public void setCastSpeed(double castSpeed) {
		this.castSpeed = castSpeed;
	}

	/**
	 * @return the critChance
	 */
	public double getCritChance() {
		return critChance;
	}

	/**
	 * @param critChance the critChance to set
	 */
	public void setCritChance(double critChance) {
		this.critChance = critChance;
	}

	/**
	 * @return the critMult
	 */
	public double getCritMult() {
		return critMult;
	}

	/**
	 * @param critMult the critMult to set
	 */
	public void setCritMult(double critMult) {
		this.critMult = critMult;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * @return the exp
	 */
	public int getExp() {
		return exp;
	}

	/**
	 * @param exp the exp to set
	 */
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
}
