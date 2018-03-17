package main;

public class Skill {
	private final String skillName;
	private int skillLevel;
	
	/**
	 * @param name
	 * @param skillLevel
	 */
	public Skill(String skillName, int skillLevel) {
		this.skillName = skillName;
		this.skillLevel = skillLevel;
	}

	/**
	 * @return the skillLevel
	 */
	public int getSkillLevel() {
		return skillLevel;
	}

	/**
	 * @param skillLevel the skillLevel to set
	 */
	public void setSkillLevel(int skillLevel) {
		this.skillLevel = skillLevel;
	}

	/**
	 * @return the name
	 */
	public String getskillName() {
		return skillName;
	}
}
