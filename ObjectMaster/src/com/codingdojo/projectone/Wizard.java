package com.codingdojo.projectone;

public class Wizard extends Human {
	public Wizard() {
		super();
//		this.health = 50;
//		this.intelligence = 8;
		this.setHealth(50);
		this.setIntelligence(8);
		
	}
	
	
	public void heal(Human human) {
//		human.health+=this.intelligence;
		human.setHealth(human.getHealth()+this.getIntelligence());
	}
	
	public void fireball(Human human) {
//		human.health-= 3*this.intelligence;
		human.setHealth(human.getHealth()-(3*this.getIntelligence()));
	}
}
