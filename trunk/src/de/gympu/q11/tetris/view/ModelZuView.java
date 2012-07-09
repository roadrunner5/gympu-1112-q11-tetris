package de.gympu.q11.tetris.view;

public interface ModelZuView {
	public void updateReihe(int reihenNummer, int[] daten);
	public void setNextStein(int[][] stein);       
	public void setGehaltenerStein(int[][] stein);
	public void setPunkte(int punkte);
}
