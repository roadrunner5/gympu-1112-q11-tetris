package de.gympu.q11.tetris.controller;

import de.gympu.q11.tetris.model.TetrisModel;

public class TetrisController implements ViewZuController {

	private TetrisModel model= new de.gympu.q11.tetris.model.TetrisModel();
	
	
	
	public TetrisController() {
		// TODO Auto-generated constructor stub
	}
	
	public void links() {
		
	}

	@Override
	public void rechts() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unten() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drehen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tonAnAus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void halten() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void absetzen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menue() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beenden() {
		// TODO Auto-generated method stub
		
	}
	
	public void reiheLoeschen(int nummer)
	{
		int[][] feld = model.spielfeldLesen();
		int i;
		int z;
		boolean reiheLoeschen = false;
		for(i=0; i<20;i++){
			
			for(z=0; z<10; z++){
				if(feld[i][z] != 0)
				{
					reiheLoeschen=true;
				}
				else
				{
					reiheLoeschen=false;
					break;
				}
				
			}
		}
		
	}
	
}
