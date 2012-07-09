package de.gympu.q11.tetris.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Zeichenpanel extends JPanel {
	
	private BufferedImage roterStein;
	
	private int[][] naechsterStein;
	
	
	private int[][] spielfeld;
	
	public Zeichenpanel() {
		spielfeld = new int[20][10];
		try {
			roterStein = ImageIO.read(new File("Stein Rot.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		spielfeld[0][5] = 1;
		spielfeld[2][4] = 1;
	}
	
	
	public void paint(Graphics g) {
		// Hintergrund zeichnen
		
		// Nächsten Stein zeichen
		
		// Gehaltenen Stein zeichnen
		
		// Spielfeld zeichnen
		
		int x = 0;
		int y = 0;
		
		for(int i = 0; i < spielfeld.length; i++) {
			for(int o = 0; o < spielfeld[i].length; o++) {
				System.out.println(spielfeld[i][o]);
				if(spielfeld[i][o] != 0) {
					g.drawImage(roterStein, x, y, null);
				}
				x += 40;
			}
			y += 40;
			x = 0;
		}
		

	}
	
	public void updateReihe(int reihe, int[] data) {
		spielfeld[reihe] = data;
	}

}
