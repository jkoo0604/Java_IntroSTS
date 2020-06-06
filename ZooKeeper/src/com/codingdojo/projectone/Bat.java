package com.codingdojo.projectone;

public class Bat extends Mammal {
	
	public Bat() {
		this.energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("Sound of flying");
		this.energyLevel-=50;
	}
	
	public void eatHumans() {
		System.out.println("Sound of humans being eaten");
		this.energyLevel+=25;
	}
	
	public void attackTown() {
		System.out.println("Sound of towns being attacked");
		this.energyLevel-=100;
	}
}
