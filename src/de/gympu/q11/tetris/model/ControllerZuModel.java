package de.gympu.q11.tetris.model;

public interface ControllerZuModel {
	public int[][] spielfeldLesen();
	public int[][] aktuellerStein();
	public int[] positionSchwerpunktAktuellerStein();
	public int aktuellerSteinSchwerpunkt(); // 1..4 | -1 // Welcher Klotz ist Schwerpunkt
	public void figurDrehen();
	public void figurAufloesen();
	public void figurSchrittRunter();
	public void reiheLoeschen(int nummer);	// Nummer: 0 = oberste Reihe
}
