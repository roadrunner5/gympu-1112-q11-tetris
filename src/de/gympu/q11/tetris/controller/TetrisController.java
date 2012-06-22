package de.gympu.q11.tetris.controller;

public class TetrisController implements ViewZuController {
	
	
	
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
		int [][] feld = de.gympu.q11.tetris.model.Spiel.getFeld();//Problem: Das Spiel muss erst erzeugt werden!!! FUNKT NICHT!
		
		int i;
		int z;
		boolean reiheLoeschen;
		for(i=0; i<20;i++){
			
			for(z=0; z<10; z++){
				if(feld[i][z] != 0 && reiheLoeschen==false)
				{
					reiheLoeschen=true;
				}
				else
				{
					reiheLoeschen=false;
				}
				
			}
		}
		
	}
	
}
