package com.logic.trainer;

import java.util.ArrayList;

import com.logic.superClass.Item;
import com.logic.superClass.PukeMon;
import com.logic.superClass.Trainer;
import com.logic.superClass.sc;

public class TrainerTest extends Trainer{

	String name = "Maurice";
	int pokeSpace = 2;
	int pokeDollar = 0;
	
	
	ArrayList <PukeMon> pm = new ArrayList<>();
	ArrayList <Item> it = new ArrayList<>();
	
	public TrainerTest(){
		
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPokeSpace() {
		return this.pokeSpace;
	}

	public void setPokeSpace(int pokeSpace) {
		this.pokeSpace = pokeSpace;
	}

	public int getPokeDollar() {
		return this.pokeDollar;
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
		if (this.pm.size()+1 > this.pokeSpace){
			sc.fr("Leider haben sie keinen Platz mehr für " + puke.getName());
		}
		else{
			this.pm.add(puke);
			sc.fr("Glückwunsch du hast "  + puke.getName() + " deinem Rucksack hinzugefügt.");
		}
	}
	
	public void showPukeMon(){
		for (int i = 0; i < pm.size(); i++){
			sc.fr(pm.get(i).getName());
		}
	}
	
}
