package com.codingdojo.projectone;

public class Mammal {

	public int energyLevel;
	
	public Mammal() {
		this.energyLevel = 100;
	}
	
	public Mammal(int num) {
		this.energyLevel = num;
	}
	
	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}
	
	
}
