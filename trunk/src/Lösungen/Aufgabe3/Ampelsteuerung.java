package Aufgabe3;

public class Ampelsteuerung {
	private Ampel ampel1 = new Ampel(1);
	private Ampel ampel2 = new Ampel(2);
	
	private Taktgeber t;
	
	private int zaehler = 0;
	private int phase = 1;
	
	/**
	 * Phasen:
	 * 
	 * Nr		Ampel1		Ampel2		Dauer
	 * 1		rot			gruen		3
	 * 2		rot			gelb		1
	 * 3		rot			rot			2
	 * 4		rotgelb		rot			1
	 * 5		gruen		rot			3
	 * 6		gelb		rot			1
	 * 7		rot			rot			2
	 * 8		rot			rotgelb		1
	 */
	
	public Ampelsteuerung() {
		Oberflaeche.vorbereiten();
		ampel2.weiterschalten();
		ampel2.weiterschalten();	// Ampel2 auf gruen schalten
		t = new Taktgeber(this);
	}
	
	public void takt() {
		zaehler++;
		weiterschaltenPruefen();
	}
	
	private void weiterschaltenPruefen() {
		if(phase == 1 && zaehler == 3) {
			zaehler = 0;
			phase = 2;
			ampel2.weiterschalten();	
		}
		else if(phase == 2 && zaehler == 1) {
			zaehler = 0;
			phase = 3;
			ampel2.weiterschalten();	
		}
		else if(phase == 3 && zaehler == 2) {
			zaehler = 0;
			phase = 4;
			ampel1.weiterschalten();	
		}
		else if(phase == 4 && zaehler == 1) {
			zaehler = 0;
			phase = 5;
			ampel1.weiterschalten();	
		}
		else if(phase == 5 && zaehler == 3) {
			zaehler = 0;
			phase = 6;
			ampel1.weiterschalten();	
		}
		else if(phase == 6 && zaehler == 1) {
			zaehler = 0;
			phase = 7;
			ampel1.weiterschalten();	
		}
		else if(phase == 7 && zaehler == 2) {
			zaehler = 0;
			phase = 8;
			ampel2.weiterschalten();	
		}
		else if(phase == 8 && zaehler == 1) {
			zaehler = 0;
			phase = 1;
			ampel2.weiterschalten();	
		}
	}
}
