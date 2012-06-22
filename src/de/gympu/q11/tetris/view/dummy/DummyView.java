package de.gympu.q11.tetris.view.dummy;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DummyView {
	private JFrame fenster;
	private JTextArea spiel;
	private JTextArea nextStein;
	
	private int[][] daten;
	
	public DummyView() {
		fenster = new JFrame();
		fenster.setSize(300, 600);
		fenster.setResizable(false);
		fenster.setLocation(2500, 100);
		
		daten = new int[20][10];
		
		
		spiel = new JTextArea(18, 10);
		spiel.setEditable(false);
		
		nextStein = new JTextArea(18, 4);
		nextStein.setEditable(false);
		
		fenster.getContentPane().setLayout(new BorderLayout());
		
		JPanel linkeSeite = new JPanel();
		JPanel rechteSeite = new JPanel();
		
		linkeSeite.add(spiel);
		rechteSeite.add(nextStein);
		
		fenster.getContentPane().add(linkeSeite, BorderLayout.WEST);
		fenster.getContentPane().add(rechteSeite, BorderLayout.EAST);
		
		
		fenster.setVisible(true);
		
	}
	
	
	public void updateReihe(int reihenNummer, int[] daten) {
		this.daten[reihenNummer] = daten;
		update();
	}
	
	private void update() {
		String textSpielfeld = "";
		for(int i = 0; i < daten.length; i++) {
			for(int q = 0; q < daten[i].length; q++) {
				textSpielfeld = textSpielfeld + daten[i][q];
			}
			textSpielfeld += "\n";
		}
		spiel.setText(textSpielfeld);
	}
	
	public static void main(String[] e) {
		DummyView view = new DummyView();
		view.updateReihe(4, new int[] {
			3,3,3,3,3,3,3,3,3,3	
		});
		
		for(int t = 0; t < 20; t++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			int z = t % 2;
			view.updateReihe(t, new int[] {
					z,z,z,z,z,z,z,z,z,z	
			});
		}
		
	}
}
