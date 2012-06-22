package de.gympu.q11.tetris.model;

public class Spielfeld {
	private int[][] feld;
	
	public Spielfeld() {
		feld = new int[20][10];
	}

	public int[][] getFeld() {
		return feld;
	}

}
