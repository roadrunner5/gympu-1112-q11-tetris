package de.gympu.q11.tetris.model;

public interface ControllerZuModel {
	public int[][] spielfeldLesen();
	public int[][] aktuellerStein();
	public int[] positionSchwerpunktAktuellerStein();
	public void steinGegenUhrzeigerSinnDrehen();
	public void steinImUhrzeigerSinnDrehen();
	public void figurAufloesen();
	public void figurSchrittRunter();
	public void reiheLoeschen(int nummer);	// Nummer: 0 = oberste Reihe
}