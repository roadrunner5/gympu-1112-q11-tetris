package Lösungen.Aufgabe1;

public class Getraenkeautomat {
	private double guthaben = 0.0;
	
	public Getraenkeautomat() {
		
	}
	
	public void muenzeEinwerfen(Muenze m) {
		guthaben += m.getWert();
	}
	
	public Getraenk Cola() {
		if(guthaben >= 2.00) {
			guthaben = 0;
			return new Getraenk("Cola");
		}
		else {
			return null;
		}
	}
	
	public Getraenk Wasser() {
		if(guthaben >= 1.00) {
			guthaben = 0;

			return new Getraenk("Wasser");
		}
		else {
			return null;
		}
	}
	
	public Getraenk Fanta() {
		if(guthaben >= 2.00) {
			guthaben = 0;

			return new Getraenk("Fanta");
		}
		else {
			return null;
		}
	}
}
