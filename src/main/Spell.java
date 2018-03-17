package main;

public class Spell extends Skill {
	private int manaCost;
	
	public Spell(String spellName, int skillLevel, int manaCost) {
		super(spellName, skillLevel);
		this.manaCost = manaCost;
	}
}
