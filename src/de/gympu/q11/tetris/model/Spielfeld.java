package de.gympu.q11.tetris.model;

import de.gympu.q11.tetris.view.TetrisView;

public class Spielfeld {
	private int[][] feld;
	private TetrisView view;
	
	public Spielfeld() {
		feld = new int[20][10];
	}

	public int[][] getFeld() {
		return feld;
	}
	
	public void updateReihe(int reihe, int[] data) {
		this.feld[reihe] = data;
		view.updateReihe(reihe, data);
	}
	
	public int[] getReihe(int reihe) {
		return feld[reihe];
	}

	public void setView(TetrisView view) {
		this.view = view;
	}

}
