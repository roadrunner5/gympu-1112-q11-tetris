package Aufgabe3;

public class Taktgeber extends Thread {
	private Ampelsteuerung a;
	public Taktgeber(Ampelsteuerung a) {
		this.a = a;
		
		this.start();
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				a.takt();				
			} catch (InterruptedException e) {
			}
		}
	}
}
