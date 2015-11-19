package com.logic.superClass;

import java.util.ArrayList;

public class Trainer {

	String name;
	int pokeSpace;
	int pokeDollar;
	
	
	ArrayList <PukeMon> pm = new ArrayList<>();
	ArrayList <Item> it = new ArrayList<>();
	
	public Trainer(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPokeSpace() {
		return pokeSpace;
	}

	public void setPokeSpace(int pokeSpace) {
		this.pokeSpace = pokeSpace;
	}

	public int getPokeDollar() {
		return pokeDollar;
	}

	public void setPokeDollar(int pokeDollar) {
		this.pokeDollar = pokeDollar;
	}
	/**
	 *add PukeMon zum array für die aktuellen Pukemons
	 *
	 *TODO wenn kein Platz mehr was dann ? 
	 *SwEaRix
	 */
	public void addPukeMon(PukeMon puke){
		if (pm.size()+1 > this.pokeSpace){
			sc.fr("Leider haben sie keinen Platz mehr");
		}
		else{
			pm.add(puke);
			sc.fr("Glückwunsch du hast "  + puke.getName() + " deinem Rucksack hinzugefügt.");
		}
	}
	
}
