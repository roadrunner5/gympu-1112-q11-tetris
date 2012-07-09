package de.gympu.q11.tetris.view;

import java.awt.BorderLayout;
import java.io.File;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.w3c.dom.stylesheets.LinkStyle;

import Testpackage.Zeichenpanel;

import de.gympu.q11.tetris.controller.TetrisController;

public class TetrisView  {
        
        private JFrame fenster;
        private JTextArea spiel;
        private JTextArea nextStein;
        
        private int[][] daten;
        private TetrisController controller;
        private TetrisKeyListener keyListener;
        
        public TetrisView() {
                this.controller = new TetrisController();       // Erzeugt auch ein Model

                
                fenster = new JFrame();
                fenster.setSize(800, 700);
                fenster.setResizable(false);
                fenster.setLocation(200, 50);
                
                daten = new int[20][10];
                
                
                spiel = new JTextArea(18, 11);
                spiel.setFont(Font.decode("Courier New-bold-25"));
                spiel.setEditable(false);
                // spiel.setText("__________");
                
                nextStein = new JTextArea(18, 5);
                nextStein.setFont(Font.decode("Courier New-bold-25"));
                nextStein.setEditable(false);
                nextStein.setText("Next\n\n\n\n\nSave\n\n\n\n\n");
                
                fenster.getContentPane().setLayout(new BorderLayout());
                
                JPanel linkeSeite = new JPanel();
                JPanel rechteSeite = new JPanel();
                
                linkeSeite.add(spiel);
                rechteSeite.add(nextStein);
                
                fenster.getContentPane().add(linkeSeite, BorderLayout.WEST);
                fenster.getContentPane().add(rechteSeite, BorderLayout.EAST);
                
                fenster.pack();
                fenster.setVisible(true);
                fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                keyListener = new TetrisKeyListener(controller);
                spiel.addKeyListener(keyListener);
                
                this.controller.getModel().setView(this);       // Dem Model die View mitteilen
                this.controller.starten();
                
                Musik m = new Musik();
                m.play();
               
        }
        
        public void updateReihe(int reihenNummer, int[] daten) {
                this.daten[reihenNummer] = daten;
                update();
        }
        
        

		public int[][] getDaten() {
			return daten;
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

