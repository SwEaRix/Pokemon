package com.logic.superClass;

public class PukeMon {
	int life;
	int strenght;
	String name;
	
	Item it; // Item welches das Pokemon tragen kann 
	
	Skill sk1;
	Skill sk2;
	Skill sk3;
	Skill sk4;
	
	public PukeMon(){
		
	}

	public int getLife() {
		return this.life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getStrenght() {
		return this.strenght;
	}

	public void setStrenght(int strenght) {
		this.strenght = strenght;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Item getIt() {
		return this.it;
	}

	public void setIt(Item it) {
		this.it = it;
	}

	public Skill getSk1() {
		return this.sk1;
	}

	public void setSk1(Skill sk1) {
		this.sk1 = sk1;
	}

	public Skill getSk2() {
		return this.sk2;
	}

	public void setSk2(Skill sk2) {
		this.sk2 = sk2;
	}

	public Skill getSk3() {
		return this.sk3;
	}

	public void setSk3(Skill sk3) {
		this.sk3 = sk3;
	}

	public Skill getSk4() {
		return this.sk4;
	}

	public void setSk4(Skill sk4) {
		this.sk4 = sk4;
	}
	
	
	
}
