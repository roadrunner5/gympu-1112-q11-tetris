package Testpackage;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import de.gympu.q11.tetris.view.TetrisView;

public class Zeichenpanel extends JPanel {
	
	private BufferedImage roterStein, Tetris;
	
	private int[][] naechsterStein;
	
	
	private int[][] spielfeld;
	
	public Zeichenpanel() {
		spielfeld = new int[20][10];
		try {
			roterStein = ImageIO.read(new File("roterStein.jpg"));
			Tetris = ImageIO.read(new File("Tetris.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void paint(Graphics g) {
		
		// Hintergrund zeichnen
		g.drawImage(Tetris, 0, 0, null);
		
		// Nächsten Stein zeichen
		
		// Gehaltenen Stein zeichnen
		
		// Spielfeld zeichnen
		int x = 0;
		int y = 0;
		
		for(int i = 0; i < spielfeld.length; i++) {
			for(int o = 0; o < spielfeld[i].length; o++) {
			//	System.out.println(spielfeld[i][o]);
				if(spielfeld[i][o] != 0) {
					g.drawImage(roterStein, x, y, null);
				}
				x += 32;
			}
			y += 32;
			x = 0;
		}
		
		
	}
	
	public void updateReihe(int reihe, int[] data) {
		spielfeld[reihe] = data;
	}
	
	
	
	private void update() {
        String textSpielfeld = "";
        for(int i = 0; i < spielfeld.length; i++) {
                for(int q = 0; q < spielfeld[i].length; q++) {
                        if(spielfeld[i][q] == 0) textSpielfeld = textSpielfeld + " ";
                        else textSpielfeld = textSpielfeld + spielfeld[i][q];
                }
                textSpielfeld += "\n";
        }
       
        
}
	
}
