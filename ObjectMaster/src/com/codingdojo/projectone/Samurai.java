package com.codingdojo.projectone;

public class Samurai extends Human {
	private static int count = 0;
	public Samurai() {
		super();
//		this.health = 200;
		this.setHealth(200);
		count++;
//		System.out.println(count);
	}
	
	public void dealthBlow(Human human) {
//		human.health=0;
//		this.health = this.health/2;
		human.setHealth(0);
		this.setHealth(this.getHealth()/2);
	}
	
	public void meditate() {
//		this.health += this.health/2;
		this.setHealth(this.getHealth()+(this.getHealth()/2));
	}
	
	public static int howMany() {
		
		return count;
	}
}
