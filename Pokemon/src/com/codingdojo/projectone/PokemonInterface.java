package com.codingdojo.projectone;

public interface PokemonInterface {
	Pokemon createPokemon(String name, int health, String type); //creates and returns Pokemon
	String pokemonInfo(Pokemon pokemon); //returns a String with name, health, type
	void listPokemon();// list all pokemon names created so far
		
}
