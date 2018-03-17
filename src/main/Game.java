package main;

import java.util.*;

import javax.swing.*;

import com.google.common.collect.ImmutableList;

public class Game {
	
	/*
	 * 
	 */
	public static Character createCharacter(JFrame frame) {				
		// Create character
		Character newCharacter;
		String characterName = JOptionPane.showInputDialog(frame, "Name your character.");
		
		// Select class
			
		String[] characterClasses = {"Maurader", "Ranger", "Witch"};
		
		int response = 	JOptionPane.showOptionDialog(frame, "Select your class.", "Foo-RPG",  
						JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, 
									null, characterClasses, characterClasses[0]);
				
		switch(response) {
			case 0: newCharacter = new Maurader(characterName);
			case 1: newCharacter = new Ranger(characterName);
			case 2: newCharacter = new Witch(characterName);
			default: newCharacter = new Maurader(characterName);
		}
		
		return newCharacter;
	}
	
	/*
	 * 
	 */
	public static int mainMenu() {
		return 0;
	}
	
	/*
	 * 
	 */
	public static void gameMenu() {
		
	}
	
	/*
	 * 
	 */
	public static void main(String args[]) {
		// Swing setup
		JFrame gameFrame = new JFrame("Foo-RPG");
		
		// Introduction
		JOptionPane.showMessageDialog(gameFrame, "Welcome to Foo-RPG!");
		
		// Create character
		Character mainCharacter = createCharacter(gameFrame);
		
		// Display menu
		
		
		
		
		
	}
	
}
