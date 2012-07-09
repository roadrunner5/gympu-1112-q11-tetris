package Testpackage;

import java.awt.Font;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import de.gympu.q11.tetris.controller.TetrisController;
import de.gympu.q11.tetris.view.TetrisKeyListener;

public class Testklasse extends JFrame {	  
    private int[][] daten;
    private TetrisController controller;
    private TetrisKeyListener keyListener;
	    JTextArea nextStein;
	    JTextArea spiel;
	public Testklasse() {
		super("Testfenster");
	
		daten = new int[20][8];
			
			
//		this.setResizable(false);
//		this.setUndecorated(true);


		de.gympu.q11.tetris.view.Zeichenpanel z = new de.gympu.q11.tetris.view.Zeichenpanel();

	
		this.getContentPane().add(z);
		this.setSize(800, 700);
		this.setLocation(100, 100);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
		
		
	
	
	public static void main(String[] a) {
		new Testklasse();
	}
    
    
    public void updateReihe(int reihenNummer, int[] daten) {
            this.daten[reihenNummer] = daten;
            update();
    }
    
    private void update() {
            String textSpielfeld = "";
            for(int i = 0; i < daten.length; i++) {
                    for(int q = 0; q < daten[i].length; q++) {
                            if(daten[i][q] == 0) textSpielfeld = textSpielfeld + " ";
                            else textSpielfeld = textSpielfeld + daten[i][q];
                    }
                    textSpielfeld += "\n";
            }
            spiel.setText(textSpielfeld);
            
    }
    
    public void setNextStein(int[][] stein) {
            // Nextstein in 1,2,3,4
            String[] next = this.nextStein.getText().split("\n");
            for(int i = 1; i < 5; i++) {
                    String line = "";
                    for(int l = 0; l < stein[i-1].length; l++) {
                            line += stein[i-1][l];
                    }
                    // line += "\n";
                    next[i] = line;
            }
            
            String right = "";
            for(int i = 0; i < next.length; i++) {
                    right += next[i] + "\n";
            }
            
            right = right.replaceAll("0", " ");
            
            this.nextStein.setText(right);          
    }
    
    public void setGehaltenerStein(int[][] stein) {
            // Nextstein in 6,7,8,9
            String[] next = this.nextStein.getText().split("\n");
            for(int i = 6; i < 10; i++) {
                    String line = "";
                    for(int l = 0; l < stein[i-6].length; l++) {
                            line += stein[i-6][l];
                    }
                    next[i] = line;
            }
            
            String right = "";
            for(int i = 0; i < next.length; i++) {
                    right += next[i] + "\n";
            }
            
            right = right.replaceAll("0", " ");
            
            this.nextStein.setText(right);          
    }
    
}
