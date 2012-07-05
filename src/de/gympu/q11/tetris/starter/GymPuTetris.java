package de.gympu.q11.tetris.starter;

import de.gympu.q11.tetris.view.TetrisView;

public class GymPuTetris {
	
	private TetrisView view;
	
	public static boolean isDebug = false;
	
	
	public GymPuTetris() {
		view = new TetrisView();
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
		new GymPuTetris();
	}

}
