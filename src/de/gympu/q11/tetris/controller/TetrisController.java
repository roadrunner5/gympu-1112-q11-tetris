package de.gympu.q11.tetris.controller;

import de.gympu.q11.tetris.model.TetrisModel;

public class TetrisController implements ViewZuController {

	private TetrisModel model = new de.gympu.q11.tetris.model.TetrisModel();
	private TaktGeber takt;
	
	
	public TetrisController() {
		this.takt = new TaktGeber(this, 1000);
	}
	
	public void links() {
		int[][] Stein=model.aktuellerStein();
		int[] SPunkt= model.positionSchwerpunktAktuellerStein();
		
		if(SPunkt[0]+Stein[0][0]>0 && SPunkt[0]+Stein[1][0]>0 && SPunkt[0]+Stein[2][0]>0)
		{
			model.links();
		}
		
	}

	public void rechts() {
		// Pr�fen ob Bewegung nach rechts m�glich
		// Dann ausf�hren
		int[][] Stein=model.aktuellerStein();
		int[] SPunkt= model.positionSchwerpunktAktuellerStein();
		
		if(SPunkt[0]+Stein[0][0]<9 && SPunkt[0]+Stein[1][0]<9 && SPunkt[0]+Stein[2][0]<9)
		{
			model.rechts();
		}
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
		
		
		
		int[][] Stein=model.aktuellerStein();
		int[] SPunkt= model.positionSchwerpunktAktuellerStein();
		
		if(SPunkt[1]+Stein[0][1]<17 && SPunkt[1]+Stein[1][1]<17 && SPunkt[1]+Stein[2][1]<17)
		{
			model.figurSchrittRunter();
		}
		else model.figurAufloesen();
	}

	public void starten() {
		takt.starten();
		
	}
	
}
