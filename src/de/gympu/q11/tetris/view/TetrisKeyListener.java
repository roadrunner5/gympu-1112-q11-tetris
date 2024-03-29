package de.gympu.q11.tetris.view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import de.gympu.q11.tetris.controller.TetrisController;

public class TetrisKeyListener implements KeyListener {
        private TetrisController controler;
        Musik m = new Musik();
        
        public TetrisKeyListener(TetrisController c) {
                this.controler = c;
        }
        
        public void keyPressed(KeyEvent arg0) {
//              System.out.println("keyP");
                int code = arg0.getKeyCode();
                
                if(code == KeyEvent.VK_LEFT) {
                       // System.out.println("links");
                        this.controler.links();
                }
                
                if(code == KeyEvent.VK_RIGHT) {
                        //System.out.println("rechts");
                        this.controler.rechts();
                }
                

		if(code == KeyEvent.VK_DOWN) {
			//System.out.println("unten");
			this.controler.unten();
		}		
		
		if(code == KeyEvent.VK_SPACE){
			//System.out.println("drehen");
			this.controler.uhrzeigerSinnDrehen();
			
		}
			
		if(code == KeyEvent.VK_S) {
			//System.out.println("absetzen");
			this.controler.absetzen();
		}
		
		if(code == KeyEvent.VK_P) {
			//System.out.println("pause");
			this.controler.pause();
			m.play();
		}	
		
		if(code == KeyEvent.VK_M) {
			//System.out.println("pause");
			m.play();
	        
		}
		
		if (code == KeyEvent.VK_ESCAPE) {
			System.exit(0);
		}
		
	
	}
        
        public void play() {
        	m.play();
        	
        }



        public void keyReleased(KeyEvent arg0) {
//              System.out.println("keyR");
        }

        public void keyTyped(KeyEvent arg0) {
//              System.out.println("keyT");
        }

}

