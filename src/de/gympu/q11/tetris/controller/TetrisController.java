package de.gympu.q11.tetris.controller;

import de.gympu.q11.tetris.model.TetrisModel;

public class TetrisController implements ViewZuController {

	private TetrisModel model = new de.gympu.q11.tetris.model.TetrisModel();
	private TaktGeber takt;
	
	
	public TetrisController() {
		this.takt = new TaktGeber(this, 1000);
	}
	
	public void links() {
		model.links();
	}

	public void rechts() {
		// Prüfen ob Bewegung nach rechts möglich
		// Dann ausführen
		model.rechts();
	}

	public void unten() {
		
	}

	public void uhrzeigerSinnDrehen() {
		
	}
	
	public void gegenUhrzeigerSinnDrehen() {
		this.model.steinGegenUhrzeigerSinnDrehen();
	}

	public void pause() {
		if(this.takt.isRunning()) {
			this.takt.stoppen();
		} else {
			this.takt.starten();
		}
	}

	public void tonAnAus() {
		
	}

	public void halten() {
		
	}

	public void absetzen() {
		
	}

	public void menue() {
		// TODO Auto-generated method stub
		
	}

	public void beenden() {
		takt.stoppen();
	}
	
	public TetrisModel getModel() {
		return model;
	}

	public void takt() {
		// Stein nach unten bewegen
		model.figurSchrittRunter();
	}

	public void starten() {
		takt.starten();
		
	}
	
}
