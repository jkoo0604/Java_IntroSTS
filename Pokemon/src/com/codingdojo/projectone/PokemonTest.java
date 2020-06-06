package com.codingdojo.projectone;

public class PokemonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokedex pokedex = new Pokedex();
		
		Pokemon pk1 = pokedex.createPokemon("name1", 100, "type1");
		Pokemon pk2 = pokedex.createPokemon("name2", 50, "type2");
		Pokemon pk3 = pokedex.createPokemon("name3", 150, "type3");
		Pokemon pk4 = pokedex.createPokemon("name4", 100, "type4");
		Pokemon pk5 = pokedex.createPokemon("name5", 200, "type5");
		Pokemon pk6 = pokedex.createPokemon("name6", 75, "type6");
		
		pk6.attackPokemon(pk1);
		pokedex.listPokemon();
		System.out.println(pokedex.pokemonInfo(pk1));
		
		
	}

}
