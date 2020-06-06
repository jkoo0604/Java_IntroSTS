package com.codingdojo.projectone;
import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {
	public static ArrayList<Pokemon> myPokemons = new ArrayList<Pokemon>();
	
	public Pokedex() {
		
	}
	
	@Override
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon newPokemon = new Pokemon(name, health, type);
		myPokemons.add(newPokemon);
		return newPokemon;
	}
	
	public void listPokemon() {
		for (int i = 0; i<myPokemons.size(); i++) {
			System.out.println(myPokemons.get(i).getName());
		}
	}
}
