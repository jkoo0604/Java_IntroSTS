package com.codingdojo.projectone;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Human human1 = new Human();
//		Human human2 = new Human();
//		System.out.println(human1.strength);
//		human1.attack(human2);
//		System.out.println(human2.health);
		
		Wizard wiz1 = new Wizard(); // strength: 3, intelligence: 8, stealth: 3, health: 50 
		Wizard wiz2 = new Wizard(); // strength: 3, intelligence: 8, stealth: 3, health: 50
		Wizard wiz3 = new Wizard(); // strength: 3, intelligence: 8, stealth: 3, health: 50-10
		Samurai sam1 = new Samurai(); // strength: 3, intelligence: 3, stealth: 3, health: 200-24+8
		Samurai sam2 = new Samurai(); // strength: 3, intelligence: 3, stealth: 3, health: 200+100
		Samurai sam3 = new Samurai(); // strength: 3, intelligence: 3, stealth: 3, health: 200-100
		Samurai sam4 = new Samurai(); // strength: 3, intelligence: 3, stealth: 3, health: 200
		Ninja nin1 = new Ninja(); // strength: 3, intelligence: 3, stealth: 10, health: 100+10
		Ninja nin2 = new Ninja(); // strength: 3, intelligence: 3, stealth: 10, health: 100-10->0
		wiz2.fireball(sam1);
		nin1.steal(wiz3);
		nin2.runAway();
		wiz1.heal(sam1);
		sam3.dealthBlow(nin2);
		sam2.meditate();
		wiz1.displayLevel();
		wiz2.displayLevel();
		wiz3.displayLevel();
		sam1.displayLevel();
		sam2.displayLevel();
		sam3.displayLevel();
		sam4.displayLevel();
		nin1.displayLevel();
		nin2.displayLevel();
		System.out.println(Samurai.howMany());		

	}

}
