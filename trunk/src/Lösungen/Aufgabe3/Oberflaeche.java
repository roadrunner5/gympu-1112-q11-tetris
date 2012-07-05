package Aufgabe3;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Oberflaeche {
	
	private static Lampe a1r = new Lampe(Color.red);
	private static Lampe a1ge = new Lampe(Color.yellow);
	private static Lampe a1gr = new Lampe(Color.green);
	
	private static Lampe a2r = new Lampe(Color.red);
	private static Lampe a2ge = new Lampe(Color.yellow);
	private static Lampe a2gr = new Lampe(Color.green);
	
	private static boolean istVorbereitet = false;
	
	private static JFrame fenster = new JFrame("Ampel");
	
	
	
	private Oberflaeche() {		// Keine Objekte!
	}
	
	public static void vorbereiten() {
		if(!istVorbereitet) {
			fenster.setSize(180, 180);
			fenster.setLayout(null);
			
			fenster.add(a1r);
			a1r.setBounds(20, 20, 23, 23);
			
			fenster.add(a1ge);
			a1ge.setBounds(20, 50, 23, 23);
			
			fenster.add(a1gr);
			a1gr.setBounds(20, 80, 23, 23);
			
			
			fenster.add(a2r);
			a2r.setBounds(100, 20, 23, 23);
			
			fenster.add(a2ge);
			a2ge.setBounds(100, 50, 23, 23);
			
			fenster.add(a2gr);
			a2gr.setBounds(100, 80, 23, 23);
			
			istVorbereitet = true;
			
			fenster.setVisible(true);
			
			fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
	
	public static void einschalten(String lampe) {
		if(lampe.equals("a1r")) {
			a1r.einschalten();
		}
		else if(lampe.equals("a1ge")) {
			a1ge.einschalten();
		}
		else if(lampe.equals("a1gr")) {
			a1gr.einschalten();
		}
		else if(lampe.equals("a2r")) {
			a2r.einschalten();
		}
		else if(lampe.equals("a2ge")) {
			a2ge.einschalten();
		}
		else if(lampe.equals("a2gr")) {
			a2gr.einschalten();
		}
		fenster.repaint();
	}
	
	public static void ausschalten(String lampe) {
		if(lampe.equals("a1r")) {
			a1r.ausschalten();
		}
		else if(lampe.equals("a1ge")) {
			a1ge.ausschalten();
		}
		else if(lampe.equals("a1gr")) {
			a1gr.ausschalten();
		}
		else if(lampe.equals("a2r")) {
			a2r.ausschalten();
		}
		else if(lampe.equals("a2ge")) {
			a2ge.ausschalten();
		}
		else if(lampe.equals("a2gr")) {
			a2gr.ausschalten();
		}
		fenster.repaint();
	}
	
	private static class Lampe extends JPanel {
		private Color farbe;
		private boolean istAn = false;
		
		public Lampe(Color farbe) {
			this.farbe = farbe;
		}
		
		public void einschalten() {
			this.istAn = true;
			// this.repaint();
		}
		
		public void ausschalten() {
			this.istAn = false;
			// this.repaint();
		}
		
		public void paint(Graphics g) {
	        Graphics2D g2 = (Graphics2D)g;
	        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	        g2.setStroke(new BasicStroke(2f));

	        
			g2.setColor(farbe);
			
			if(istAn) {
				g2.fillOval(0, 0, 18, 18);
			}
			else {
				g2.drawOval(0, 0, 18, 18);
			}
		}
	}
	
}
