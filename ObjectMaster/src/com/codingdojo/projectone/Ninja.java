package com.codingdojo.projectone;

public class Ninja extends Human {
	public Ninja() {
		super();
//		this.stealth = 10;
		this.setStealth(10);
	}
	
	public void steal(Human human) {
//		human.health-=this.stealth;
//		this.health+=this.stealth;
		human.setHealth(human.getHealth()-this.getStealth());
		this.setHealth(this.getHealth()+this.getStealth());
	}
	
	public void runAway() {
//		this.health-=10;
		this.setHealth(this.getHealth()-10);
	}
}
