package main;

public class Bash extends Attack {
	private static final String baseAttackName = "Bash";
	private static final int baseSkillLevel = 1;
	private static final int baseStaminaCost = 1;
	
	public Bash() {
		super(baseAttackName, baseSkillLevel, baseStaminaCost);
	}
	
	/**
	 * 
	 * @param attackName
	 * @param skillLevel
	 * @param staminaCost
	 */
	public Bash(String attackName, int skillLevel, int staminaCost) {
		super(baseAttackName, skillLevel, staminaCost);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the baseattackname
	 */
	public static String getBaseattackname() {
		return baseAttackName;
	}

	/**
	 * @return the baseskilllevel
	 */
	public static int getBaseskilllevel() {
		return baseSkillLevel;
	}

	/**
	 * @return the basestaminacost
	 */
	public static int getBasestaminacost() {
		return baseStaminaCost;
	}

}
