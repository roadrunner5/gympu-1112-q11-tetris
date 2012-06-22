package de.gympu.q11.tetris.model;

public class Spiel {
	private Spielfeld feld;
	private Block aktuellerBlock;
	
	public Spiel() {
		setFeld(new Spielfeld());
		setAktuellerBlock(new Block(5, 4, 'T'));
	}

	public Spielfeld getFeld() {
		return feld;
	}

	public void setFeld(Spielfeld feld) {
		this.feld = feld;
	}

	public Block getAktuellerBlock() {
		return aktuellerBlock;
	}

	public void setAktuellerBlock(Block aktuellerBlock) {
		this.aktuellerBlock = aktuellerBlock;
	}
	
	public void aktuellerSteinLinks() {
		aktuellerBlock.links();
	}

}
