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

import de.gympu.q11.tetris.controller.TetrisController;

public class TetrisGUI  {
        
        private JFrame fenster;
        private Zeichenpanel zeichenPanel;
        
        private int[][] daten;
        private TetrisController controller;
        private TetrisKeyListener keyListener;
        
        public TetrisGUI() {
                this.controller = new TetrisController();       // Erzeugt auch ein Model
                
                
                fenster = new JFrame();
                fenster.setSize(800, 700);
                fenster.setResizable(false);
                fenster.setLocation(200, 50);
                
                daten = new int[20][10];
                
                zeichenPanel = new Zeichenpanel();
                fenster.getContentPane().add(zeichenPanel);
                
                keyListener = new TetrisKeyListener(controller);
                zeichenPanel.addKeyListener(keyListener);
                
//                this.controller.getModel().setView(this);       // Dem Model die View mitteilen
//                this.controller.starten();
                
                Musik m = new Musik();
                m.play();
               
        }
        
        public void updateReihe(int reihenNummer, int[] daten) {
                this.daten[reihenNummer] = daten;
                zeichenPanel.updateReihe(reihenNummer, daten);
                zeichenPanel.repaint();
        }
        

		public int[][] getDaten() {
			return daten;
		}

		private void update() {

                
        }

		public void setNextStein(int[][] stein) {
                 
        }
        
        public void setGehaltenerStein(int[][] stein) {
                      
        }
        


}

