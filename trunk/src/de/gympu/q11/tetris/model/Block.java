package de.gympu.q11.tetris.model;

public class Block {
	private int xS;
	private int yS;
	private char typ;
	private int[][] steine;
	private int zaehler;
	
	public Block(int schwerPunktX, int schwerPunktY, char art) {
		xS = schwerPunktX;
		yS = schwerPunktY;
		typ = art;
		steine = new int[3][2];
		zaehler = 0;
		
		// Steine Array auffüllen
		// je nach Typ
		
		switch(art) {
			/*
			 *  X
			 * XSX
			 */
			case 'T':
				steine[0][0] = -1;	// x
				steine[0][1] = 0;	// y
				
				steine[1][0] = 0;
				steine[1][1] = -1;
				
				steine[2][0] = 1;
				steine[2][1] = 0;
			break;

			case 'I':
				steine[0][0] = 1;	// x
				steine[0][1] = 0;	// y
				
				steine[1][0] = -1;
				steine[1][1] = 0;
				
				steine[2][0] = -2;
				steine[2][1] = 0;
			break;
			
			case 'L':
				steine[0][0] = 0;	// x
				steine[0][1] = -1;	// y
				
				steine[1][0] = -1;
				steine[1][1] = 0;
				
				steine[2][0] = -2;
				steine[2][1] = 0;
			break;
			
			case 'J':
				steine[0][0] = 0;	// x
				steine[0][1] = -1;	// y
				
				steine[1][0] = 1;
				steine[1][1] = 0;
				
				steine[2][0] = 2;
				steine[2][1] = 0;
			break;
			
			case 'O':
				steine[0][0] = 1;	// x
				steine[0][1] = 0;	// y
				
				steine[1][0] = 1;
				steine[1][1] = 1;
				
				steine[2][0] = 0;
				steine[2][1] = 1;
			break;
			
			case 'Z':
				steine[0][0] = -1;	// x // 1
				steine[0][1] = 0;	// y
				
				steine[1][0] = 0;	// 2
				steine[1][1] = 1;
				
				steine[2][0] = 1;	// 3
				steine[2][1] = 1;
			break;
			
			case 'S':
				steine[0][0] = 1;	// x
				steine[0][1] = 0;	// y
				
				steine[1][0] = 0;
				steine[1][1] = 1;
				
				steine[2][0] = -1;
				steine[2][1] = 1;
			break;
			
			default:
				throw new RuntimeException("Der angegebene Stein " + art + " existiert nicht!");
		}
		
	}
	
	

    public void drehenUhrzeigersinn() {
    	
        if (typ == 'S')
    	{

        	if (zaehler == 0) {

            	  	steine[0][0] = 0;
            	  	steine[0][1] = -1;

        	  		steine[1][0] = 1;
        	  		steine[1][1] = 0;

        	  		steine[2][0] = 1;
        	  		steine[2][1] = 1;

        	  		zaehler = 1;
        	  		

              	}
        	else if (zaehler == 1) {
              		
              		steine[0][0] = 1;
    				steine[0][1] = 0;	
    				
    				steine[1][0] = 0;
    				steine[1][1] = 1;
    				
    				steine[2][0] = -1;
    				steine[2][1] = 1;

                    zaehler = 0;
                  }
           }
        
    }
	
	/*public void drehenGegenUhrzeigersinn() {
		if(typ != 'O') {	// Ein O braucht man nicht drehen
			for(int i = 0; i < steine.length; i++) {
				int save = steine[i][0];
				steine[i][0] = steine[i][1];
				steine[i][1] = -save;		// Vorzeichen tauschen beim Drehen im Uhrzeigersinn
			}
		}
	} */
	
	public void links() {
		xS--;
	}
	
	public void rechts() {
		xS++;
	}
	
	public void schrittNachUnten() {
		yS++;
	}
	
	
	public String toString() {
		return "Typ: " + typ + " S(" + xS + "/" + yS + ") - " +
				"R1(" + steine[0][0] + "/" + steine[0][1] + ") " +
				"R2(" + steine[1][0] + "/" + steine[1][1] + ") " +
				"R3(" + steine[2][0] + "/" + steine[2][1] + ") ";
	}


	public int[] getSchwerpunkt() {
		return new int[] {xS,yS};
	}


	public int[][] getSteine() {
		return steine;
	}
	
	public char getTyp() {
		return typ;
	}
	
	public int getTypInt() {
		switch(typ) {
		
		case 'T':
			return 1;

		case 'I':
			return 2;
		
		case 'L':
			return 3;
		
		case 'J':
			return 4;
		
		case 'O':
			return 5;
		
		case 'S':
			return 6;
		
		case 'Z':
			return 7;
		
		default:
			return 0;
		}
	}
	
	
}
