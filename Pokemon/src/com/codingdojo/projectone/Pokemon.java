package com.codingdojo.projectone;

public class Pokemon {
	private String name;
	private int health;
	private String type;
	private static int count = 0;
	
	public Pokemon(String name, int health, String type) {
		count++;
		this.setName(name);
		this.setHealth(health);
		this.setType(type);
	}
	
	
	
	public void attackPokemon(Pokemon pokemon) {
		// lowers the attacked Pokemon's health by 10
		pokemon.setHealth(pokemon.getHealth()-10);
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getHealth() {
		return health;
	}



	public void setHealth(int health) {
		this.health = health;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}
	
	
}
