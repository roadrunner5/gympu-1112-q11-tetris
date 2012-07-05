package Testpackage;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Zeichenpanel extends JPanel {
	
	public File datei;
	public Zeichenpanel(File f) {
		datei = f;
	}

	
	public void paint(Graphics g) {
		Image img;
		try {
			img = ImageIO.read(datei);
			g.drawImage(img, 50,50, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}}


