package de.gympu.q11.tetris.starter;

import de.gympu.q11.tetris.view.TetrisGUI;
import de.gympu.q11.tetris.view.TetrisView;

public class GymPuTetrisGUI {
	
	private TetrisGUI view;
	
	public static boolean isDebug = false;
	
	
	public GymPuTetrisGUI() {
		view = new TetrisGUI();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		if(args.length > 0) {
			if(args[0].equals("-D")) {
				isDebug = true;
			}
		}
		new GymPuTetrisGUI();
	}

}
