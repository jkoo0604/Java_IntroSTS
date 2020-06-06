package com.codingdojo.projectone;

public class Gorilla extends Mammal {
	
	
	public void throwSomething() {
		System.out.println("Gorilla has thrown something");
		this.energyLevel-=5;
	}
	
	public void eatBananas() {
		System.out.println("Gorilla has eaten a banana");
		this.energyLevel+=10;
	}
	
	public void climb() {
		System.out.println("Gorilla has climbed a tree");
		this.energyLevel-=10;
	}
}
