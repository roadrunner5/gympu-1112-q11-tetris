package de.gympu.q11.tetris.view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import de.gympu.q11.tetris.controller.TetrisController;

public class TetrisKeyListener implements KeyListener {
	private TetrisController controler;
	
	public TetrisKeyListener(TetrisController c) {
		this.controler = c;
	}
	
	public void keyPressed(KeyEvent arg0) {
//		System.out.println("keyP");
		int code = arg0.getKeyCode();
		
		if(code == KeyEvent.VK_LEFT) {
			System.out.println("links");
			this.controler.links();
		}
		
		if(code == KeyEvent.VK_RIGHT) {
			System.out.println("rechts");
			this.controler.rechts();
		}
		
		if(code == KeyEvent.VK_SPACE) {
			this.controler.gegenUhrzeigerSinnDrehen();
		}
		
		
	}

	public void keyReleased(KeyEvent arg0) {
//		System.out.println("keyR");
	}

	public void keyTyped(KeyEvent arg0) {
//		System.out.println("keyT");
	}

}
