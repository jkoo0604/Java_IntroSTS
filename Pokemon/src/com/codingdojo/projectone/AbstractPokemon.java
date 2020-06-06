package com.codingdojo.projectone;

public abstract class AbstractPokemon implements PokemonInterface {
	//createPokemon
//	public abstract Pokemon createPokemon(String name, int health, String type);
	
	
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon newPokemon = new Pokemon(name, health, type);
		return newPokemon;
	}
	
	//pokemonInfo(Pokemon pokemon)
	public String pokemonInfo(Pokemon pokemon) {
		String info = pokemon.getName().concat(" - ".concat(pokemon.getType().concat(", ".concat(String.valueOf(pokemon.getHealth())))));
		return info;
	}
}