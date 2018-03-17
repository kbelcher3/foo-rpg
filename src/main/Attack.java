package main;

public class Attack extends Skill {
	private int staminaCost;
	
	/**
	 * @param skillName
	 * @param skillLevel
	 */
	public Attack(String attackName, int skillLevel, int staminaCost) {
		super(attackName, skillLevel);
		this.staminaCost = staminaCost;
	}

	/**
	 * @return the staminaCost
	 */
	public int getStaminaCost() {
		return staminaCost;
	}

	/**
	 * @param staminaCost the staminaCost to set
	 */
	public void setStaminaCost(int staminaCost) {
		this.staminaCost = staminaCost;
	}


	
}
