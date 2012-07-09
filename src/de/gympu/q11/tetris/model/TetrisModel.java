package de.gympu.q11.tetris.model;

import de.gympu.q11.tetris.view.TetrisView;

public class TetrisModel implements ControllerZuModel {

	private Spiel spiel = new Spiel();
	private TetrisView view;
	
	public int[][] spielfeldLesen() {
		return spiel.getFeld().getFeld();
	}

	/**
	 * Liest die Position der Steine um den Schwerpunkt aus.
	 */
	public int[][] aktuellerStein() {
		return spiel.getAktuellerBlock().getSteine();
	}
	
	public int[] positionSchwerpunktAktuellerStein() {
		return spiel.getAktuellerBlock().getSchwerpunkt();
	}

	public void steinGegenUhrzeigerSinnDrehen() {
		this.spiel.getAktuellerBlock().drehenUhrzeigersinn();		
		spiel.update(-1);
	}
	
	public void steinImUhrzeigerSinnDrehen() {
		this.spiel.getAktuellerBlock().drehenUhrzeigersinn();
		spiel.update(-1);
	}

	public void figurAufloesen() {
		spiel.aktuellenSteinAufloesen();
	}

	public void figurSchrittRunter() {
		spiel.getAktuellerBlock().schrittNachUnten();
		spiel.update(-1);
	}

	public void reiheLoeschen(int nummer) {
		// TODO Auto-generated method stub
		
	}
	
	public void links() {
		spiel.aktuellerSteinLinks();
		spiel.update(-1);
	}
	
	public void setView(TetrisView view) {
		this.view = view;
		this.spiel.setView(view);
	}

	public void rechts() {
		spiel.aktuellerSteinRechts();
		spiel.update(-1);
	}
	
	public void reiheLoeschen1(int y)
	{
		spiel.getFeld().reiheLoeschenSpielfeld(y);
	}



}
