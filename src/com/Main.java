package com;

import com.logic.pukeMon.PukeMon1;
import com.logic.pukeMon.PukeMon2;
import com.logic.superClass.Trainer;
import com.logic.trainer.TrainerTest;

public class Main {

	public static void main(String[] args) {
		//Game.newInstance();
		TrainerTest mo = new TrainerTest();
		
		PukeMon1 puke1 = new PukeMon1();
		PukeMon2 puke2 = new PukeMon2();
		
		mo.addPukeMon(puke1);
		mo.addPukeMon(puke2);
		mo.addPukeMon(puke2);
		
		mo.showPukeMon();
		
	}
}
