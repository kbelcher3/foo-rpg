package main;

import java.util.ArrayList;

public class Character {
	protected static final int BASE_LEVEL = 1;
	protected static final int BASE_EXP = 0;
	protected static final int MAX_LEVEL = 100;
	
	protected String characterClass;
	private final String characterName;
	private int health;
	private int mana;
	private int stamina;
	private int strength;
	private int dexterity;
	private int intelligence;
	private double attackSpeed;
	private double castSpeed;
	private double critChance;
	private double critMult;
	private int level;
	private int exp;
	protected ArrayList skills;
	
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
	 * @param skills
	 */
	public Character(String name, int health, int mana, int stamina, int strength, int dexterity, int intelligence, double attackSpeed,
					 double castSpeed, double critChance, double critMult) {
		this.characterName = name;
		this.health = health;
		this.mana = mana;
		this.stamina = stamina;
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
		this.attackSpeed = attackSpeed;
		this.castSpeed = castSpeed;
		this.critChance = critChance;
		this.critMult = critMult;
		this.level = this.BASE_LEVEL;
		this.exp = this.BASE_EXP;
		this.skills = new ArrayList<Skill>();
	}

	/**
	 * @return the baseExp
	 */
	public static int getBaseExp() {
		return BASE_EXP;
	}

	/**
	 * @return the baseLevel
	 */
	public static int getBaseLevel() {
		return BASE_LEVEL;
	}

	/**
	 * @return the maxLevel
	 */
	public static int getMaxLevel() {
		return MAX_LEVEL;
	}

	/**
	 * @return the characterName
	 */
	public String getCharacterName() {
		return characterName;
	}

	/**
	 * @param skills the skills to set
	 */
	public void setSkills(ArrayList skills) {
		this.skills = skills;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return characterName;
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
	 * @return the stamina
	 */
	public int getStamina() {
		return stamina;
	}

	/**
	 * @param stamina the stamina to set
	 */
	public void setStamina(int stamina) {
		this.stamina = stamina;
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

	/**
	 * @return the skills
	 */
	public ArrayList getSkills() {
		return skills;
	}
	
	
}
