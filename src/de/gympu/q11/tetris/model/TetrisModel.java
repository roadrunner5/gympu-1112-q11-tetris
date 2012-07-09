package de.gympu.q11.tetris.model;

import de.gympu.q11.tetris.view.TetrisView;

public class TetrisModel implements ControllerZuModel {

	private Spiel spiel = new Spiel();
	private TetrisView view;
	private int[][] iSteine;
	private int iZaehler;
	private char iTyp;
	private int iXS;
	
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
	
	public void reiheLoeschen(int y)
	{
		spiel.getFeld().reiheLoeschenSpielfeld(y);
	}

	public void setPunkte(int punkte)
	{
		spiel.setPunkteSpiel(punkte);
	}
	
	public int getPunkte()
	{
		return spiel.getPunkteSpiel();
	}

    public void iDrehenUhrzeigersinn() {
        
        if (iTyp == 'S')
        {

            if (iZaehler == 0) {

                      iSteine[0][0] = 0;
                      iSteine[0][1] = -1;

                      iSteine[1][0] = 1;
                      iSteine[1][1] = 0;

                      iSteine[2][0] = 1;
                      iSteine[2][1] = 1;

                      iZaehler = 1;
                      
                      return spiel.getFeld().xS;
            		  return spiel.getFeld().yS;
                  }
            else if (iZaehler == 1) {
                     
                    iSteine[0][0] = 1;
                    iSteine[0][1] = 0;   
                   
                    iSteine[1][0] = 0;
                    iSteine[1][1] = 1;
                   
                    iSteine[2][0] = -1;
                    iSteine[2][1] = 1;

                    iZaehler = 0;
                  }
           }
       
        if (iTyp == 'Z')
        {

            if (iZaehler == 0) {

                      iSteine[0][0] = 0;
                      iSteine[0][1] = -1;

                      iSteine[1][0] = -1;
                      iSteine[1][1] = 0;

                      iSteine[2][0] = -1;
                      iSteine[2][1] = 1;

                      iZaehler = 1;
                  }
            else if (iZaehler == 1) {
                     
                      iSteine[0][0] = -1;
                      iSteine[0][1] = 0;   
                   
                      iSteine[1][0] = 0;
                      iSteine[1][1] = 1;
                   
                      iSteine[2][0] = 1;
                      iSteine[2][1] = 1;

                      iZaehler = 0;
                  }
           }
       
        if (iTyp == 'I')
        {

            if (iZaehler == 0) {

                      iSteine[0][0] = 0;
                      iSteine[0][1] = 1;

                      iSteine[1][0] = 0;
                      iSteine[1][1] = -1;

                      iSteine[2][0] = 0;
                      iSteine[2][1] = -2;

                      iZaehler = 1;
                  }
            else if (iZaehler == 1) { 
                     
                      iSteine[0][0] = 1;
                      iSteine[0][1] = 0;   
                   
                      iSteine[1][0] = -1;
                      iSteine[1][1] = 0;
                   
                      iSteine[2][0] = -2;
                      iSteine[2][1] = 0;

                      iZaehler = 0;
                  }
           }
       
        if (iTyp == 'L')
        {

            if (iZaehler == 0) {

            		iSteine[0][0] = 1;
            		iSteine[0][1] = 0;

            		iSteine[1][0] = 0;
            		iSteine[1][1] = -1;

            		iSteine[2][0] = 0;
            		iSteine[2][1] = -2;
            		
            		iXS--;

            		iZaehler = 1;
                  }
            else if (iZaehler == 1) {
                     
            		iSteine[0][0] = 0;
                    iSteine[0][1] = 1;   
                   
                    iSteine[1][0] = 1;
                    iSteine[1][1] = 0;
                   
                    iSteine[2][0] = 2;
                    iSteine[2][1] = 0;
                    
                    iXS--;

                    iZaehler = 2;
                  }
            else if (iZaehler == 2) {
                 
                    iSteine[0][0] = -1;
                    iSteine[0][1] = 0;   
               
                    iSteine[1][0] = 0;
                    iSteine[1][1] = 1;
               
                    iSteine[2][0] = 0;
                    iSteine[2][1] = 2;
                    
                    iXS++;

                    iZaehler = 3;
              }
            else if (iZaehler == 3) {
                 
            		iSteine[0][0] = 0;
            		iSteine[0][1] = -1;   
               
            		iSteine[1][0] = -1;
            		iSteine[1][1] = 0;
   
            		iSteine[2][0] = -2;
            		iSteine[2][1] = 0;
            		
            		iXS++;

            		iZaehler = 0;
              }
           }
        
        if (iTyp == 'J')
        {

            if (iZaehler == 0) {

            		iSteine[0][0] = 1;
            		iSteine[0][1] = 0;

            		iSteine[1][0] = 0;
            		iSteine[1][1] = 1;

            		iSteine[2][0] = 0;
            		iSteine[2][1] = 2;
            		
            		iXS++;

            		iZaehler = 1;
                  }
            else if (iZaehler == 1) {
                     
            		iSteine[0][0] = 0;
                    iSteine[0][1] = 1;   
                   
                    iSteine[1][0] = -1;
                    iSteine[1][1] = 0;
                   
                    iSteine[2][0] = -2;
                    iSteine[2][1] = 0;
                    
                    iXS++;

                    iZaehler = 2;
                  }
            else if (iZaehler == 2) {
                 
                    iSteine[0][0] = -1;
                    iSteine[0][1] = 0;   
               
                    iSteine[1][0] = 0;
                    iSteine[1][1] = -1;
               
                    iSteine[2][0] = 0;
                    iSteine[2][1] = -2;
                    
                    iXS--;

                    iZaehler = 3;
              }
            else if (iZaehler == 3) {
                 
            		iSteine[0][0] = 0;
            		iSteine[0][1] = -1;   
               
            		iSteine[1][0] = 1;
            		iSteine[1][1] = 0;
   
            		iSteine[2][0] = 2;
            		iSteine[2][1] = 0;
            		
            		iXS--;

            		iZaehler = 0;
              }
           }
        
        if (iTyp == 'T')
        {

            if (iZaehler == 0) {

            		iSteine[0][0] = 0;
            		iSteine[0][1] = -1;

            		iSteine[1][0] = 1;
            		iSteine[1][1] = 0;

            		iSteine[2][0] = 0;
            		iSteine[2][1] = 1;

            		iZaehler = 1;
                  }
            else if (iZaehler == 1) {
                     
            		iSteine[0][0] = 1;
                    iSteine[0][1] = 0;   
                   
                    iSteine[1][0] = 0;
                    iSteine[1][1] = 1;
                   
                    iSteine[2][0] = -1;
                    iSteine[2][1] = 0;

                    iZaehler = 2;
                  }
            else if (iZaehler == 2) {
                 
                    iSteine[0][0] = 0;
                    iSteine[0][1] = 1;   
               
                    iSteine[1][0] = -1;
                    iSteine[1][1] = 0;
               
                    iSteine[2][0] = 0;
                    iSteine[2][1] = -1;

                    iZaehler = 3;
              }
            else if (iZaehler == 3) {
                 
            		iSteine[0][0] = -1;
            		iSteine[0][1] = 0;   
               
            		iSteine[1][0] = 0;
            		iSteine[1][1] = -1;
   
            		iSteine[2][0] = 1;
            		iSteine[2][1] = 0;

            		iZaehler = 0;
              }
           }  
    }
}