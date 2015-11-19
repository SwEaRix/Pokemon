package com;

public final class Game {
	private static final int WIDTH = 200;
	private static final int HEIGHT = 150;
	private static final int SCALE = 4;
	private static final String TITLE = "PukeMon";
	
	
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
	
	
	
	
	private GameFrame frame;
	private Locator locator;
	
	private Game() {
		new Initializer().start();
	}
	
	private void init() {
		//TODO hier kommt alles rein, was am start initialisiert werden soll - also rein grundlegende sachen, keine spielelemente/-inhalte
		
		this.frame = new GameFrame(Game.TITLE, Game.WIDTH*Game.SCALE, Game.HEIGHT*Game.SCALE);
		this.locator = new Locator();
	}
	
	public Locator getLocator() {
		return this.locator;
	}
	
	private class Initializer extends Thread {

		@Override
		public void run() {
			Game.this.init();
		}
	}
}
