package com.john.ninjas;

import java.util.ArrayList;

public class Sensei extends Ninja implements Knowledgeable {
	
	private ArrayList<String> skills;
	private String wisdom;
	
	public Sensei(String name, String someWisdom ) {
		super(name,  1000, 1000);
		this.skills = new ArrayList<String>();
		this.wisdom = someWisdom;
	}

	
//	=== GETTERS AND SETTERS ===
	public ArrayList<String> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}

	public String getWisdom() {
		return wisdom;
	}

	public void setWisdom(String wisdom) {
		this.wisdom = wisdom;
	}


	@Override
	public void drinkSake() {
		this.setHealth(this.getHealth() + 20);
		System.out.println(this.getName() + " drank some sake and gains +20 hp\n they are now at " + this.getHealth());
		
	}
	
	

}
