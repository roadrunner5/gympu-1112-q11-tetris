package de.gympu.q11.tetris.controller;

import de.gympu.q11.tetris.model.TetrisModel;

public class TetrisController implements ViewZuController {

	private TetrisModel model = new de.gympu.q11.tetris.model.TetrisModel();
	private TaktGeber takt;
	private boolean aufgeloest;
	
	
	public TetrisController() {
		this.takt = new TaktGeber(this, 1000);
	}
	
	public void links() {
		int[][] Stein=model.aktuellerStein();
		int[] SPunkt= model.positionSchwerpunktAktuellerStein();
		int[][] feld= model.spielfeldLesen();
		
		
		if(SPunkt[0]+Stein[0][0]>0 && SPunkt[0]+Stein[1][0]>0 && SPunkt[0]+Stein[2][0]>0 && SPunkt[0]>0 && feld[SPunkt[1]+Stein[0][1]][SPunkt[0]+Stein[0][0]-1]==0 && feld[SPunkt[1]+Stein[1][1]][SPunkt[0]+Stein[1][0]-1]==0 && feld[SPunkt[1]+Stein[2][1]][SPunkt[0]+Stein[2][0]-1]==0 && feld[SPunkt[1]][SPunkt[0]-1]==0)
		{
			model.links();
		}
		
	}

	public void rechts() {
		// Prüfen ob Bewegung nach rechts möglich
		// Dann ausführen
		int[][] Stein=model.aktuellerStein();
		int[] SPunkt= model.positionSchwerpunktAktuellerStein();
		int[][] feld= model.spielfeldLesen();
		
		if(SPunkt[0]+Stein[0][0]<9 && SPunkt[0]+Stein[1][0]<9 && SPunkt[0]+Stein[2][0]<9 && SPunkt[0]<9 && feld[SPunkt[1]+Stein[0][1]][SPunkt[0]+Stein[0][0]+1]==0 && feld[SPunkt[1]+Stein[1][1]][SPunkt[0]+Stein[1][0]+1]==0 && feld[SPunkt[1]+Stein[2][1]][SPunkt[0]+Stein[2][0]+1]==0 && feld[SPunkt[1]][SPunkt[0]+1]==0)
		{
			model.rechts();
		}
	}

	public void unten() {
		takt();
	}

	public void uhrzeigerSinnDrehen() {
	}
	
	public void gegenUhrzeigerSinnDrehen() {
		//steinGegenUhrzeigerSinnDrehen
		this.model.steinImUhrzeigerSinnDrehen();
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
		int[][] Stein=model.aktuellerStein();
		int[] SPunkt= model.positionSchwerpunktAktuellerStein();
		int[][] feld= model.spielfeldLesen();
		while(SPunkt[1]+Stein[0][1]<17 && SPunkt[1]+Stein[1][1]<17 && SPunkt[1]+Stein[2][1]<17 && SPunkt[1]<17 && feld[SPunkt[1]+Stein[0][1]+1][SPunkt[0]+Stein[0][0]]==0 && feld[SPunkt[1]+Stein[1][1]+1][SPunkt[0]+Stein[1][0]]==0 && feld[SPunkt[1]+Stein[2][1]+1][SPunkt[0]+Stein[2][0]]==0 && feld[SPunkt[1]+1][SPunkt[0]]==0)
		{
			if(aufgeloest==false) takt();
			else break;
			
		}
		
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
		int[][] feld= model.spielfeldLesen();
		
		
		
		if(SPunkt[1]+Stein[0][1]<17 && SPunkt[1]+Stein[1][1]<17 && SPunkt[1]+Stein[2][1]<17 && SPunkt[1]<17 && feld[SPunkt[1]+Stein[0][1]+1][SPunkt[0]+Stein[0][0]]==0 && feld[SPunkt[1]+Stein[1][1]+1][SPunkt[0]+Stein[1][0]]==0 && feld[SPunkt[1]+Stein[2][1]+1][SPunkt[0]+Stein[2][0]]==0 && feld[SPunkt[1]+1][SPunkt[0]]==0)
		{
			model.figurSchrittRunter();
			aufgeloest=false;
		}
		else 
		{
			aufgeloest=true;
			model.figurAufloesen();
			ReiheLoeschen();
			
		}
	}

	public void starten() {
		takt.starten();
		
	}
	
	public boolean aufgeloest()
	{
		return aufgeloest;
	}
	
	public void ReiheLoeschen()
	{
		int[][] feld= model.spielfeldLesen();
		boolean loeschen = false;

		for(int y=0; y<20; y++){
			loeschen = false;
			for(int x=0; x<10; x++){
				if(feld[y][x] == 0) 
				{
					loeschen = false;
					break;
				}
				else loeschen=true;
			}
			if(loeschen==true) 
				{
				model.reiheLoeschen(y);
				System.out.println("Loeschen"+y);
				}
		}
	}
	
	public void PunkteZaehler()
	{
		model.setPunkte(model.getPunkte()+1000);
	}
	
	
}
