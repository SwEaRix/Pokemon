package com;

public final class Game {
	private static Game instance;
	
	
	/**
	 * Erzeugt eine neue Instanz von <code>Game<code>, wenn bisher keine existiert
	 * 
	 * @return <b>true</b> wenn erfolgreich eine neue Instanz erzeugt wurde; <b>false</b> wenn nicht
	 */
	public static boolean newInstance() {
		if(Game.instance == null) {
			Game.instance = new Game();
			return true;
		}
		else {
			return false;
		}
	}
	
	public static Game instance() {
		return Game.instance;
	}
	
	private Game() {
		this.init();
	}
	
	private void init() {
		
	}
}
