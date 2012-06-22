package de.gympu.q11.tetris.model;

public class Block {
	private int xS;
	private int yS;
	private char typ;
	private int[][] steine;
	
	public Block(int sX, int sY, char art) {
		xS = sX;
		yS = sY;
		typ = art;
		steine = new int[3][2];
		
		// Steine Array auffüllen
		// je nach Typ
		
		switch(art) {
			/*
			 *  X
			 * XSX
			 */
			case 'T':
				steine[0][0] = 0;	// x
				steine[0][1] = -1;	// y
				
				steine[1][0] = 1;
				steine[1][1] = 0;
				
				steine[2][0] = -1;
				steine[2][1] = 0;
			break;
			/*
			 * XSXX
			 */
			case 'I':
				//
			break;
			
			default:
			break;
		}
		
	}
	
	
	public void drehenUhrzeigersinn() {
		System.out.println(this);
	}
	
	public void drehenGegenUhrzeigersinn() {
		
	}
	
	public void links() {
		xS--;
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
	
}
