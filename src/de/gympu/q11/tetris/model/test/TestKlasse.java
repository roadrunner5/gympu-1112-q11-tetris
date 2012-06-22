package de.gympu.q11.tetris.model.test;

import de.gympu.q11.tetris.model.Block;
import de.gympu.q11.tetris.model.TetrisModel;

public class TestKlasse {


	public static void main(String[] args) {
		TetrisModel m = new TetrisModel();
		
		System.out.println(m.positionSchwerpunktAktuellerStein()[0]);
		System.out.println(m.positionSchwerpunktAktuellerStein()[1]);
		
		System.out.println("Schiebe links");
		
		m.links();
		m.links();

		
		System.out.println(m.positionSchwerpunktAktuellerStein()[0]);
		System.out.println(m.positionSchwerpunktAktuellerStein()[1]);
		
	}

}
