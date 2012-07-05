package Lösungen.Aufgabe3;

public class Ampel {
	private int phase;
	
	private Lampe rot;
	private Lampe gelb;
	private Lampe gruen;
	

	public Ampel(int nummer) {
		this.phase = 1;
		
		rot = new Lampe("a" + nummer + "r");
		gelb = new Lampe("a" + nummer + "ge");
		gruen = new Lampe("a" + nummer + "gr");
		
		rot.einschalten();		// Rote Phase am Anfang
		
	}
	
	public void weiterschalten() {
		if(phase == 1) {
			rot.einschalten();
			gelb.einschalten();
			gruen.ausschalten();
			phase = 2;
		}
		else if(phase == 2) {
			rot.ausschalten();
			gelb.ausschalten();
			gruen.einschalten();
			phase = 3;
		}
		else if(phase == 3) {
			rot.ausschalten();
			gelb.einschalten();
			gruen.ausschalten();
			phase = 4;
		}
		else if(phase == 4) {
			rot.einschalten();
			gelb.ausschalten();
			gruen.ausschalten();
			phase = 1;
		}
	}

}
