package de.gympu.q11.tetris.model;

public class TetrisModel implements ControllerZuModel {

	private Spiel spiel = new Spiel();

	public int[][] spielfeldLesen() {
		return spiel.getFeld().getFeld();
	}

	public int[][] aktuellerStein() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int[] positionSchwerpunktAktuellerStein() {
		return spiel.getAktuellerBlock().getSchwerpunkt();
	}

	public int aktuellerSteinSchwerpunkt() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void figurDrehen() {
		// TODO Auto-generated method stub
		
	}

	public void figurAufloesen() {
		// TODO Auto-generated method stub
		
	}

	public void figurSchrittRunter() {
		// TODO Auto-generated method stub
		
	}

	public void reiheLoeschen(int nummer) {
		// TODO Auto-generated method stub
		
	}
	
	public void links() {
		spiel.aktuellerSteinLinks();
	}



}
