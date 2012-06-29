package de.gympu.q11.tetris.controller;

public class TaktGeber extends Thread {
	private TetrisController controller;
	private long sleeptime;
	private boolean isRunning = false;
	
	public TaktGeber(TetrisController c, long sleeptime) {
		this.controller = c;
		this.sleeptime = sleeptime;
	}
	
	public void run() {
		while(isRunning) {
			try {
				Thread.sleep(sleeptime);
			} catch (InterruptedException e) {	}
			controller.takt();
		}
	}
	
	public void starten() {
		this.isRunning = true;
		start();
	}
	
	public void stoppen() {
		this.isRunning = false;
	}
	
	public void setSleepTime(long t) {
		this.sleeptime = t;
	}

	public boolean isRunning() {
		return isRunning;
	}
}
