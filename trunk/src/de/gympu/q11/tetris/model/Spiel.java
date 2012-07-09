package de.gympu.q11.tetris.model;

import java.util.Random;

import javax.swing.JOptionPane;

import de.gympu.q11.tetris.starter.GymPuTetris;
import de.gympu.q11.tetris.view.TetrisView;

public class Spiel {
	private Spielfeld feld;
	private Block aktuellerBlock;
	private Block naechsterBlock;
	private Block gehaltenerBlock;
	private int punkte;
	private int level;
	private String spielerName;
	
	private TetrisView view;
	
	public Spiel() {
		feld = new Spielfeld();
		aktuellerBlock = randNextBlock();
		naechsterBlock = randNextBlock();
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
	
	public void aktuellerSteinRechts() {
		aktuellerBlock.rechts();
	}
	
	public void aktuellenSteinAufloesen() {
		// Aktuellen Stein im Spielfeld verankern.
		
		int[] schwerPunktReihe = feld.getReihe(aktuellerBlock.getSchwerpunkt()[1]);
		schwerPunktReihe[aktuellerBlock.getSchwerpunkt()[0]] = aktuellerBlock.getTypInt();
		feld.updateReihe(aktuellerBlock.getSchwerpunkt()[1], schwerPunktReihe);
		
		int[] schwerpunkt = aktuellerBlock.getSchwerpunkt();
		int[][] steine = aktuellerBlock.getSteine();
		int typ = aktuellerBlock.getTypInt();
		
		for(int i = 0; i < steine.length; i++) {
			int[] reihe = feld.getReihe(schwerpunkt[1] + steine[i][1]);
			reihe[schwerpunkt[0]+steine[i][0]] = typ;
			feld.updateReihe(schwerpunkt[1] + steine[i][1], reihe);
		}
		
		// nächsten Stein als aktuellen setzen.
		aktuellerBlock = naechsterBlock;
		
		// Neuen nächsten Stein berechnen.
		naechsterBlock = randNextBlock();
		
		// Und der View mitteilen
		naechstenSteinAnViewSenden();

	}
	
	private Block randNextBlock() {
		if(GymPuTetris.isDebug) {
			String[] types = new String[] {
					"I","J","L","O","S","T","Z"
			};
			
			Object block = JOptionPane.showInputDialog(null,
                    "Nächsten Stein auswählen",
                    "Nächster Stein",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    types,
                    "I");
			
			String b = (String) block;
			
			return new Block(feld.getFeld()[0].length / 2, 0, b.charAt(0));
			
                            
		}
		else {
			char[] types = new char[] {
					'I','J','L','O','S','T','Z'
			};
			
			Random r = new Random();
			int index = r.nextInt(types.length);
			
			return new Block(feld.getFeld()[0].length / 2, 0, types[index]);
		}
	}

	public void setView(TetrisView view) {
		this.view = view;
		this.feld.setView(view);
		naechstenSteinAnViewSenden();
	}
	
	private void naechstenSteinAnViewSenden() {
		int[][] stein = new int[4][4];
		
		stein[1][1] = naechsterBlock.getTypInt();
		for(int i = 0; i < 3; i++) {
			stein[naechsterBlock.getSteine()[i][0]+1][naechsterBlock.getSteine()[i][1]+1] = naechsterBlock.getTypInt();
		}
		
		view.setNextStein(stein);
	}
	
	public void update(int initialUpdateRow) {
		int[][] dataFeld = feld.getFeld();
		int[][] data = new int[20][10];
		
		
		for(int i = 0; i < data.length; i++) {
			for(int z = 0; z < data[i].length; z++) {
				data[i][z] = dataFeld[i][z];
			}
		}
		
	
		// aktuellen Stein rein packen
		int xS = aktuellerBlock.getSchwerpunkt()[0];
		int yS = aktuellerBlock.getSchwerpunkt()[1];
		
		data[yS][xS] = aktuellerBlock.getTypInt();
		int[][] steine = aktuellerBlock.getSteine();
		
		for(int i = 0; i < 3; i++) {
			data[yS+steine[i][1]][xS+steine[i][0]] = aktuellerBlock.getTypInt();
		}
		
		if(initialUpdateRow == -1) {
			// Gesamtes Spielfeld senden
			int[][] dataField = data;
			
			for(int i = 0; i < dataField.length; i++) {
				this.view.updateReihe(i, dataField[i]);
			}
		}
		
	}
	


}
